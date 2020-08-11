package javamultithreadingpractice.covid19.learning;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		return new Random().nextInt();
	}

	
}
