package exercicio2;

public class ThreadLab extends Thread {
	private static Object lock = new Object();

	public ThreadLab(String name) {
        super(name);
    }

	public void run() {
        synchronized(lock){    		
        	for(int i = 0; i < 10; i++){
    			System.out.println(getName());
    			try {
    				Thread.sleep(500);
    			} catch (InterruptedException e) {
    				e.printStackTrace();
    			}
    		}
        }
    }

}