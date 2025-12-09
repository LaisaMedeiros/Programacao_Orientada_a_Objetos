package Provas.P3_251.Q1;

public class ClasseC extends Classes {
    private ClasseC(int tamanho){
        this.tamanho = tamanho;
    }
    public static ClasseC getInstanceA(int tamanho){
        if (contador % 3 == 0){
            ClasseC obj = new ClasseC(tamanho);
            contador++;
            return obj;
        } else {
            return null;
        }
    }
}