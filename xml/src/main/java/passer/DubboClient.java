package passer;

import com.passer.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhouwenhua02
 * @date 2021/3/13
 */
public class DubboClient {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService.getUser());
    }
}
