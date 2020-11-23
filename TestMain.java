import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// This program will display persons information and will perform serialization
// Author : Lubna Batool, HW 11, CPSC24500-004

public class TestMain {

	public static void main(String[] args) {
		Person obj1 = new Person("Mike McAlexander","01/11/2003","6304075799","abc@gmail.com");
		
		try 
		{
			writeToFile(obj1);
		} 
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
		
		try 
		{
			readFile();
		} 
		catch (ClassNotFoundException | IOException e) 
		{
			System.out.println(e.getMessage());
		}
	}


	public static void writeToFile(Person p)throws IOException {
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Person.bin"));
		
		objectOutputStream.writeObject(p);
	}
	
	public static void readFile() throws IOException, ClassNotFoundException{
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Person.bin"));
		
		Person name = (Person) objectInputStream.readObject();
		System.out.println(name);
	}
}
