package Provas.P2_252.Questao2;

public class Metodo {
    public void metodo(Object[] vetObj){

        for(Object obj: vetObj){
            if(obj instanceof ClasseA){
                ClasseA a = (ClasseA) obj;
                a.printf();
            }else if (i instanceof ClasseB){
                ClasseB b = (ClasseB) obj;
                b.metB();
            }
        }
    }
}
