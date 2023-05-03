package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import repository.cursRepository;
import service.cursService;

@Configuration
public class AppConfig {

    @Bean("cursRepositori")
    public cursRepository getCursRepository() {
        return new cursRepository();
    }

    @Bean("cursService")
    public cursService getCursService() {
//		return new cursService();
        return new cursService(getCursRepository());
    }
}
