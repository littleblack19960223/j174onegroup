import com.project.bean.StudentBean;
import com.project.service.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class StudentTest {
    @Resource
    private IStudentService service;

    @Test
    public void testStudent(){
//        service.add(new StudentBean("kjfkjklsa","212354"));
//        System.out.println(service.findAll());
//        service.del(1);
        service.update(2,"fengshaojie","15555555555");
    }


}
