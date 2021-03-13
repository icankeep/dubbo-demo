import com.passer.config.DubboServerConfig;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboServer {
    public static void main(String[] args) throws BeansException, IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboServerConfig.class);
        context.start();
        System.in.read();
    }
}
