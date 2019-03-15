package springboot_mybatis_thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "springboot_mybatis_thymeleaf")
@ServletComponentScan(basePackages = "springboot_mybatis_thymeleaf.filter")
@MapperScan("springboot_mybatis_thymeleaf.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
