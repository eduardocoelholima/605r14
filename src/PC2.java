// Java implementation of a producer and consumer
// that use semaphores to control synchronization.

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

class Q2 {
    // an item
    int item;

    Queue store = new LinkedList<>();

    // semCon initialized with 0 permits
    // to ensure put() executes first
    static Semaphore semCon = new Semaphore(0);

    static Semaphore semProd = new Semaphore(2);

    static Semaphore mutex = new Semaphore(1);

    // to get an item from buffer
    void get()
    {
        try {
            // Before consumer can consume an item,
            // it must acquire a permit from semCon
            semCon.acquire();
        }
        catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }

        // consumer consuming an item
        try {
            mutex.acquire();
            System.out.println("Consumer consumed item : " + store.remove());
            mutex.release();
        } catch (InterruptedException e) {}


        // After consumer consumes the item,
        // it releases semProd to notify producer
        semProd.release();
    }

    // to put an item in buffer
    void put(int item)
    {
        try {
            // Before producer can produce an item,
            // it must acquire a permit from semProd
            semProd.acquire();
        }
        catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }

        // producer producing an item
//        this.item = item;
        try {
            mutex.acquire();
            store.add(item);
            System.out.println("Producer produced item : " + item);
            mutex.release();
        } catch (InterruptedException e) {}



        // After producer produces the item,
        // it releases semCon to notify consumer
        semCon.release();
    }
}

// Producer class
class Producer2 implements Runnable {
    Q2 q;
    Producer2(Q2 q)
    {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run()
    {
        for (int i = 0; i < 5; i++)
            // producer put items
            q.put(i);
    }
}

// Consumer class
class Consumer2 implements Runnable {
    Q2 q;
    Consumer2(Q2 q)
    {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run()
    {
        for (int i = 0; i < 5; i++)
            // consumer get items
            q.get();
    }
}

// Driver class
class PC2 {
    public static void main(String args[])
    {
        // creating buffer queue
        Q2 q = new Q2();

        // starting consumer thread
        new Consumer2(q);
//        new Consumer2(q);


        // starting producer thread
        new Producer2(q);
        new Producer2(q);
    }
}

