import com.project.entity.StudentEntity;
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
    public void  test(){

        //service.addStudent(new StudentEntity("测试name","测试tel"));
        //service.delStudentById(8);
       // service.updateTelById(7,"测试tel");
       // System.out.println(service.findAllStudentList());;
    }

}
