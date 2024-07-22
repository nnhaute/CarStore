package Models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="invoice")
public class Invoice {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="invoiceID")
    protected int invoiceID;
  
    @Column(name = "date")
    protected String date;
    
    @Column(name = "items")
    protected List<LineItem> items;
    
	public Invoice() {
		super();
	}
	
	public Invoice(int invoiceID, String date, List<LineItem> items) {
		super();
		this.invoiceID = invoiceID;
		this.date = date;
		this.items = items;
	}

	public int getInvoiceID() {
		return invoiceID;
	}
	public void setInvoiceID(int invoiceID) {
		this.invoiceID = invoiceID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<LineItem> getItems() {
		return items;
	}
	public void setItems(List<LineItem> items) {
		this.items = items;
	}
}
