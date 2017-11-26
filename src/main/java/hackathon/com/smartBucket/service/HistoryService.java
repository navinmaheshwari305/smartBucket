package hackathon.com.smartBucket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import hackathon.com.smartBucket.repo.HistoryRepo;

@Service
public class HistoryService {

	@Autowired
	HistoryRepo historyRepo;
	ObjectMapper mapper = new ObjectMapper();
	//mapper.writeValueAsString(object);	
}
