package Provas.P3_252.Questao1;

public class ClasseA {
    private static int quantObjA;

    private ClasseA(){
        quantObjA += 1;
    }

    public static ClasseA getInstanceA(){
        if (quantObjA < (ClasseB.metodoB())/2){
            return new ClasseA();
        }
        throw new RuntimeException("Não pode criar!");
    }

    public static int metodoA(){
        return quantObjA;
    }

}
