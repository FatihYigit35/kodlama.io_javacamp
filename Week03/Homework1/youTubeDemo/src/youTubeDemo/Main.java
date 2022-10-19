package youTubeDemo;

public class Main {

	public static void main(String[] args) {
//		CreditManager creditManager = new CreditManager();
//		creditManager.calculate();
//		creditManager.calculate();
//		creditManager.save();
//		
//		Customer customer = new Customer(); // örneğini oluşturma, instance oluşturmak, instance creation
//		customer.setId(1);
//		customer.setCity("İzmir");
//		
//		Company company = new Company();
//		company.setTaxNumber("100000");
//		company.setCompanyName("Arçelik");
//		company.setId(100);
//		
//		Person person = new Person();
//		person.setFirstName("Fatih");
//		person.setNationalIdentitiy("12345678");
//		
//		CustomerManager customerManager = new CustomerManager(customer);
//		customerManager.save();
//		customerManager.delete();
//		
//		Customer c1 = new Customer();
//		Customer c2 = new Person();
//		Customer c3 = new Company();

		
		//IoC Container ile bu yapı daha iyi hale getirilebilir.
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager()); // new yaparak kullanmak çok uygun değil
		customerManager.giveCredit();
		customerManager.save();

	}

}
