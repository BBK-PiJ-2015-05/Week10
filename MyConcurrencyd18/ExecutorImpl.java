import java.util.concurrent.*;
import java.util.Stack;
import java.util.ArrayDeque;

/**
* Week 10, day 19
* 3. Responsive UI
* Sarah Connor
*/

public class ExecutorImpl implements Executor{
	
	private TaskManager taskManager;
	
	public ExecutorImpl(){
		this.taskManager = new TaskManager();
		Thread t = new Thread(taskManager);
		t.start();
	}

	public void execute(Runnable command){
		this.taskManager.add(command);
	}
	
	public int getMaxPendingTime(){
		return taskManager.getQueueSize() * 1000;
	}
		
	public void shutdown(){
		taskManager.shutdown();
	}

}
