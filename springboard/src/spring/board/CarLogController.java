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
		
		//저장하기 위하여 paramMap 을 넘긴다.
		int writeCnt = logService.writeRefuelProc(paramMap);
		
		System.out.println(writeCnt + "건 입력되었습니다/");
		
		//처리 후 redirect
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/writeRefuelForm.do");
		return mav;		
	}
	
	
	@RequestMapping("/repairRegForm.do")
	public void repairRegForm(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
	}
	
	@RequestMapping("/repairReg.do")
	public ModelAndView repairReg(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
		//저장하기 위하여 paramMap 을 넘긴다.
		int writeCnt = logService.writeRepairProc(paramMap);
		
		System.out.println(writeCnt + "건 입력되었습니다.");
		
		//처리 후 redirect
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/repairRegForm.do");
		return mav;		
	}
	
	
}
