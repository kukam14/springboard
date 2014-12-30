package spring.carlog.dao;

import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class CarLogDaoImpl extends SqlSessionDaoSupport implements CarLogDao {

	@Override
	public int writeRefuelProc(Map<String, Object> paramMap) {
		return getSqlSession().insert("main.writeRefuelProc", paramMap);
	}

	@Override
	public int writeRepairProc(Map<String, Object> paramMap) {
		return getSqlSession().insert("main.writeRepairProc", paramMap);
	}

	@Override
	public int writeParkingProc(Map<String, Object> paramMap) {
		return getSqlSession().insert("main.writeParkingProc", paramMap);
	}

	@Override
	public int writeTollProc(Map<String, Object> paramMap) {
		return getSqlSession().insert("main.writeTollProc", paramMap);
	}

	@Override
	public int writeEtcProc(Map<String, Object> paramMap) {
		return getSqlSession().insert("main.writeEtcProc", paramMap);
	}

	@Override
	public int writeInsuranceProc(Map<String, Object> paramMap) {
		return getSqlSession().insert("main.writeInsuranceProc", paramMap);
	}

	@Override
	public int writeTaxProc(Map<String, Object> paramMap) {
		return getSqlSession().insert("main.writeTaxProc", paramMap);
	}
	
}
