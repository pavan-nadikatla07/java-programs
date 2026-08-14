class Buffer 
{
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) throws InterruptedException 
    {
        while (available) 
        { 
            wait();
        }
        data = value;
        available = true;
        System.out.println("Produced: " + data);
        notify();
    }
    public synchronized int consume() throws InterruptedException 
    {
        while (!available) 
        { 
            wait();
        }
        available = false;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }
}
class Producer extends Thread 
{
    private Buffer buffer;

    Producer(Buffer buffer) 
    {
        this.buffer = buffer;
    }

    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            try 
            {
                buffer.produce(i);
                Thread.sleep(500);
            } 
            catch (InterruptedException e) 
            {
                System.out.println("Producer interrupted.");
            }
        }
    }
}
class Consumer extends Thread 
{
    private Buffer buffer;
   Consumer(Buffer buffer) 
   {
        this.buffer = buffer;
   }
   public void run() 
   {
        for (int i = 1; i <= 5; i++) 
        {
            try 
            {
                buffer.consume();
                Thread.sleep(800);
            } 
            catch (InterruptedException e) 
            {
                System.out.println("Consumer interrupted.");
            }
        }
    }
}
public class ProducerConsumerExample 
{
    public static void main(String[] args) 
    {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        producer.start();
        consumer.start();
   }
}