import java.util.concurrent.*;

/**
* Week 10, day 19
* 2. Text Loops 2.0
* Sarah Connor
*/

public class TextLoops2 implements Runnable {
	public static final int COUNT = 10;
	
	private final String name;
	
	public TextLoops2(String name) {
		this.name = name;
	}
	
	/* 
	* if run is called without threads, the for loop will be completed fully before returning
	* if the run() is called by threads, they can be interrupted
	* because the iterator i is a local variable, each thread will have its own copy
	*/
	
	@Override
	public void run() {
		for (int i = 0; i < COUNT; i++) {
			System.out.println("Loop:" + name + ", iteration:" + i + ".");
		}
	}
	
	public static void main(String args[]) {
		ExecutorService e = Executors.newFixedThreadPool(10);
		if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
			System.out.println("USAGE: java TextLoop <mode>");
			System.out.println(" mode 0: without threads");
			System.out.println(" mode 1: with threads");
		} else if (args[0].equals("0")) {
			for (int i = 0; i < 10; i++) {
				//TextLoop implements Runnable and can be declared as the super class
				Runnable r = new TextLoops2("Thread " + i);
				//class TextLoop overrides the run() of Runnable
				r.run();
			}
		} else {
			for (int i = 0; i < 10; i++) {
				Runnable r = new TextLoops2("Thread " + i);
				e.execute(r);
			}
			e.shutdown();
				while (!e.isTerminated()) {
			}
			System.out.println("Finished all threads");
		}
	}
}