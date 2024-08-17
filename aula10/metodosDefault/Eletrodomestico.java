package aula10.metodosDefault;
public interface Eletrodomestico {

public static final int n=2;

    void ligar();

    void desligar();

    default void acionarTimer(int segundos) {
        /* Aguarda a quantidade de minutos informada. */
        try { Thread.sleep(segundos * 1000); } catch (Exception e) {}
        /* Executa o método desligar conforme implementado na classe. */
        desligar();
    }
}
