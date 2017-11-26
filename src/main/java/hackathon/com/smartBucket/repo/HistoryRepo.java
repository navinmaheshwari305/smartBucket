package hackathon.com.smartBucket.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import hackathon.com.smartBucket.pojo.History;

public interface HistoryRepo  extends MongoRepository<History, String> {
	public History getById(String Id);
}
