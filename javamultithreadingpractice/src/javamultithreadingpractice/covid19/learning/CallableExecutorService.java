package javamultithreadingpractice.covid19.learning;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableExecutorService {

	public static void main(String args[]) throws TimeoutException {
		ExecutorService service = Executors.newFixedThreadPool(10);
		Future<Integer> value = service.submit(new CallableTask());
		
		System.out.println("Before try block");
		try {
			Integer result = value.get(6,TimeUnit.SECONDS);
			//Integer result = value.get();
			System.out.println(result);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Afer try block");
	}
}


