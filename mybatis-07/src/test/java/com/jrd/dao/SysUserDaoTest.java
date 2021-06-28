package com.jrd.dao;

import com.fzy.dao.TeacherMapper;
import com.fzy.entity.Teacher;
import com.fzy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;


public class SysUserDaoTest {
    @Test
    public void test() {
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        TeacherMapper mapper = sqlsession.getMapper(TeacherMapper.class);
        List<Teacher> teachaeAll = mapper.getTeachaeAll2();
        for (Teacher teacher : teachaeAll) {
            System.out.println(teacher.toString());
        }
        // 关闭
        sqlsession.close();
    }



}
