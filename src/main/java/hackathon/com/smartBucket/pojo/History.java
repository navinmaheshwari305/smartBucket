package hackathon.com.smartBucket.pojo;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="HISTORY")
public class History {
	@Id
	private String id;
	private Bill bill;
	private Date billDate;
	private String paymentOption;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public History() {
		super();
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	@Override
	public String toString() {
		return "History [id=" + id + ", bill=" + bill + ", billDate=" + billDate + ", paymentOption=" + paymentOption
				+ "]";
	}
	public History(Bill bill, Date billDate, String paymentOption) {
		super();
		this.bill = bill;
		this.billDate = billDate;
		this.paymentOption = paymentOption;
	}
}
