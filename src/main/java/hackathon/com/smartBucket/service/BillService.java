package hackathon.com.smartBucket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import hackathon.com.smartBucket.pojo.Bill;
import hackathon.com.smartBucket.repo.BillRepo;

@Service
public class BillService {

	@Autowired
	BillRepo billRepo;
	@Autowired
	MongoOperations mongoOperations;
	
	ObjectMapper mapper = new ObjectMapper();
	// mapper.writeValueAsString(object);

	public String createBill(Bill bill) throws JsonProcessingException {
		String jsonString;
		Bill it = billRepo.insert(bill);
		if (it == null) {
			jsonString = "{ \"Error\" : \"Error in Creating/Updating bill.\" }";
		} else {
			jsonString = mapper.writeValueAsString(it);
		}
		return jsonString;
	}

	public String getBillByUserId(String userId) throws JsonProcessingException {
		String jsonString;
		Bill it = billRepo.getBillByUserId(userId);
		if (it == null) {
			jsonString = "{ \"Error\" : \"No bill in records for userId <" + userId + ">.\" }";
		} else {
			jsonString = mapper.writeValueAsString(it);
		}
		return jsonString;
	}
	
	public void deleteBillByUserId(String userId) throws JsonProcessingException{
		billRepo.delete(billRepo.getBillByUserId(userId));
	}
	
	public String getAllUserIds() throws JsonProcessingException {
		String jsonString;
		List<Bill> it = billRepo.findAll();
		jsonString = mapper.writeValueAsString(it);
		return jsonString;
	}

}
