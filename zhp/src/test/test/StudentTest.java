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
    public void test(){
        //System.out.println(service.findAll());
        //service.add(new StudentEntity("腊肉","156454646"));
        //service.delById(6);
        service.update(5,"111");
    }

}
