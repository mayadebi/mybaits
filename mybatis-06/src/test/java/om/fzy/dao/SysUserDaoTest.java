package om.fzy.dao;

import com.fzy.dao.StudentMapper;
import com.fzy.entity.Student;
import com.fzy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;


public class SysUserDaoTest {
    @Test
    public void test() {
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        StudentMapper mapper = sqlsession.getMapper(StudentMapper.class);
        List<Student> studentAll = mapper.getStudentAll2();
        for (Student student : studentAll) {
            System.out.println(student.toString());
        }
        // 关闭
        sqlsession.close();
    }



}
