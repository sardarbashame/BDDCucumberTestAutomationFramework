package resources;

public class Polymorphismexample1 extends PersonalInsurance{

	public static void main(String[] args) 
	{
		PersonalInsurance personal =  new PersonalInsurance();
		personal.policyholderdetails("Sardar", "Basha");
		personal.policyholderdetails("Sardar", "Basha","Nawabjan");
		personal.InsuredAmount(2500000);

	}
	

}
