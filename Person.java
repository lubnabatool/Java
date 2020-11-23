import java.io.Serializable;

public class Person implements Serializable{
	String name;
	String DOB;
	String phoneNum;
	String email;
	
	public Person(String name, String dOB, String phoneNum, String email) {
		super();
		this.name = name;
		DOB = dOB;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", DOB=" + DOB + ", phoneNum=" + phoneNum + ", email=" + email + "]";
	}
	
}
