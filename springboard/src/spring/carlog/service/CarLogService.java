package spring.carlog.service;

import java.util.Map;

public interface CarLogService {
	
	public int writeRefuelProc(Map<String, Object> paramMap) ;
	
	public int writeRepairProc(Map<String, Object> paramMap) ;
	
	
}
