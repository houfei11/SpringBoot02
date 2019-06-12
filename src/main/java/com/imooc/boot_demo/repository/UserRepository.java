package com.imooc.boot_demo.repository;


import com.imooc.boot_demo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class UserRepository {

    /**
     * 采用内存型的存储方式 —> Map
     */

    private  final ConcurrentMap<Integer,User> repository = new ConcurrentHashMap<>();

    private final static AtomicInteger idGenerator = new AtomicInteger();

    /**
     * 保存用户对象
     * @return 保存成功，返回true
     */
    public boolean save(User user){
        boolean success = false;
        // ID 从 1 开始
        Integer id = idGenerator.incrementAndGet();

        // 设置ID
        user.setId(id);

        return repository.put(id, user) == null;
    }

}