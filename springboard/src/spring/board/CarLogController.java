package spring.board;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.carlog.service.CarLogService;

@Controller
public class CarLogController {
	
	@Autowired
	private CarLogService logService;
	
	@RequestMapping("/writeRefuelForm.do")
	public void writeRefuelForm(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
	}
	
	@RequestMapping("/writeRefuel.do")
	public ModelAndView writeRefuel(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		//Form 에서 넘어 오는 값  찍기  	paramMap 안에 Form 에서 넘어 오는 값이 있음	
		System.out.println("title = " + paramMap.get("refuel_date"));
		System.out.println("content = " + paramMap.get("distance"));
		
		//저장하기 위하여 paramMap 을 넘긴다.
		int writeCnt = logService.writeRefuelProc(paramMap);
		
		System.out.println(writeCnt + "건 입력되었습니다/");
		
		//처리 후 redirect
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/writeRefuelForm.do");
		return mav;		
	}
}
