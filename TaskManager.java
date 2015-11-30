import java.util.concurrent.*;
import java.util.Stack;
import java.util.ArrayDeque;


/**
* Week 10, day 19
* 3. Responsive UI
* Sarah Connor
*/

public class TaskManager implements Runnable{
	
	private boolean running = true;

	private ArrayDeque<Runnable>  taskQueue = new ArrayDeque<Runnable>();
	
	public void run(){
		while (running){
			while(!taskQueue.isEmpty()){
				Runnable task = taskQueue.poll();
				task.run();
			}
			if(running){
				synchronized(this){
					try{
						wait();
					}catch(InterruptedException e){
							System.out.println("Thread Interrupted");
					}					
				}
			}
		}
		System.out.println("Task Manager's thread finished!");
		
	}
	
	public synchronized void add(Runnable task){
		if(running){
			taskQueue.offer(task);
			notifyAll();
		}
	}
	
	public int getQueueSize(){
		return taskQueue.size();
	}
	
	public boolean getRunning(){
		return this.running;
	}
	
	public void shutdown(){
		running = false;
	}

}