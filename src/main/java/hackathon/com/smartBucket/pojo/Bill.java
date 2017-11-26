package hackathon.com.smartBucket.pojo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Bill")
public class Bill {
	@Id
	private String userId;
	private int itemCount;
	private List<Item> itemList;
	private float total;
	private String phone;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Bill( String userId, int itemCount, List<Item> itemList, float total, String phone) {
		super();
		this.userId = userId;
		this.itemCount = itemCount;
		this.itemList = itemList;
		this.total = total;
		this.phone = phone;
	}
	public Bill() {
		super();
	}
	@Override
	public String toString() {
		return "Bill [userId=" + userId + ", itemCount=" + itemCount + ", itemList=" + itemList
				+ ", total=" + total + ", Phone=" + phone + "]";
	}
	
	
}	
