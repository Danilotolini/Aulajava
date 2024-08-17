package aula11;
public class Executando {
    public static void main(String[] args) {
        try {
            Conta c = new ContaPoupanca();
            ContaPoupanca c1 = (ContaPoupanca) c;
            
//            ContaCorrente cc = (ContaCorrente) c;
            c1.debitarTarifa(35.5);

        } catch (ClassCastException e) {
            System.out.println("Conta de tipo incompatível.");
            e.printStackTrace();
        }
    }
}
