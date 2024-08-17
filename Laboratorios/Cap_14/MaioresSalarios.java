package Laboratorios.Cap_14;
public class MaioresSalarios {
    public static void main(String[] args) {
        double[] salariosBrutos = { 1350.0, 4320.15, 8235.25, 2500.55, 1830.0, 
        		850.26, 3614.29, 12500.0 };
        System.out.println("Salários Brutos:");
        DoubleArrayUtils.processaValores(salariosBrutos, d -> 
        System.out.println(d));
        
        System.out.println("\nSalários TOP (acima de R$ 3.000,00 :");
        double[] salariosTop = 
        DoubleArrayUtils.filtraValores(salariosBrutos, 
        		d -> d >= 3000);
        
        DoubleArrayUtils.processaValores(salariosTop, 
        		d -> System.out.println(d));
    }
}
