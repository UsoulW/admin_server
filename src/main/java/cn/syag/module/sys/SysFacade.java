package cn.syag.module.sys;

import cn.syag.common.Result;
import cn.syag.common.TResult;
import cn.syag.module.sys.param.SysAddUserRequest;
import cn.syag.module.sys.param.SysLoginRequest;
import cn.syag.module.sys.param.SysLoginResponse;

/**
 * Created by syag on 2022/2/11 12:31
 */
public interface SysFacade {
    /**
     * 登录
     * @param request
     * @return
     */
    TResult<SysLoginResponse> login(SysLoginRequest request);
    /**
     * 添加用户
     * @param request
     * @return
     */
    Result create(SysAddUserRequest request);
    /**
     * 删除用户
     * @param id
     * @return
     */
    Result delete(int id);
    /**
     * 修改密码
     * @param id
     * @param password
     * @return
     */
    Result updatePassword(int id,String password);

}
