import com.bdqn.dao.impl.StudentImpl;
import com.bdqn.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class Texter {
    public ApplicationContext ctx;
    {
        ctx=new ClassPathXmlApplicationContext("SrpingDB.xml");
    }
    @Test
    public void Text1(){

        Connection con= (Connection) ctx.getBean("conn");
        System.out.println(con);
    }
    @Test
    public void Text2(){
        StudentImpl student= (StudentImpl) ctx.getBean("studentImpl");
        System.out.println(student.getAll());

    }

}
