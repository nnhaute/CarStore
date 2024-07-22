package Models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
  
    @Column(name = "carName")
    protected String carName;
    
    @Column(name = "price")
    protected double price;
    
    @Column(name = "quantity")
    protected int quantity;
	
	public Cart()
	{
		super();
	}
	
	public String getcarName() {
		return carName;
	}
	
	public void setcarName(String carName)
	{
		this.carName = carName;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
}
