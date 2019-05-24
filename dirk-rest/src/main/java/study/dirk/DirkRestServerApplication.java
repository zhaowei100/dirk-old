package study.dirk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DirkRestServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DirkRestServerApplication.class, args);
	}
}
