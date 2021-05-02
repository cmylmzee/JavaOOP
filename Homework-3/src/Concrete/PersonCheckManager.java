package Concrete;

import java.rmi.RemoteException;

import Abstract.CustomerService;
import Abstract.PersonCheckService;
import Entity.Customer;


public class PersonCheckManager implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		 return true;
		
	}

	

}
