package Laboratorios.Cap_04;
public class CopaDoMundo 
{
    public static void main(String[] args) 
    {
        for (int ano = 1930; ano <= 2022; ano += 4) 
        {
            if (ano == 1942 || ano == 1946) 
            {
                continue;
            }
            System.out.println("Copa do mundo de " + ano + "!");
        }
    }
}