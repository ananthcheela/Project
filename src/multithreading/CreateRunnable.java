package multithreading;

public class CreateRunnable implements Runnable{
	
	public void run() 
	{
		for(int i=0; i < 10; i++)
		{
			System.out.println("Inside run" + Thread.currentThread().getName() + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		CreateRunnable cr = new CreateRunnable();
		Thread t = new Thread(cr);
		t.start();
		
		Thread t1 = new Thread(cr);
		t1.start();
		
		Thread t2 = new Thread(cr);
		t2.start();
		
		t.join();
		t1.join();
		
		for(int i =0; i < 10; i++){
		System.out.println(Thread.currentThread().getName()+i);
		Thread.sleep(2000);
		}
		
	}

	
	
}
