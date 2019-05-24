package study.dirk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class DirkZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DirkZuulServerApplication.class, args);
	}
}
