package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.PersonCheckService;
import Entity.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {
	
	 PersonCheckService personService;

	    public StarbucksCustomerManager(PersonCheckService checkService) {
	        this.personService = checkService;
	    }
	
	
	public void save(Customer customer) {
		if (personService.checkIfRealPerson(customer)){
            System.out.println("Saved to Db " + customer.getFirstName());
        }else {
        	System.out.println("Not a valid person");
        }
        
	}



	
	

	
}
