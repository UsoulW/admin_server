package cn.syag.module.sys;

import cn.syag.common.TResult;
import cn.syag.module.sys.param.SysLoginRequest;
import cn.syag.module.sys.param.SysLoginResponse;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by syag on 2022/2/11 12:31
 */
@RequestMapping("/sys")
@RestController
public class SysController {
    @Autowired
    private SysFacade sysFacade;

    @PostMapping("/login")
    public TResult<SysLoginResponse> login(@RequestBody SysLoginRequest request){
        TResult<SysLoginResponse> login = sysFacade.login(request);
        System.err.println(JSON.toJSONString(login));
        return login;
    }
}
