package com.khemesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelComeRestController {
	
	@Autowired
	private GreetClient greetclient;

	@GetMapping("/welcome")
	public String getWelComeMsg() {
		String welcomeMsg = "WelCome to Khemesh World...!!";
		String greetMsg = greetclient.invokeGreetApi();
		return greetMsg + ","+ welcomeMsg;
	}
}
 