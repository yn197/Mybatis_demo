package com.cs.Dao;

import com.cs.entry.User;

import java.util.List;

/**
 * @author yn
 * @version 1.0
 * @date 2020/4/29 11:01
 */
public interface UseDao {
    List<User> findAll() throws Exception;
}
