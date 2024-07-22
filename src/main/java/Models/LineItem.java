package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lineitem")
public class LineItem {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="lineItemID")
    protected int lineItemID;
  
    @Column(name = "quantity")
    protected int quantity;
    
    @Column(name = "item")
    protected Product item;
	
	public LineItem() {
		super();
	}

	public LineItem(int lineItemID, int quantity, Product item) {
		super();
		this.lineItemID = lineItemID;
		this.quantity = quantity;
		this.item = item;
	}

	public int getLineItemID() {
		return lineItemID;
	}

	public void setLineItemID(int lineItemID) {
		this.lineItemID = lineItemID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getItem() {
		return item;
	}

	public void setItem(Product item) {
		this.item = item;
	}
	
	
}
