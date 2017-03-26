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
		    e.addFrame(ImageIO.read(new File("storage/test_1.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_2.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_3.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_4.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_5.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_6.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_7.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_8.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_9.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_10.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_11.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_12.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_13.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_14.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_15.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_16.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_17.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_18.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_19.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_20.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_21.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_22.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_23.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_24.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_25.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_26.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_27.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_28.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_29.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_30.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_31.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_32.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_33.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_34.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_35.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_36.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_37.png")));
		    e.addFrame(ImageIO.read(new File("storage/test_38.png")));
		    e.finish();
		
		logger.info("animatedGifEncoder : ", e.toString());
		
		return "home";
	}

	
}
