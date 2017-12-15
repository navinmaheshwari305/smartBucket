package hackathon.com.smartBucket.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ITEM")
public class Item {
	@Id
	private String id;
	String barcode;
	String name;
	float rate;
	float weight;
	int quantity;

	Item(){
	}
	
	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Item(String barcode, String name, float rate, float weight) {
		super();
		this.barcode = barcode;
		this.name = name;
		this.rate = rate;
		this.weight = weight;
		this.quantity = 0;
	}

	public Item(String barcode, String name, float rate) {
		super();
		this.barcode = barcode;
		this.name = name;
		this.rate = rate;
		this.quantity = 0;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", barcode=" + barcode + ", name=" + name + ", rate=" + rate + ", weight=" + weight
				+ ", quantity=" + quantity + "]";
	}
	
	

}
