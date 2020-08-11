package javamultithreadingpractice.covid19.learning;

public class CPUIntensiveTask implements Runnable {
		public void run() {
			for(int i = 9999000; i<9999999; i++)
				if(isPrimary(i)) {
				System.out.println( Thread.currentThread().getName() +"-"+ i + "-" + Thread.currentThread().getPriority());
				try {
					Thread.currentThread().sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
		}

		private boolean isPrimary(int i) {
			if(factors(i) < 1)
				return true;
			return false;
		}

		private int factors(int i) {
			int count = 0;
			for(int j=2; j<i; j++)
			{
				if(i%j == 0)
				{
					count++;
				}
			if (count >2)
				break;
			}
		return count;	
		}
	}

