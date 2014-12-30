package spring.carlog.service;

import java.util.Map;

public interface CarLogService {
	
	public int writeRefuelProc(Map<String, Object> paramMap) ;
	
	public int writeRepairProc(Map<String, Object> paramMap) ;
	
	public int writeParkingProc(Map<String, Object> paramMap) ;
	
	public int writeTollProc(Map<String, Object> paramMap) ;
	
	public int writeEtcProc(Map<String, Object> paramMap) ;
	
	public int writeInsuranceProc(Map<String, Object> paramMap) ;
	
	public int writeTaxProc(Map<String, Object> paramMap) ;
}
