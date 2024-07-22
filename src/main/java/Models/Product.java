package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="product")
public class Product {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="carID")
    protected int carID;
  
    @Column(name = "carName")
    protected String carName;

    @Column(name = "carBrand")
    protected String carBrand;

    @Column(name = "color")
    protected String color;
    
    @Column(name = "capacity")
    protected int capacity;
    
    @Column(name = "description")
    protected String description;
    
    @Column(name = "price")
    protected double price;
	
	public Product() {
		super();
	}

	public Product(int carID, String carName, String carBrand, String color, int capacity, String description,
			double price) {
		super();
		this.carID = carID;
		this.carName = carName;
		this.carBrand = carBrand;
		this.color = color;
		this.capacity = capacity;
		this.description = description;
		this.price = price;
	}

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
