package modulo10introducao;

public class Executando {
public static void main(String[] args) { 
	Eletrodomestico aparelho; 
	
	aparelho = new Geladeira(); 
	aparelho.ligar(); 
	
	aparelho = new Televisao(); 
	aparelho.ligar(); 
	
	aparelho = new Microondas(); 
	aparelho.ligar(); 
} 
 
Eletrodomestico tv = new Televisao();  
tv = new Televisao();
	tv.ligar(); 
	tv.acionarTime(60)
}
