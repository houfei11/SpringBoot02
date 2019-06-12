package com.imooc.boot_demo;

import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.get("aa");

        String aa = String.valueOf(map.get("aa"));

        System.out.println(aa);

        Integer of = Integer.valueOf(map.get("aa"));

        System.out.println(of);
    }
}
