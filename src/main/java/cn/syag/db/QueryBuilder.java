package cn.syag.db;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * Created by syag on 2022/2/11 15:05
 */
public class QueryBuilder<T> {
    public static <T> QueryWrapper build(){
        return new QueryWrapper<T>();
    }
}
