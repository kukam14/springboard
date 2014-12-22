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

}
