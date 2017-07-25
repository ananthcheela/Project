package multithreading;

public class CreateThread extends Thread {
	
	public void run(){
		
		for(int i = 0; i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		CreateThread ct = new CreateThread();
		ct.start();
		for(int i = 0; i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+ i);
			Thread.sleep(1000);
		}
		
	}

}
