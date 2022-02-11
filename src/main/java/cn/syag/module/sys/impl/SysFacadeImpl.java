package cn.syag.module.sys.impl;

import cn.syag.common.Result;
import cn.syag.common.TResult;
import cn.syag.db.entity.SysUser;
import cn.syag.db.mapper.SysUserMapper;
import cn.syag.module.sys.PasswordService;
import cn.syag.module.sys.SysFacade;
import cn.syag.module.sys.param.SysAddUserRequest;
import cn.syag.module.sys.param.SysLoginRequest;
import cn.syag.module.sys.param.SysLoginResponse;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by syag on 2022/2/11 12:31
 */
@Service
public class SysFacadeImpl implements SysFacade {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private PasswordService passwordService;

    @Override
    public TResult<SysLoginResponse> login(SysLoginRequest request) {
        String encryptionPassword = passwordService.encryptionPassword(request.getPassword());
        QueryWrapper<SysUser> qw=new QueryWrapper<>();
        qw.eq("account",request.getAccount());
        qw.eq("password",encryptionPassword);
        SysUser one = sysUserMapper.selectOne(qw);
        if (one==null){
            return TResult.fail();
        }
        return TResult.ofNullable(SysLoginResponse.valueOf(one));
    }

    @Override
    public Result create(SysAddUserRequest request) {
        return null;
    }

    @Override
    public Result delete(int id) {
        return null;
    }

    @Override
    public Result updatePassword(int id, String password) {
        return null;
    }
}
