package hackathon.com.smartBucket.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ITEM")
public class Item {
	@Id
	private String id;
	int barcode;
	String name;
	float rate;
	float weight;

	Item(){
	}
	
	public int getBarcode() {
		return barcode;
	}

	public void setBarcode(int barcode) {
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

	public Item(int barcode, String name, float rate, float weight) {
		super();
		this.barcode = barcode;
		this.name = name;
		this.rate = rate;
		this.weight = weight;
	}

	public Item(int barcode, String name, float rate) {
		super();
		this.barcode = barcode;
		this.name = name;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", barcode=" + barcode + ", name=" + name + ", rate=" + rate + ", weight=" + weight
				+ "]";
	}

}
