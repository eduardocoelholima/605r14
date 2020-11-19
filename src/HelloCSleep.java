import java.rmi.*;

public class HelloCSleep {
	public static void main(String args[] ) {
	String message = "";
	try {
		// HelloInterface obj = (HelloInterface)Naming.lookup("//spiegel.cs.rit.edu/HelloServer");
		HelloInterface obj1 = (HelloInterface)Naming.lookup("//localhost/HelloServer3");

		message = obj1.sayHello(1);
		System.out.println("obj1: " + message);
		message = obj1.sayHello(2);
		System.out.println("obj1: " + message);

	} catch (Exception e) {
		System.out.println("HelloC exception: " +
		e.getMessage());
		e.printStackTrace();
	}
  }
}
