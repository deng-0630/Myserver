import com.bdqn.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Text01 {
    @Test
    public void getAll(){
        try {
            InputStream stream= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory=builder.build(stream);
            SqlSession sqlsess=sqlSessionFactory.openSession();
            List<Student> getStudent = sqlsess.selectList("stu.getStudent");
            System.out.println(getStudent.size());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

}
