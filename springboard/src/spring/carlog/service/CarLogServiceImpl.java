package spring.carlog.service;

import java.util.HashMap;
import java.util.Map;

import spring.carlog.dao.CarLogDao;
import spring.carlog.vo.Refuel;

public class CarLogServiceImpl implements CarLogService {
	
	private CarLogDao carLogDao ;
	
	public void setCarLogDao(CarLogDao carLogDao) {
		this.carLogDao = carLogDao;
	}
	
	@Override
	public int writeRefuelProc(Map<String, Object> paramMap) {
		int preDistance = getPreDistance() ;
		int currentDistance = (int)paramMap.get("distance") ;
		int mileage = currentDistance - preDistance ;	//주행거리
		
		return carLogDao.writeRefuelProc(paramMap);
	}
	
	@Override
	public int writeRefuelProc2(Refuel refuel) {
		
		
		return carLogDao.writeRefuelProc2(refuel);
	}
	
	
	@Override
	public Refuel getPreRefuelInfo(){
		Refuel refuel = new Refuel() ;
		refuel = carLogDao.getPreRefuelInfo() ;
		return refuel ;
	}
	
	@Override
	public int getPreDistance(){
		return carLogDao.getPreDistance() ;
	}

	@Override
	public int writeRepairProc(Map<String, Object> paramMap) {
		return carLogDao.writeRepairProc(paramMap);
	}
	
	@Override
	public int writeParkingProc(Map<String, Object> paramMap) {
		return carLogDao.writeParkingProc(paramMap);
	}

	@Override
	public int writeTollProc(Map<String, Object> paramMap) {
		return carLogDao.writeTollProc(paramMap);
	}

	@Override
	public int writeEtcProc(Map<String, Object> paramMap) {
		return carLogDao.writeEtcProc(paramMap);
	}

	@Override
	public int writeInsuranceProc(Map<String, Object> paramMap) {
		return carLogDao.writeInsuranceProc(paramMap);
	}

	@Override
	public int writeTaxProc(Map<String, Object> paramMap) {
		return carLogDao.writeTaxProc(paramMap);
	}

	
}
