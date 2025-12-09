package Provas.P3_251.Q1;

import javax.management.RuntimeErrorException;

public class ClasseA extends Classes {
    private ClasseA(int tamanho){
        this.tamanho = tamanho;
    }
    public static ClasseA getInstanceA(int tamanho){
        if (contador % 3 == 0){
            ClasseA obj = new ClasseA(tamanho);
            contador++;
            return obj;
        } else {
            return null;
        }
    }
}
