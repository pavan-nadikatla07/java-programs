class DaemonThreadEx extends Thread 
{ 
 public void run() 
 { int count = 0;
   while (true) 
   { 
     count++;
     try 
     {  
      Thread.sleep(1000); 
      System.out.println("Daemon Thread is running. Count: " + count); 
     }
     catch (InterruptedException e) 
     { 
      System.out.println("Daemon thread interrupted"); } 
     } 
   } 
 } 
 class DaemonThreadDemo 
 {
  public static void main(String[] args) throws InterruptedException 
  {  
    DaemonThreadEx daemonThread = new DaemonThreadEx(); 
    daemonThread.setDaemon(true); 
    daemonThread.start(); 
    for (int i = 0; i < 5; i++) 
    { 
      System.out.println("Main thread is doing some work. Iteration: " + (i + 1)); 
      Thread.sleep(1500); 
    } 
    System.out.println("Main thread is done. Exiting program..."); 
  } 
} 
