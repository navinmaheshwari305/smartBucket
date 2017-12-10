package hackathon.com.smartBucket.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import hackathon.com.smartBucket.pojo.History;
import hackathon.com.smartBucket.repo.BillRepo;
import hackathon.com.smartBucket.repo.HistoryRepo;

@Service
public class HistoryService {

	@Autowired
	HistoryRepo historyRepo;
	@Autowired
	BillRepo billRepo;
	
	ObjectMapper mapper = new ObjectMapper();
	//mapper.writeValueAsString(object);	
	
	
	public String entryInHistory(History history) throws JsonProcessingException {
		String jsonString;
		History his = historyRepo.insert(history);
		if (his == null) {
			jsonString = "{ \"Error\" : \"Error in Creating/Updating History.\" }";
		} else {
			jsonString = mapper.writeValueAsString(his);
			billRepo.delete(history.getBill());
		}
		return jsonString;
	}
	public String getAll() throws JsonProcessingException {
		String jsonString;
		List<History> his = historyRepo.findAll();
		if (his.size() == 0) {
			jsonString = "{ \"Error\" : \"Error in Creating/Updating History.\" }";
		} else {
			jsonString = mapper.writeValueAsString(his);
		}
		return jsonString;
	}
	public String getById(String id) throws JsonProcessingException {
		String jsonString;
		History his = historyRepo.getById(id);
		if (his == null) {
			jsonString = "{ \"Error\" : \"Error in Creating/Updating History.\" }";
		} else {
			jsonString = mapper.writeValueAsString(his);
		}
		return jsonString;
	}
	
}
