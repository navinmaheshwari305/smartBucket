package hackathon.com.smartBucket.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import hackathon.com.smartBucket.pojo.Bill;

public interface BillRepo extends MongoRepository<Bill, String> {
	public Bill getBillByUserID(String userId);
	
}
