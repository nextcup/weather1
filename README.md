# weather
连接天气API实现即时天气查询的SpringMVC项目
Maven + SpringMVC + GSON
1获取本地ip
2将ip拼接到百度地图api上，调用api返回位置json
http://api.map.baidu.com/location/ip?ak=F454f8a5efe5e577997931cc01de3974&ip=120.134.33.9
3解析json，取省和市的字符串值，把省、市保存到服务器
4拼接天气api+city，调用后返回json，解析后得到天气、温度、pm2.5等
https://market.aliyun.com/products/57126001/cmapi014302.html?spm=5176.11842841.1178304.2.89Az5s#sku=yuncode830200000
5将省市天气等model.addAttribute()到前端







备注：
获取定位：从h5调用GEOLocation api获取经纬度和城市信息
把城市信息字符串通过a传递给后台,
后台调用天气api，解析出天气信息，传递给前端展示

