package Exercicios.ContadorDeObjetos;

public class ClassB {
    private static int contador = 0;

    public ClassB() {
       if (contador > ClassA.getContador()){
            System.out.println("Esse objeto não pode ser criado");
       }
       else{
            contador++;
       }
    }

    public int getContador(){
        return contador;
    }

}
