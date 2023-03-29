package com.josue.daikichipathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/daikichi")
public class HomeController {
	@RequestMapping("")
	public String welcome() {
	 return "Welcome!";
 }
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luch in all your endevours";
	}

	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise,so be sure to be open to new ideas!";
	}
	@RequestMapping("/travel/{city}")
	public String travel(@PathVariable("city") String city) {
		return "You soon will be traveling to " + city;
	}
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") int number) {
		for (int i = 0; i < number; i++) {
		if (number %2 ==0 ) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
			}
		
			else {
				return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
				}
			}
		return null;
		}
	}
	

