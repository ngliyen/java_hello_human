package com.liyen.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String greetings(@RequestParam(value="name", required=false) String name, @RequestParam(value="lastname", required=false) String lastname) {
		String formatString = "<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC' crossorigin='anonymous'>"+
				"<nav class='d-flex justify-content-end me-5'><a href='/' >Go Back</a></nav><div class='ms-5'>";
		if (name == null) {
			return  formatString + "<h1>Hello Human!</h1><p>Welcome to SpringBoot!</p></div>";
		} else if (lastname == null){
			return  formatString + "<h1>Hello " + name + "!</h1><p>Welcome to SpringBoot!</p></div>";
		} else {
			return  formatString + "<h1>Hello " + name + " " + lastname + "!</h1><p>Welcome to SpringBoot!</p></div>";
		}
	}

}

