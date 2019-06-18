package com.tg.shop.auth.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tg.shop.auth.dao.MemberDao;
import com.tg.shop.auth.mapper.MemberMapper;
import com.tg.shop.auth.service.MemberService;
import com.tg.shop.core.domain.auth.entity.Member;
import com.tg.shop.core.domain.auth.form.LoginForm;
import com.tg.shop.core.generator.IdGenerator;
import com.tg.shop.core.utils.RedisUtil;
import com.tg.shop.core.utils.RegexUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.Assert;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Author: tg
 * @Date: 2019/3/7 16:00
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private IdGenerator idGenerator;

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private MemberDao memberDao;

    @Override
    public String login(LoginForm loginForm) {
        Assert.notNull(loginForm.getLoginName(),"登录名不能为空");
        String loginName = loginForm.getLoginName();
        String key = RedisUtil.PRE_KEY_MEMBER+loginName;
        String token = (String) redisTemplate.opsForValue().get(key);
        if(token==null){
            // db查询
            Member member = memberDao.findMemberByLoginName(loginName);
            if(member!=null){
                token =  UUID.randomUUID().toString().replaceAll("-","");
                redisTemplate.opsForValue().set(key,token,7, TimeUnit.DAYS);
                redisTemplate.opsForValue().set(token,member,7,TimeUnit.DAYS);
            }
        }
        return token;
    }

    @Override
    public boolean logout(String loginName) {
        Assert.notNull(loginName,"登录名为空");
        String key = RedisUtil.PRE_KEY_MEMBER+loginName;
        String token = (String) redisTemplate.opsForValue().get(key);
        if(token!=null){
            redisTemplate.delete(token);
            redisTemplate.delete(loginName);
            return true;
        }
        return false;
    }

    @Override
    public String registerByPhone(LoginForm loginForm) {
        Assert.notNull(loginForm.getLoginName(),"注册手机不能为空.");
        Assert.notNull(loginForm.getPassword(),"注册密码不能为空.");
        String loginName = loginForm.getLoginName();
        // redis 防止超时重试  2. 数据库添加唯一索引
        String keyRegisterPhone = "registerPhone-"+loginName;
        String registerValue = stringRedisTemplate.opsForValue().get(keyRegisterPhone);
        if(registerValue!=null){
            return null;
        }
        stringRedisTemplate.opsForValue().set(keyRegisterPhone,loginName,30, TimeUnit.SECONDS);

        Member member = memberDao.findMemberByLoginName(loginName);
        if (member!=null){
            return "用户名/手机号已存在.";
        }
        member = new Member();
        member.setMemberId(idGenerator.nextStringId());
        if(RegexUtil.isMobile(loginName)){
            member.setPhone(loginName);
        }
        member.setLoginName(loginName);
        String md5pwd = DigestUtils.md5DigestAsHex(loginForm.getPassword().getBytes());
        member.setPassword(md5pwd);
        member.setCreateTime(new Date());
        member.setCreator(loginForm.getLoginName());
        member.setNickName(loginForm.getLoginName());
        int result = memberMapper.insertSelective(member);
        stringRedisTemplate.delete(keyRegisterPhone);
        return null;
    }


}
