package hackathon.com.smartBucket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hackathon.com.smartBucket.repo.HistoryRepo;

@RestController
@RequestMapping(path="/history")
public class HistoryController {

	@Autowired
	HistoryRepo historyRepo;
}
