package ProvasAntigas.P3_2025.Q1;

public class Classes {
    protected int tamanho;
    private static int quantidade = 0;

    public Classes(int tamanho){
        this.tamanho = tamanho;
    }

    public static void CriacaoDeObjetos(int tamanho){
        switch (quantidade % 3){
            case 0:
                new ClasseA(tamanho);
                quantidade++;
                break;
            case 1:
                new ClasseB(tamanho);
                quantidade++;
                break;
            case 2:
                new ClasseC (tamanho);
                quantidade++;
                break;
                
        }
    }
    
}
