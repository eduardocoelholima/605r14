import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImplementationAlternative
        extends UnicastRemoteObject
        implements HelloInterface {

    int state;
    static int counter;
    static Object lock = new Object();

    public HelloImplementationAlternative() throws RemoteException {
    }

    public String sayHello() throws RemoteException {
        counter ++;
        return  "Spiegel: Hello World my Friend!";
    }
    public String sayHello(int state) throws RemoteException, InterruptedException {
        this.state = state;

        System.out.println("Client "+counter+" connected");

        synchronized (lock) {

            counter++;

            if (counter < 2) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {}

            } else {
                lock.notifyAll();
            }

            return "sayHello: " + counter + "/" + state;
        }
    }
}
