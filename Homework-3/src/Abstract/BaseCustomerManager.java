package Abstract;

import Entity.Customer;

public class BaseCustomerManager {
	public void save(Customer customer) {
		System.out.println("Saved to database : " + customer.getFirstName());
	}
}
