
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import service.cursService;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        cursService servei = appContext.getBean("cursService",cursService.class);

        System.out.println(servei.list());

    }
}
