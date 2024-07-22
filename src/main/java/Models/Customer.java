package Models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	  	@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name="customerID")
	    protected int customerID;
	  
	    @Column(name = "userName")
	    protected String userName;

	    @Column(name = "passwd")
	    protected String passwd;

	    @Column(name = "contact")
	    protected String contact;
	    
	    @Column(name = "name")
	    protected String name;
	    
	    @Column(name = "invoiceID")
	    protected String invoiceID;

		public Customer() {
			super();
		}

		public Customer(int customerID, String userName, String passwd, String contact, String name, String invoiceID) {
			super();
			this.customerID = customerID;
			this.userName = userName;
			this.passwd = passwd;
			this.contact = contact;
			this.name = name;
			this.invoiceID = invoiceID;
		}

		public int getCustomerID() {
			return customerID;
		}

		public void setCustomerID(int customerID) {
			this.customerID = customerID;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPasswd() {
			return passwd;
		}

		public void setPasswd(String passwd) {
			this.passwd = passwd;
		}

		public String getContact() {
			return contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getInvoiceID() {
			return invoiceID;
		}

		public void setInvoiceID(String invoiceID) {
			this.invoiceID = invoiceID;
		}
	   
	    
	    
}
