package hackathon.com.smartBucket.pojo;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="HISTORY")
public class History {
	@Id
	private String id;
	private int userId;
	private int itemCount;
	private List<Item> itemList;
	private float total;
	private String Phone;
	private Date billDate;
	private String paymentOption;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
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
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public String getPaymentOption() {
		return paymentOption;
	}
	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}
	public History(String id, int userId, int itemCount, List<Item> itemList, float total, String phone, Date billDate,
			String paymentOption) {
		super();
		this.id = id;
		this.userId = userId;
		this.itemCount = itemCount;
		this.itemList = itemList;
		this.total = total;
		Phone = phone;
		this.billDate = billDate;
		this.paymentOption = paymentOption;
	}
	public History() {
		super();
	}
	
	
	
	
}
