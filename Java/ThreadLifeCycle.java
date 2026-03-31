
/* 
 Life Cycle of a Thread :
 1. New Born State : When a thread is created, it is in the new born state. It is not yet started and is not eligible for scheduling.

 2. Runnable State : When a thread is started using the start() method, it enters the runnable state. In this state, the thread is eligible for scheduling and can be executed by the CPU.

 3. Running State : When the thread scheduler picks a thread from the runnable pool, it enters the running state. The thread executes its task until it completes or is interrupted.

 4. Blocked State : A thread can enter the blocked state when it is waiting for a resource or an event to occur. For example, if a thread tries to access a synchronized block of code that is already locked by another thread, it will enter the blocked state until the lock is released.

 5. Waiting State : A thread can enter the waiting state when it is waiting for another thread to perform a specific action. For example, if a thread calls the wait() method, it will enter the waiting state until another thread calls notify() or notifyAll() to wake it up.

 6. Terminated State : A thread enters the terminated state when its run() method completes or when it is interrupted. Once a thread is in this state, it cannot be restarted.

--------------
 1.New       |
--------------

--------------
 2.Runnable  | ---------------
--------------                |
                              |             --------------------------  
                              -> ----------->4.Non-Runnable(Blocked)  |
                              |             --------------------------  
--------------                |
 3.Running   | ---------------
--------------

--------------
 4.Terminated|
--------------


*/
public class ThreadLifeCycle {
  public void main(String args[])
  {
   
  }
}
