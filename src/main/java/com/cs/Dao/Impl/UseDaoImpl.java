package com.cs.Dao.Impl;

import com.cs.Dao.UseDao;
import com.cs.entry.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.InputStream;
import java.util.List;

/**
 * @author yn
 * @version 1.0
 * @date 2020/4/29 11:57
 */
public class UseDaoImpl implements UseDao {
    public List<User> findAll() throws Exception {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //传统写法
        List<User> list = sqlSession.selectList("userMapper.findAll");

        sqlSession.close();
        return list;
    }
}
