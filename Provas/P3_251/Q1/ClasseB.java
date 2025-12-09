package Provas.P3_251.Q1;

public class ClasseB extends Classes {
    private ClasseB(int tamanho){
        this.tamanho = tamanho;
    }
    public static ClasseB getInstanceA(int tamanho){
        if (contador % 3 == 0){
            ClasseB obj = new ClasseB(tamanho);
            contador++;
            return obj;
        } else {
            return null;
        }
    }
}