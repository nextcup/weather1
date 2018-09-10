package com;

import java.util.List;

public class bean {
	public Result result;
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	public static  class Result{
		public String city;
		public String weather;
		public String data;
		public String temp;		
		public String temphigh;
		public String templow;
		public Aqi aqi;
		public List<Hourly>hourly;
		public void setCity(String city) {
			this.city = city; 
		}
		public String getCity() {
			return city;
		}
		public void setWeather(String weather) {
			this.weather = weather;
		}
		public String getWeather() {
			return weather;
		}
		public void setData(String data) {
			this.data = data;
		}
		public String getData() {
			return data;
		}
		public void setTemp(String temp) {
			this.temp = temp;
		}
		public String getTemp() {
			return temp;
		}
		public void getTemphigh(String temphigh) {
			this.temphigh = temphigh;
		}
		public String getTemphigh() {
			return temphigh;
		}
		
		public static class Aqi{
			public String pm2_5;
			public void setPm2_5(String pm2_5) {
				this.pm2_5 = pm2_5;
			}
			public String getPm2_5() {
				return pm2_5;
			}
			@Override
			public String toString() {
				StringBuilder build = new StringBuilder();
				build.append("PM2_5:");
				build.append(pm2_5 + "\n");
				String aqi =  build.toString();
				return aqi;
			}
		}
		
		public static class Hourly{
			public String temp;
			public void setTemp(String temp) {
				this.temp = temp;
			}
			public String getTemp(){
				return temp;
			}
			@Override
			public String toString() {
				StringBuilder build = new StringBuilder();
				build.append("Temp:");
				build.append(temp + "\n");
				String hourly =  build.toString();
				return hourly;
			}
		}
		@Override
		public String toString() {
			StringBuilder build = new StringBuilder();
			build.append("CITY:");
			build.append(city + "\n");
			build.append("WEATHER:");
			build.append(weather + "\n");
			build.append("DATA:");
			build.append(data + "\n");
			build.append("TEMP:");
			build.append(temp + "\n");
			build.append("TEMPHIGH:");
			build.append(temphigh + "\n");
			build.append("TEMPLOW:");
			build.append(templow + "\n");
			String cityWeather = build.toString();
			String result = cityWeather.toString() + aqi.toString() + 
					hourly.toString(); 	
			return result;
		}
		
	}
	@Override
	public String toString() {
	String inf = result.toString();
	return inf;
	}
}





