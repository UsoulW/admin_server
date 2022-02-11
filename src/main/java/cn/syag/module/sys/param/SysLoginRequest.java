package cn.syag.module.sys.param;

import lombok.Data;

/**
 * Created by syag on 2022/2/11 14:29
 */
@Data
public class SysLoginRequest {
    private String account;
    private String password;
    private String code;
}
