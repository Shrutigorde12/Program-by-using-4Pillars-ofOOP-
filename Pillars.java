package OOP_Concept;

abstract class data{ 	//abstraction
	abstract void challenges();
	abstract void precautions()	;	//abstract method
	
}
class Cybersecurity extends data{	//Inheritance
	private String Password,Key;	
	public String getPassword() {
		return Password;
	}
	public String setPassword(String password) {	//Encapsulation
		return Password = password;
	}
	public String getKey() {		
		return Key;
	}
	public String setKey(String key) {
		return Key = key;
	}
	@Override
	void challenges() {
		System.out.println("\n\nCHALLENGES IN CYBERSECURITY");
		System.out.println("IOT threats");
		System.out.println("Blockchain Evoulution");
	}	
	void precautions()
	{		
			System.out.println("\nPRECAUSTIONS");
			System.out.println("1)Do not click on unkmown senders or unfamiliar websites");
			System.out.println("2)Use strong password");}
	String precautions(String threats)	//polymorphism
	{return  "\nPROTECT YOUR SYSTEM FROM\n1) Virus \n2) Phishing \n3) DDos Attack";}
}
public class Pillars {
public static void main(String[] args) {
		Cybersecurity c=new Cybersecurity();
		c.setKey("ASDFGHJ90");
		System.out.println("Your Private key :"+c.getKey());
		c.setPassword("Edubridge@123");
		System.out.println("Your password :"+c.getPassword());
		
		c.challenges();
		c.precautions();
		System.out.println(c.precautions(null));
		
	}

}
