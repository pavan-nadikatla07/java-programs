class OwnThreadsss extends Thread
{
 public void run()
 {
  if(Thread.currentThread().getName().equals("thread1"))
  {
   for(int i=0;i<5;i++)
   {
    try
    {
     Thread.sleep(1000);
    }
    catch(Exception e)
    {}
    System.out.println("GOOD MORNING");
   }
  }
  if(Thread.currentThread().getName().equals("thread2"))
  {
   for(int i=0;i<5;i++)
   {
    try
    {
     Thread.sleep(2000);
    }
    catch(Exception e)
    {}
    System.out.println("HELLO...!");
   }
  }
   if(Thread.currentThread().getName().equals("thread3"))
  {
   for(int i=0;i<5;i++)
   {
    try
    {
     Thread.sleep(3000);
    }
    catch(Exception e)
    {}
    System.out.println("WELCOME");
   }
  }
 }
 public static void main(String args[])
 {
  OwnThreadsss t1=new OwnThreadsss();
  OwnThreadsss t2=new OwnThreadsss();
  OwnThreadsss t3=new OwnThreadsss();
  t1.setName("thread1");
  t2.setName("thread2");
  t3.setName("thread3");
  t1.start();
  t2.start();
  t3.start();
 }
}