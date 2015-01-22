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
		return carLogDao.writeRefuelProc(paramMap);
	}
	
	@Override
	public int writeRefuelProc2(Refuel refuel) {
		
		Refuel preRefuel = getPreRefuelInfo() ;
		
		//현재 주행거리 = 현재 총주행거리 - 이전 총주행거리
		int curr_distance = refuel.getDistance() - preRefuel.getDistance() ;
		
		//연비 = 현재 주행거리 / 이전 주유량
		float fuel_eff_rate = curr_distance / preRefuel.getGas_liter() ; 
		
		refuel.setPre_refuel_distance(curr_distance);
		refuel.setFuel_eff_rate(fuel_eff_rate);
		
		System.out.println("refuel.toString() : "+refuel.toString());
		
		return carLogDao.writeRefuelProc2(refuel);
	}
	
	@Override
	public int writeRefuelProc3(Refuel refuel) {
		
		return carLogDao.writeRefuelProc2(refuel);
	}
	
	
	@Override
	public Refuel getPreRefuelInfo(){
		return carLogDao.getPreRefuelInfo() ;
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
