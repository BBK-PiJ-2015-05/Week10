import java.util.concurrent.*;

/**
* Week 10, day 19
* 3. Responsive UI
* Sarah Connor
*/

public class TimedTask implements Runnable{
	private final static int MAX_PENDING_TIME = 1000;
	private int pendingTime;
	
	public TimedTask(int pendingTime){
		if(pendingTime <= MAX_PENDING_TIME){
			this.pendingTime = pendingTime;
		}else{
			this.pendingTime = MAX_PENDING_TIME;
		}
		
	}

	public void run(){
		try{
			Thread.sleep(pendingTime);
		}catch(InterruptedException e){
			Thread.currentThread().interrupt();
		}
		
	}
}