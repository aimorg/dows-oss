package org.dows.oss;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.dows.oss", "org.dows.rade.mock"})
public class OssApplication{
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure()
            .directory(System.getProperty("user.home"))
            .ignoreIfMissing()
            .load();
        dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));
        SpringApplication.run(OssApplication.class, args);
    }
}
