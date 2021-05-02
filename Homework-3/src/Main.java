import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.PersonCheckService;
import Concrete.NeroCustomerManager;
import Concrete.PersonCheckManager;
import Concrete.StarbucksCustomerManager;
import Entity.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		Customer customer = new Customer(1, "Cem", "Yýlmaz", 2002, 123456780);
		MernisControl checkManager = new MernisControl(customer);
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(checkManager);
		
		baseCustomerManager.save(customer);
		
		
		
	}

}
