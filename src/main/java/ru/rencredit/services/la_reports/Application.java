package ru.rencredit.services.la_reports;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import ru.rencredit.services.toolkit.ImportCommonConfig;

@ImportCommonConfig
@ComponentScan({"ru.rencredit.services.handler", "ru.rencredit.services.client"})
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}