package cn.syag.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("sys_user")
public class SysUser implements Serializable {
    private static final long serialVersionUID = 4599185144112845163L;
    private int uid;
    private String account;
    private String password;
    private int creatorId;
    private LocalDateTime createTime;
}
