package study.dirk;

import java.util.List;

import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.client.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.hadoop.hbase.HbaseTemplate;
import org.springframework.data.hadoop.hbase.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
@RequestMapping()
public class HadoopRestController {

	@Autowired
	private HbaseTemplate hbaseTemplate;

	@RequestMapping("hbase/test")
	public String putTest() throws Exception {
		String tableName = "hadoop_test";
		String rowName = "abc";
		String familyName = "zhao";
		String qualifier = "test";

		hbaseTemplate.put(tableName, rowName, familyName, qualifier, "just test".getBytes());
		return hbaseTemplate.get(tableName, rowName, familyName, qualifier, new RowMapper<String>() {

			@Override
			public String mapRow(Result result, int rowNum) throws Exception {
				List<Cell> ceList = result.listCells();
				if (ceList != null && ceList.size() > 0) {
					for (Cell cell : ceList) {
						return cell.getValue().toString();
					}
				}
				return "";
			}
		});
	}
	
	@RequestMapping("hbase/get")
	public String getTest() throws Exception {
		String tableName = "hadoop_test";
		String rowName = "abc";
		String familyName = "zhao";
		String qualifier = "test";
		return hbaseTemplate.get(tableName, rowName, familyName, qualifier, new RowMapper<String>() {

			@Override
			public String mapRow(Result result, int rowNum) throws Exception {
				List<Cell> ceList = result.listCells();
				if (ceList != null && ceList.size() > 0) {
					for (Cell cell : ceList) {
						return cell.getValue().toString();
					}
				}
				return "";
			}
		});
	}
}
