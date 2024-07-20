package exercicio1;

public class ThreadLab extends Thread {
	public ThreadLab(String a) { 
		super(a);
	}
	public void run(){ 
		for(int a = 0; a <= 10; a++){ 
		System.out.println(getName());
		}
		try { 
			Thread.sleep(1000);
	} catch(InterruptedException e) { 
		e.printStackTrace();
	}
}
}