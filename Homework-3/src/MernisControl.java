import Abstract.PersonCheckService;
import Entity.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisControl implements PersonCheckService {
	
	private Customer customer;
	
	public MernisControl(Customer customer) {
		this.customer = customer;
	}
	
	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
	
	public void isReal() {
	
	try {
		boolean result = kpsPublic.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirthday());
    } catch (Exception ex) {
        System.out.println(ex.toString());
    }
	}

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		try {
			boolean deger = kpsPublic.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirthday());
	    } catch (Exception ex) {
	        System.out.println(ex.toString());
	    }
		return true;
	}
}
