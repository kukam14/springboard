package spring.board.service;

import java.util.List;
import java.util.Map;

import spring.board.dao.MainDao;
import spring.board.vo.Board;

public class MainServiceImpl implements MainService {
	
	private MainDao mainDao;

	public void setMainDao(MainDao mainDao) {
		this.mainDao = mainDao;
	}

	public String getToday() {
		return mainDao.getToday();
	}

	@Override
	public int writeProc(Map<String, Object> paramMap) {
		return mainDao.writeProc(paramMap);
	}
	
	public int writeProc2(Board board) {
		return mainDao.writeProc2(board);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getList(Map<String, Object> paramMap) {
		return mainDao.getList(paramMap);
	}

}
