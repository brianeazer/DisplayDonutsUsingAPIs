package com.extraPractice.Donut;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.extraPractice.Donut.model.Donut;
import com.extraPractice.Donut.model.DonutDetails;

@Controller
public class DonutController {
	@Autowired
	ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView index() {
		ArrayList<Donut> r = (ArrayList<Donut>) apiService.getDonutResults();
		return new ModelAndView("index", "donuts", r);
	}
	
	@RequestMapping("/donut")
	public ModelAndView showDonut(@RequestParam("id") Long id) {
		DonutDetails donut = apiService.getDonutDetails(id);
		return new ModelAndView("donut", "donut", donut);
	}
}
