package com;
import java.io.IOException;
import java.net.URLEncoder;
//import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.util.*;
@Controller
public class controller {
	
	@RequestMapping("/search.do")
	public String search(@RequestParam("location")String city,Model model)throws IOException {
		NetUtilImpl net = new NetUtilImpl();
		JsonUtilImpl json = new JsonUtilImpl();
		city = URLEncoder.encode(city,"UTF-8");
		String url = "https://api.seniverse.com/v3/weather/now.json?key=mtpmwyecaphmrzwc&location="+city+"&language=zh-Hans&unit=c";
		String data = net.getJson(url);
		//List<String> lists = json.getData(data);
		bean weather = json.getWeatherBean(data);
		//print
		String location = "地名："+ weather.getLocation().getName();
		String timeOffset = "时区：" + weather.getLocation().getTimeOffset();
		String now = "天气：" + weather.getWeather().getText();
		String temperature = "温度："+ weather.getWeather().getTemperature()+"℃";
		model.addAttribute("location",location);
		model.addAttribute("timeOffset",timeOffset);
		model.addAttribute("weather",now);
		model.addAttribute("temperature",temperature);
		
		return "result";
	}
}
