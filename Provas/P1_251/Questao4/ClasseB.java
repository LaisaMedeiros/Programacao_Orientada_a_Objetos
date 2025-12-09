package Provas.P1_251.Questao4;

public class ClasseB {
    private static int quantObjB;

    private ClasseB(){
        quantObjB++;
    }

    public static ClasseB getInstance(){
        if (ClasseA.getQuantA() > quantObjB){
            return new ClasseB();
        }
        else{
            return null;
        }
    }
}
