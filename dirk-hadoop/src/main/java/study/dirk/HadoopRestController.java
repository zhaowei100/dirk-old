package study.dirk;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.hadoop.hbase.HbaseTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * Hello world!
 *
 */
@RestController
public class HadoopRestController {

	@Autowired
	private HbaseTemplate hbaseTemplate;
	
	@RequestMapping("hbase/set")
	public String getConfig() throws Exception {
		hbaseTemplate.put(tableName, rowName, familyName, qualifier, value);
		return "";
	}
}
