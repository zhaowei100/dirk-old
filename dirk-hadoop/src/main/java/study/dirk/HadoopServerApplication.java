package study.dirk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HadoopServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HadoopServerApplication.class, args);
	}
}
