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
	
	//주유기록
	@RequestMapping("/writeRefuelForm.do")
	public void writeRefuelForm(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
	}
	
	@RequestMapping("/writeRefuel.do")
	public ModelAndView writeRefuel(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
		//저장하기 위하여 paramMap을 넘긴다.
		int writeCnt = logService.writeRefuelProc(paramMap);
		
		System.out.println(writeCnt + "건 입력되었습니다/");
		
		//처리 후 redirect
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/writeRefuelForm.do");
		return mav;		
	}
	
	//교체 및 정비기록
	@RequestMapping("/repairRegForm.do")
	public void repairRegForm(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
	}
	
	@RequestMapping("/repairReg.do")
	public ModelAndView repairReg(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
		//저장하기 위하여 paramMap을 넘긴다.
		int writeCnt = logService.writeRepairProc(paramMap);
		
		System.out.println(writeCnt + "건 입력되었습니다.");
		
		//처리 후 redirect
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/repairRegForm.do");
		return mav;		
	}
	
	//주차기록
	@RequestMapping("/parkingRegForm.do")
	public void parkingRegForm(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
	}
	
	@RequestMapping("/parkingReg.do")
	public ModelAndView parkingReg(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
		//저장하기 위하여 paramMap을 넘긴다.
		int writeCnt = logService.writeParkingProc(paramMap);
		
		System.out.println(writeCnt + "건 입력되었습니다.");
		
		//처리 후 redirect
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/parkingRegForm.do");
		return mav;		
	}
	
	//통행료기록
	@RequestMapping("/tollRegForm.do")
	public void tollRegForm(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
	}
	
	@RequestMapping("/tollReg.do")
	public ModelAndView tollReg(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
		//저장하기 위하여 paramMap을 넘긴다.
		int writeCnt = logService.writeTollProc(paramMap);
		
		System.out.println(writeCnt + "건 입력되었습니다.");
		
		//처리 후 redirect
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/tollRegForm.do");
		return mav;		
	}
	
	//기타 지출기록
	@RequestMapping("/etcRegForm.do")
	public void etcRegForm(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
	}
	
	@RequestMapping("/etcReg.do")
	public ModelAndView etcReg(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
		//저장하기 위하여 paramMap을 넘긴다.
		int writeCnt = logService.writeEtcProc(paramMap);
		
		System.out.println(writeCnt + "건 입력되었습니다.");
		
		//처리 후 redirect
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/etcRegForm.do");
		return mav;		
	}
	
	//보험료기록
	@RequestMapping("/insuranceRegForm.do")
	public void insuranceRegForm(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
	}
	
	@RequestMapping("/insuranceReg.do")
	public ModelAndView insuranceReg(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
		//저장하기 위하여 paramMap을 넘긴다.
		int writeCnt = logService.writeInsuranceProc(paramMap);
		
		System.out.println(writeCnt + "건 입력되었습니다.");
		
		//처리 후 redirect
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/insuranceRegForm.do");
		return mav;		
	}
	
	//세금(자동차세)납부기록
	@RequestMapping("/taxRegForm.do")
	public void taxRegForm(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
	}
	
	@RequestMapping("/taxReg.do")
	public ModelAndView taxReg(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
		//저장하기 위하여 paramMap을 넘긴다.
		int writeCnt = logService.writeTaxProc(paramMap);
		
		System.out.println(writeCnt + "건 입력되었습니다.");
		
		//처리 후 redirect
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/taxRegForm.do");
		return mav;		
	}
	
	//Bootstrap Example
	@RequestMapping("/example1.do")
	public void example1(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		
	}
	
	
}
