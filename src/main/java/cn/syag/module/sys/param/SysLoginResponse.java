package cn.syag.module.sys.param;

import cn.syag.db.entity.SysUser;
import lombok.Data;

/**
 * Created by syag on 2022/2/11 14:29
 */
@Data
public class SysLoginResponse {
    private int uid;
    private String account;
    public static SysLoginResponse valueOf(SysUser sysUser){
        SysLoginResponse response=new SysLoginResponse();
        response.setUid(sysUser.getUid());
        response.setAccount(sysUser.getAccount());
        return response;
    }
}
