package ep1;
import java.net.*;


public class CustomeExceptions3_9 {
	
	String owner;
	URL address;
	String category = "none";
	
	public void HomePage(String inOwner, String inAddress)
		throws MalformedURLException {
		
		owner = inOwner;
		address = new URL(inAddress);
		
	}
	
	public void HomePage(String inOwner, String inAddress, String inCategory)
		throws MalformedURLException {
		
		this (inOwner, inAddress);
		category = inCategory;
	}
	
	
	
}
