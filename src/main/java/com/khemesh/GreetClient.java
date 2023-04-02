package com.khemesh;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="GRRET-API")
public interface GreetClient {
	@GetMapping("/greet")
	public String invokeGreetApi();
	
	
}
