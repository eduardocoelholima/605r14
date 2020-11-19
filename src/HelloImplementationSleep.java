import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class HelloImplementationSleep
	extends UnicastRemoteObject
	implements HelloInterface {

	int state;
	static int counter;

        public HelloImplementationSleep() throws RemoteException {
        }

        public String sayHello() throws RemoteException {
		counter ++;
                System.out.println("sayHello before sleep");
		try { Thread.sleep(10000); } catch (  InterruptedException e ) { }
                System.out.println("sayHello after sleep");
                return  "Spiegel: Hello World my Friend!";
        }
        public String sayHello(int state) throws RemoteException {
                System.out.println("sayHello(int) before sleep");
		try {  Thread.sleep(ThreadLocalRandom.current().nextInt(0,100)); } catch (  InterruptedException e ) { }
                System.out.println("sayHello(int) after sleep");
		this.state = state;
		counter ++;
                return  "sayHello: " + counter + "/" + state;
        }
}
