import com.bdqn.service.impl.StudentBiz;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public ApplicationContext ctx;
    {
        ctx=new ClassPathXmlApplicationContext("classpath:SrpingDB.xml");
    }
    @Test
    public void Text1(){
        StudentBiz sb= (StudentBiz) ctx.getBean("studentBiz");
        System.out.println(sb.getAll());
    }
}
