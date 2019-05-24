package study.dirk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RefreshScope
@RestController
public class DirkRestController 
{
	@Value("${server.port}")
	private String value;
	
	@RequestMapping("config/get")
    public String getConfig()
    {
        return value;
    }
}
