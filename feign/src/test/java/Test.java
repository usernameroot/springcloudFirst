import com.wy.Application;
import com.wy.service.ApiService;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author WangYing
 * @create 2019-04-11-16:27
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class Test {

    @Resource
    private ApiService as;

    @org.junit.Test
    public void test() {
        System.out.println(as.index());

    }

    @org.junit.Test
    public void test01() {
        System.out.println(as.index());

    }

    @org.junit.Test
    public void test02() {
        System.out.println(as.index());

    }

}
