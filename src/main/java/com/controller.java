package com;
//import java.net.URLEncoder;
//import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSONObject;
import com.util.*;
@Controller
public class controller {
	
	@RequestMapping("/search.do")
	public String search(@RequestParam("location")String city,Model model)throws Exception {
		System.err.println("++++++++++"+city);
		//JsonUtilImpl json = new JsonUtilImpl();
		//city = URLEncoder.encode(city,"UTF-8");
		//String url = "https://api.seniverse.com/v3/weather/now.json?key=mtpmwyecaphmrzwc&location="+city+"&language=zh-Hans&unit=c";
		//String data = net.getJson(url);
		//List<String> lists = json.getData(data);
		String host = "https://jisutqybmf.market.alicloudapi.com";
	    String path = "/weather/query";
	    String method = "GET";
	    String appcode = "10fe675e1ccf4694bcb79f15ae467882";
	    //String appkey = "25058064";
	    //String appsecret = "8388ee7452d15fd772a01a0c39d3402f";
	    Map<String, String> headers = new HashMap<String, String>();
	    //�����header�еĸ�ʽ(�м���Ӣ�Ŀո�)ΪAuthorization:APPCODE 83359fd73fe94948385f570e3c139105
	    headers.put("Authorization", "APPCODE " + appcode);
	    //headers.put("Authorization", "APPKEY " + appkey);
	    //headers.put("Authorization", "APPSECRET " + appsecret);
	    Map<String, String> querys = new HashMap<String, String>();
	    querys.put("city", city);
	    querys.put("citycode", "citycode");
	    querys.put("cityid", "cityid");
	    querys.put("ip", "ip");
	    querys.put("location", "location");
	    HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
	    String data = EntityUtils.toString(response.getEntity());
	    System.err.println("++++++++++"+data);
	    JSONObject weatherJson = JSONObject.parseObject(data);
		//-----------------------------------------------
//		bean weather = json.getWeatherBean(data);
		//print
		String location = "������"+ weatherJson.getJSONObject("result").getString("city");
		String now = "������" + weatherJson.getJSONObject("result").getString("weather");//weather.result.getWeather();
		//System.err.println(location+"===="+now);
		//String temperature = "�¶ȣ�"+ weather.result.getTemp()+"��";
		model.addAttribute("location",location);
		model.addAttribute("weather",now);
		//model.addAttribute("temperature",temperature);
		
		return "result";
	}
}
