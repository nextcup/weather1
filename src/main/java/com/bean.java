package com;

public class bean {
	private weather now;
	private location loc;
	public weather getWeather(){
		return now;
	}
	public void setWeather(weather now) {
		this.now = now;
	}
	public location getLocation() {
		return loc;
	}
	public void setLocation(location loc) {
		this.loc = loc;
	}
	
	public class location{
		private String id;
		private String name;
		private String path;
		private String timezone;
		private String timezone_offset;
		
		public String getID() {
			return id;
		}		
		public String getName() {
			return name;
		}
		public String getPath() {
			return path;
		}
		public String getTimezone() {
			return timezone;
		}
		public String getTimeOffset() {
			return timezone_offset;
		}
		public void setID(String id) {
			this.id= id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setPath(String path) {
			this.path = path;
		}
		public void setTimezone(String timezone) {
			this.timezone = timezone;
		}
		public void setTimeOffset(String offset) {
			this.timezone_offset = offset;
		}
		@Override
		public String toString() {
			StringBuilder build = new StringBuilder();
			build.append("ID: ");
			build.append(id+"\n");
			build.append("地名: ");
			build.append(name+"\n");
			String loc = build.toString();
			return loc;
		}
	}
	
	public class weather{
		private String text;
		private String temperature;
		public String getText() {
			return text;	
		}
		public String getTemperature() {
			return temperature;
		}
	
		public void setText(String text) {
			this.text = text;
		}
		public void setTemperature(String temperature) {
			this.temperature= temperature;
		}
		@Override
		public String toString() {
			StringBuilder build = new StringBuilder();
			build.append("天气: ");
			build.append(text+"\n");
			build.append("温度: ");
			build.append(temperature+"℃");
			String weather = build.toString();
			return weather;
		}
	}
	@Override
	public String toString() {
		String inf = loc.toString() + now.toString();
		return inf;
	}
}