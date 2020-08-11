package javamultithreadingpractice.covid19.learning;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
	public static void main(String args[]) {
	
//	int numberOfCores = Runtime.getRuntime().availableProcessors();
//	System.out.println(numberOfCores);
	ExecutorService service = Executors.newFixedThreadPool(8);
	
	for (int i=0; i<10; i++) {
		service.execute(new CPUIntensiveTask());
	}
}
}
