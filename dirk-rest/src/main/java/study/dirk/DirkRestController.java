package study.dirk;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * Hello world!
 *
 */
@RefreshScope
@RestController
public class DirkRestController {
	@Value("${server.port}")
	private String value;

	@RequestMapping("config/get")
	@HystrixCommand(fallbackMethod = "fallback")
	public String getConfig() throws Exception {
		Random rand = new Random();
        //模拟错误百分比(方式比较粗鲁但可以证明问题)
        if (1 == rand.nextInt(2)) {
//            System.out.println("make exception");
            throw new Exception("make exception");
        }
		return value;
	}

	@RequestMapping("config/get2")
	@HystrixCommand(fallbackMethod = "fallback")
	public String getConfig2() throws Exception {
		Random rand = new Random();
        //模拟错误百分比(方式比较粗鲁但可以证明问题)
        if (1 == rand.nextInt(2)) {
//            System.out.println("make exception");
            throw new Exception("make exception");
        }
		return value;
	}
	
	public String fallback() {
		return "hystrix fallback";
	}
}
