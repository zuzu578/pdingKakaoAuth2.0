package com.mycompany.mypudingapp;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@RequestMapping(value = "/doLogin")
	public String doLogin() {
		return "userLoginPage";
	}
	
	
	@RequestMapping(value = "/main" , method=RequestMethod.GET)
	@ResponseBody
	public String main(HttpServletRequest request , Model model) {
		System.out.println("Ajax ====> Data");
		String userData = request.getParameter("response");
		System.out.println("userData ==========> >>"+userData);
		
		System.out.println("test___001");
		//JsonParser jsonParser = new JsonParser();
		//JsonArray userDataJson = new JsonArray();
		//Gson gson = new Gson();
		//userData = k.get("userData").getAsJsonArray();
		
		//Type type = new TypeToken<List<Map<String, Object>>>(){}.getType();
	   // List<Map<String, Object>> userDataAjax = gson.fromJson(userDataJson, type);
	    //System.out.println(userDataAjax);
	    //model.addAttribute("userDataAjax",userDataAjax);
	    //System.out.println("userDataAjax");
		//model.addAttribute("userData",userData);
		//model.addAttribute("userData",userData);
		return "mainPage";
	}
	
}
