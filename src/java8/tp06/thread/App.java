package java8.tp06.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {

	public static class MyThread extends Thread {
		public void run() {
			System.out.println( Thread.currentThread().getName() + "ce petite bonhomme c'est Butters ! Oui c'est moi ");
		}

	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		// basic method
		Thread t1 = new MyThread();
		
		// using anonyme class
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName() + "ce petite bonhomme c'est Harry ! des doutes ?? ");
			}
		});
		
		// using lambda expression instead of anonyme class (java 8)
		Thread t3 = new Thread( ()->{
			System.out.println(Thread.currentThread().getName() + "ce petite bonhomme c'est Jack ! des doutes ?? ");
		});

		t1.start();
		t2.start();
		t3.start();
		
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName() + ": Hello " + i);
			Thread.sleep(10);
		}
		//System.out.println("Thread runnable : " + Thread.currentThread().getName());
		
		ExecutorService es = Executors.newFixedThreadPool(5);
		Future<Integer> r1 = es.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
				Integer result = 0;
				for (int i = 0; i < 20; i++) {
					System.out.println(Thread.currentThread().getName() + ": Hello " + i);
					result+=i;
					Thread.sleep(20);
				}
				return result;
			}
			
		});
		
		Future<Integer> r2 = es.submit(() -> {
			Integer result = 0;
			for (int i = 0; i < 20; i++) {
				System.out.println(Thread.currentThread().getName() + ": Hello " + i);
				result+=i;
				Thread.sleep(20);
			}
			return result;
		});
				
		System.out.println("r1=" + r1.get());
		System.out.println("r2=" + r2.get());
		
		
		System.out.println();
		System.out.println("-----collectin of thread ----");
		System.out.println();
		
		Callable<Integer> callback = () -> {				
			Integer resultat = 0;
			for (int i = 0; i < 10; i++)
				resultat += i;
			Thread.sleep(100);
			System.out.println("Thread runnable " + Thread.currentThread().getName() + " resultat="+resultat);
			return resultat;
		};

		List<Callable<Integer>> ltasks = new ArrayList<Callable<Integer>>();
		for(int j = 0; j < 100; j++)
			ltasks.add(callback);

		List<Future<Integer>> lresultats = (List<Future<Integer>>) es.invokeAll(ltasks);

		for(Future<Integer> f : lresultats)
			System.out.println("Future : " + f.get());

		es.shutdown();
		System.out.println(es.getClass().getCanonicalName() + " shutdown");
	}


}
