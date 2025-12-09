package Provas.P3_252.Questao1;

public class ClasseB {
    private static int quantObjB;

    private ClasseB(){
        quantObjB += 1;
    }


    public static int metodoB(){
        return quantObjB;
    }
}
