package spring.carlog.dao;

import java.util.Map;

public interface CarLogDao {
	
	public int writeRefuelProc(Map<String, Object> paramMap);
	
	public int writeRepairProc(Map<String, Object> paramMap);
	
}
