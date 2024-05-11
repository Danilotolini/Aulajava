package modulo10introducao;
public interface Eletrodomestico {
		    void ligar();
		    void desligar(); 
		    
		    static void acionarTimer(int minutos) { 
		    	
		    	try { Thread.sleep(minutos * 60000); } catch (Exception e) {}
		    	desligar();
		    	}
		}
