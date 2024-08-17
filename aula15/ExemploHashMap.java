package aula15;
import java.util.HashMap;
public class ExemploHashMap {
    public static void main(String[] args) {
        /* Cria um mapa de produtos chaveado por strings. */
        HashMap<String, Produto> map = new HashMap<>();
        /* Adiciona alguns produtos ao mapa. */
        map.put("leite",      new Produto("Leite em po",     "Laticinios", 5.80));
        map.put("cerveja",    new Produto("Cerveja em lata", "Bebidas",    1.89));
        map.put("detergente", new Produto("Detergente",      "Limpeza",    2.49));
        map.put("manteiga",   new Produto("Manteiga",        "Laticinios", 2.90));
        map.put("pasta",      new Produto("Pasta de dente",  "Limpeza",    1.75));
        /* Verifica se o mapa possui algum item com chave "cerveja" */
        System.out.println("A lista contém cerveja: " + 
        (map.containsKey("cerveja")? "SIM" : "NÃO"));
        /* Obtem o item com chave "pasta" */
        System.out.println(map.get("pasta"));
        /* Remove o item com chave "detergente" */
        System.out.println("Item removido: " + map.remove("detergente"));
        /* Mostra a quantidade de itens remanescentes no mapa */
        System.out.println("Itens na lista após a remoção: " + map.size());
        System.out.println("===========================");
        /* Exibe todos os itens do mapa. */
        map.forEach((k, v) -> System.out.println(v));
    }
}
