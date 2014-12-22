package spring.carlog.service;

import java.util.Map;

import spring.carlog.dao.CarLogDao;

public class CarLogServiceImpl implements CarLogService {
	
	private CarLogDao carLogDao ;
	
	public void setCarLogDao(CarLogDao carLogDao) {
		this.carLogDao = carLogDao;
	}
	
	@Override
	public int writeRefuelProc(Map<String, Object> paramMap) {
		return carLogDao.writeRefuelProc(paramMap);
	}

	@Override
	public int writeRepairProc(Map<String, Object> paramMap) {
		return carLogDao.writeRepairProc(paramMap);
	}
	
}
