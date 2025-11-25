package Excecoes.OutrosExercicios.Exercicio7;

public class Main {
    public static void main(String args[]){
        Funcionario allan = new Funcionario("Allan", "TI", 1234, 25, null, 100.0);
        Funcionario beatriz = new Funcionario("Beatriz", "RH", 5678, 30, beatriz, 150.0);

        try{
            beatriz.setChefe(beatriz);
        } catch(ChefeInvalidoException e){
            System.out.println(e.getMessage());
        } 


        try{
            beatriz.setChefe(allan);
            System.out.println(beatriz.getNome() + " agora tem como chefe " + beatriz.getChefe().getNome());
        } catch(ChefeInvalidoException e){
            System.out.println(e.getMessage());
    }     
}
