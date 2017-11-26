package hackathon.com.smartBucket.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import hackathon.com.smartBucket.pojo.Item;

public interface ItemRepo extends MongoRepository<Item, String> {
	List<Item> findByName(String name);
	Item findByBarcode(int barcode);
}
