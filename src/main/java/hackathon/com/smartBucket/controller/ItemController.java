package hackathon.com.smartBucket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import hackathon.com.smartBucket.pojo.Item;
import hackathon.com.smartBucket.service.ItemService;

@CrossOrigin
@RestController
@RequestMapping(value="/item")
public class ItemController {
	@Autowired
	ItemService itemService;

	@RequestMapping(value="", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String insertItem(@RequestBody Item item) throws JsonProcessingException
	{
		System.out.println("Name is:"+item.getName());
		return itemService.insertItem(item);
	}
	
	@RequestMapping(value="", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getItemByBarcode(@RequestParam String barcode) throws JsonProcessingException
	{
		return itemService.getItemByBarcode(barcode);
	}
	
	@RequestMapping(value="/all", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getAllItem() throws JsonProcessingException
	{
		System.out.println("in request getAllItem");
		return itemService.getAllItem();
	}
	
}
