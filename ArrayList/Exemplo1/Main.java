package ArrayList.Exemplo1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Array dinâmico
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("José");
        System.out.println(nomes);
        
        System.out.println("Imprimindo o ArrayList");
        System.out.println("O tamanho do array é: " + nomes.size());
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        int ultimoIndice = nomes.size() - 1;
        System.out.println("O último índice do array é: " + ultimoIndice);

        //Array estático
        String[] nomes2 = new String[3];
        nomes2[0] = "João";
        nomes2[1] = "Maria";
        nomes2[2] = "José";

        System.out.println("Imprimindo array estático");
        for (int i = 0; i < nomes2.length; i++) {
            System.out.println(nomes2[i]);
        }
    }
}
