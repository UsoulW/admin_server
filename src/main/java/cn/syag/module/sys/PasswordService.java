package cn.syag.module.sys;

import cn.syag.common.MD5Util;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by syag on 2022/2/11 15:01
 */
@Component
public class PasswordService {
    @Value("${admin.pkey}")
    private String pkey;

    public String encryptionPassword(String password){
        return MD5Util.stringToMD5(password+pkey);
    }
}
