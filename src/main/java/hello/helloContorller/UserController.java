package hello.helloContorller;
import org.springframework.web.bind.annotation.*;
import hello.dataMode.User;

/**
 * Created by Administrator on 2017/11/20.
 */
@RestController
@RequestMapping("/")
public class UserController {
    @RequestMapping("/User")
    public User testJson() {
        User user = new User();
        user.setName("lijia");
        user.setAge(27);
        user.setAddress("北京");
        return user;
    }

}