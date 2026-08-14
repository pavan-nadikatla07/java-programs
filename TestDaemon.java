class TestDaemon extends Thread 
{ 
 public void run() 
 { 
  System.out.println("Name: " + Thread.currentThread().getName()); 
  System.out.println("Daemon: " + Thread.currentThread().isDaemon()); 
 } 
 public static void main(String[] args) 
 { 
  TestDaemon t1=new TestDaemon();
  TestDaemon t2=new TestDaemon();
  t1.setDaemon(true);
  t1.start(); 
  try 
  { 
   t1.join(); 
  } 
  catch(InterruptedException e) 
  { 
   e.printStackTrace(); 
  } 
  System.out.println("Is Thread1 Alive? :" + t1.isAlive()); 
  t2.start(); 
 } 
 
} 
