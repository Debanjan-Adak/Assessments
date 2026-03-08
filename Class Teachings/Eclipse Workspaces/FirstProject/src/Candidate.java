
public class Candidate {
	
	long mobileNumber;
	String name;
	public Candidate(long mobileNumber, String name) {
		super();
		this.mobileNumber = mobileNumber;
		this.name = name;
	}
	String address;
	public Candidate(long mobileNumber, String name, String address) {
		this(mobileNumber,name);
		this.address = address;
	}
	

}
