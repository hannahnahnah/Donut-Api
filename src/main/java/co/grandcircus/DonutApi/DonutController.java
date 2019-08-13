package co.grandcircus.DonutApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DonutController {
	
	@Autowired
	private DonutApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView showIndex() {
		//System.out.println(apiService.getDonuts2());
		return new ModelAndView("index", "display", apiService.getDonuts2().getResults());
	}
	
	@RequestMapping("/donut-detail")
	public ModelAndView showDetail(@RequestParam("id") Integer id) {
		return new ModelAndView("donut-detail", "displayDetail", apiService.getDonutById(id));
	}
	

}
