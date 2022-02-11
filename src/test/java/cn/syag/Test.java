package cn.syag;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by syag on 2022/2/11 14:55
 */
public class Test {
    public static void main(String[] args) {
        TreeMap<String,String> map=new TreeMap<>();
        map.put("20220101_2022-01-01 00:00:00","1");
        map.put("20220103_2022-01-03 00:00:00","3");
        map.put("20220102_2022-01-02 00:00:00","2");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.err.println(entry.getKey());
        }
    }
}
