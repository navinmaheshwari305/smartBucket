package hackathon.com.smartBucket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import hackathon.com.smartBucket.pojo.Item;
import hackathon.com.smartBucket.service.ItemService;


@RestController
@RequestMapping(value="/hello")
public class TestController {
	
	@Autowired
	ItemService itemService;
	
	ObjectMapper mapper = new ObjectMapper();
	
//	public String sayHello(@RequestParam(value="name" )String name){
//		System.out.println("Hello World");
//		itemService.insert();
//		return "Record Inserted";
//	}
//
//	@RequestMapping(value="", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody String createBranch(@RequestBody Item item) throws JsonProcessingException
//	{
//		return mapper.writeValueAsString(itemService.getByName(item.getBarcode()));
//	}
}
