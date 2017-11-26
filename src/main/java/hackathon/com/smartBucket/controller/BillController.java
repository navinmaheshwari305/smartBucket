package hackathon.com.smartBucket.controller;

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
import hackathon.com.smartBucket.service.BillService;

@RestController
@RequestMapping(value = "/bill")
public class BillController {

	@Autowired
	BillService billService;

	@RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String CreateBill(@RequestBody Bill bill) throws JsonProcessingException {
		return billService.createBill(bill);
	}

	@RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getBillById(@RequestParam String userId) throws JsonProcessingException {
		return billService.getBillByUserId(userId);
	}
	@RequestMapping(value = "/allId", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getBillById(@RequestParam String userId) throws JsonProcessingException {
		return billService.getBillByUserId(userId);
	}

}
