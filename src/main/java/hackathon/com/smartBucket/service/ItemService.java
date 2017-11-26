package hackathon.com.smartBucket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import hackathon.com.smartBucket.pojo.Item;
import hackathon.com.smartBucket.repo.ItemRepo;

@Service
public class ItemService {
	
	@Autowired
	ItemRepo itemRepo;
	ObjectMapper mapper = new ObjectMapper();
	//mapper.writeValueAsString(object);
	
	public String insertItem(Item item) throws JsonProcessingException {
		String jsonString;
		Item it = itemRepo.insert(item);
		if(it == null){
			jsonString = "{ \"Error\" : \"Error in inserting Record\" }";
		}else
		{
			jsonString = mapper.writeValueAsString(it);
		}
		return jsonString;
	}
	
	public String getItemByBarcode(int barcode) throws JsonProcessingException {
		String jsonString;
		Item it = itemRepo.findByBarcode(barcode);
		if(it == null){
			jsonString = "{ \"Error\" : \"No Item with Barcode<"+barcode+">\" }";
		}else
		{
			jsonString = mapper.writeValueAsString(it);
		}
		return jsonString;
	}
}
