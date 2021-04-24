package com.wlkq.pe.util;

import java.util.HashMap;
import java.util.Map;



import org.apache.http.HttpResponse;
import org.springframework.stereotype.Component;

/**
 * 发送信息的接口
 * @author BEYOND
 *
 */
@Component
public class SmsTemplate {

	
	String host = "http://dingxin.market.alicloudapi.com";
	
	String path = "/dx/sendSms";
	
    String method ="POST";
	
    String appcode = "4ed6a54c63f14f9aa4e4363da8168382";
	
	public AppResponse<String> sendSms(Map<String, String> querys) {

	    Map<String, String> headers = new HashMap<String, String>();
	    headers.put("Authorization", "APPCODE " + appcode);

	    Map<String, String> bodys = new HashMap<String, String>();

	    try {
	    	HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
	    	System.out.println(response.toString());
	    	
	    	return AppResponse.ok(response.toString());
	    } catch (Exception e) {
	    	e.printStackTrace();
	    	return AppResponse.fail(null);
	    }
	}
	
}
