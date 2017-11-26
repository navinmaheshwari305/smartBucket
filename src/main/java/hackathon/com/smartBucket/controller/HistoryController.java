package hackathon.com.smartBucket.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import hackathon.com.smartBucket.pojo.Bill;
import hackathon.com.smartBucket.pojo.History;
import hackathon.com.smartBucket.service.HistoryService;

@RestController
@RequestMapping(path="/history")
public class HistoryController {

	@Autowired
	HistoryService historyService;
	
	
	@RequestMapping(value="", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String insertItem(@RequestBody Bill bill) throws JsonProcessingException
	{
		History history = new History(bill , new Date(),"Cash");
		return historyService.entryInHistory(history);
	}
	@RequestMapping(value="/all", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getAll() throws JsonProcessingException
	{
		return historyService.getAll();
	}
	@RequestMapping(value="", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getById(@RequestParam String id) throws JsonProcessingException
	{
		return historyService.getById(id);
	}
	
}
