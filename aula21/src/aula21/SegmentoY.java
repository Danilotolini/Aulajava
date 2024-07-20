package aula21;

public class SegmentoY {
int montante;
	
	public void run(){
		synchronized(this){
			for(int a = 0; a <= 10; a++){
				montante += a;
			}
			notify();
		}
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

}
