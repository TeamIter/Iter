package com.inha.iter;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.madgag.gif.fmsware.AnimatedGifEncoder;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws IOException 
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws IOException {
		logger.info("This is Team Iter Project.", locale);
		
		 AnimatedGifEncoder e = new AnimatedGifEncoder();
		    e.start("test_result.gif");
		    e.setDelay(50);   // 1 frame per sec
		    String path="storage/";
    		File dirFile=new File(path);
    		File []fileList=dirFile.listFiles();
    		
    		for(File tempFile : fileList) {
    		  if(tempFile.isFile() && tempFile.getName().substring(tempFile.getName().length() - 3, tempFile.getName().length()).equals("png")) {
    		    String tempPath=tempFile.getParent();
    		    String tempFileName=tempFile.getName();
    		    System.out.println("Path="+tempPath);
    		    System.out.println("FileName="+tempFileName);
    		    
    		    e.addFrame(ImageIO.read(new File(tempPath + "/" + tempFileName)));
    		  }
    		}
		    e.finish();
		
		return "home";
	}

	
}
