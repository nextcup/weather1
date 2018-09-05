package com.util;

import java.util.ArrayList;
import java.util.List;
import com.bean;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

public class JsonUtilImpl implements JsonUtil{
	@Override
	public List<String> getData(String json) {		
		ArrayList<String>  lists = new ArrayList<String>();
		JsonParser jsonParser = new JsonParser();//json������
		JsonObject object=(JsonObject) jsonParser.parse(json);  //����JsonObject����
		JsonArray array=object.get("results").getAsJsonArray();//�õ�json����
		JsonObject sJsonObject = array.get(0).getAsJsonObject();//�������õ����о�������
		JsonObject location = sJsonObject.get("location").getAsJsonObject();
		JsonObject now = sJsonObject.get("now").getAsJsonObject();
		
		lists.add(location.get("name").getAsString());
		lists.add(now.get("text").getAsString());
		lists.add(now.get("temperature").getAsString()+"��");
		return lists;
	}
	public bean getWeatherBean(String json) {
		JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
		JsonArray jsonArray = jsonObject.getAsJsonArray("results");
		Gson gson = new Gson();
		bean weather = new bean();
		JsonObject insideObject = jsonArray.get(0).getAsJsonObject();
		//location
		JsonElement location = insideObject.get("location").getAsJsonObject();
		weather.setLocation(gson.fromJson(location,new TypeToken<bean.location>(){}.getType()));
		//weather now
		JsonElement now = insideObject.get("now").getAsJsonObject();
		weather.setWeather(gson.fromJson(now, new TypeToken<bean.weather>(){}.getType()));	
		return weather;
	}
}