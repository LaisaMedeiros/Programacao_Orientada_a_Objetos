package Provas.P1_252.Questao3;

public class ClasseA implements Classe{
    private int identificador;
    
    public ClasseA(int id){
        this.identificador = id;
    }

    @Override
    public int getIdentificador() {
        return identificador;
    }

    @Override
    public void imprimir() {
        System.out.print( identificador + " " );
    }


    
}
