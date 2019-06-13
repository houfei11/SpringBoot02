package com.imooc.boot_demo;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("sss","0");
        Integer sss = Integer.parseInt(map.get("sss"));
        // Integer 类型判空
        if (null == sss){
            System.out.println("Integer 为空");
            return ;
        }
        System.out.println(sss);
        // String 类型判空
        String str = "";
        if (str == null){
            System.out.println(str + "str 为空字符串");
        }
        if ("".equals(str)){
            System.out.println(str + "str 为空字符串");
        }
        if (str.length() <= 0){
            System.out.println(str + "str 长度为0");
        }
        if (str.isEmpty()){
            System.out.println(str + "str 长度为0  ++");
        }
        // 对象判空
        if (StringUtils.isEmpty(str)){
            System.out.println(str + "str 为空zifuchuan");
        }
        // 集合判空
        List<String> list = new ArrayList<String>();
        if (CollectionUtils.isEmpty(list)){
            System.out.println("我是一个空集合");
        }
        System.out.println("不是空集合");
        if (list != null && list.isEmpty()){
            System.out.println("我是一个空集合001");
        }
        System.out.println(list.isEmpty());
        System.out.println(list.toString());
        System.out.println(list.size());
        // Map类型
        Map<String, String> map1 =new HashMap<>();
        if(map1.isEmpty() && map1.size()== 0){
            System.out.println(map1.isEmpty());
            System.out.println(map1.size());
            System.out.println("map  是一个空集合");
        }
    }
}
