package hackathon.com.smartBucket.service;

import java.util.List;

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
	// mapper.writeValueAsString(object);

	public String insertItem(Item item) throws JsonProcessingException {
		String jsonString;
		if (itemRepo.findByBarcode(item.getBarcode()) == null) {
			Item it = itemRepo.insert(item);
			if (it == null) {
				jsonString = "{ \"Error\" : \"Error in inserting Record\" }";
			} else {
				jsonString = mapper.writeValueAsString(it);
			}
		} else {
			jsonString = "{ \"Error\" : \"Item with barcode <" + item.getBarcode() + "> already present\" }";
		}
		return jsonString;
	}

	public String getItemByBarcode(int barcode) throws JsonProcessingException {
		String jsonString;
		Item it = itemRepo.findByBarcode(barcode);
		if (it == null) {
			jsonString = "{ \"Error\" : \"No Item with Barcode<" + barcode + ">\" }";
		} else {
			jsonString = mapper.writeValueAsString(it);
		}
		return jsonString;
	}
	
	public String getAllItem() throws JsonProcessingException {
		String jsonString;
		List<Item> it = itemRepo.findAll();
		if (it == null) {
			jsonString = "{ \"Error\" : \"No Items \" }";
		} else {
			jsonString = mapper.writeValueAsString(it);
		}
		return jsonString;
	}
}
