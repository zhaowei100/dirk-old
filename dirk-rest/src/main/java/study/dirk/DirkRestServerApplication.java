package study.dirk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class DirkRestServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DirkRestServerApplication.class, args);
	}
}
