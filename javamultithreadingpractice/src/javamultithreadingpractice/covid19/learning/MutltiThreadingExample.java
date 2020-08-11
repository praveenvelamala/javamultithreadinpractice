package javamultithreadingpractice.covid19.learning;

public class MutltiThreadingExample {

	public static void main(String args[]) throws InterruptedException {
		Thread thread1 = new Thread(new CPUIntensiveTask());
		Thread thread2 = new Thread(new CPUIntensiveTask());
		Thread thread3 = new Thread(new CPUIntensiveTask());
		Thread thread4 = new Thread(new CPUIntensiveTask());

		thread1.setPriority(10);
		thread4.setPriority(1);
		thread2.setPriority(5);
		thread3.setPriority(5);
		thread1.start();
		//thread1.join();  //This is will help to make it serial exection.  
		thread2.start();
		thread3.start();
		thread4.start();
	}
	
	
}
