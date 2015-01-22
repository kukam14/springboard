package spring.board;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileController {
	
	@RequestMapping("/viewimage.img")
	public ModelAndView getDisplayImage(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		ModelAndView mav = new ModelAndView() ;
		response.setContentType("image/jpeg") ;
		
		String pathName = "" ;
		if(request.getParameter("filepath") != null)
		{
			pathName = request.getParameter("filepath") ;
		}
		else
		{
			pathName = "default Image Path" ;
		}
		
		File file = new File(pathName) ;
		BufferedImage img = ImageIO.read(file) ;
		OutputStream out = response.getOutputStream() ;
		ImageIO.write(img, "jpg", out) ;
		out.close();
		
		return mav ;
		
	}
}
