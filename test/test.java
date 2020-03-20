import com.spartajet.fxboot.demo.MainController;
import com.spartajet.fxboot.demo.Service.HeroService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = MainController.class)
public class test {

    @Autowired
    private HeroService heroService;

    @Test
    public void test1() {
        System.out.println(heroService.findHero(101));
    }
}
