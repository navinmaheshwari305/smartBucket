package hackathon.com.smartBucket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import hackathon.com.smartBucket.pojo.Bill;
import hackathon.com.smartBucket.repo.BillRepo;

@Service
public class BillService {

	@Autowired
	BillRepo billRepo;
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
		Bill it = billRepo.getBillByUserID(userId);
		if (it == null) {
			jsonString = "{ \"Error\" : \"No bill in records for userId <" + userId + ">.\" }";
		} else {
			jsonString = mapper.writeValueAsString(it);
		}
		return jsonString;
	}
	
	public void deleteBillByUserId(String userId) throws JsonProcessingException{
		billRepo.delete(billRepo.getBillByUserID(userId));
	}
	
	public String getAllUserIds() throws JsonProcessingException {
		String jsonString;
		Bill it = billRepo.
		if (it == null) {
			jsonString = "{ \"Error\" : \"No bill in records for userId <" + userId + ">.\" }";
		} else {
			jsonString = mapper.writeValueAsString(it);
		}
		return jsonString;
	}

}
