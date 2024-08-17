package aula10.metodosDefault;
public class Executando {
    public static void main(String[] args) {

        Eletrodomestico tv = new Televisao();
        tv.ligar();
        tv.acionarTimer(5);
    }
}
