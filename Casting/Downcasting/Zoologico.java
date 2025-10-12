package Casting.Downcasting;

public class Zoologico {
    // Função que recebe qualquer Animal e faz downcasting quando necessário
    public static void executarComportamentoEspecifico(Animal animal) {
        animal.mover(); // Método comum a todos
        
        // Downcasting para comportamentos específicos
        if (animal instanceof Peixe) {
            Peixe peixe = (Peixe) animal;
            peixe.bolhas();
        } else if (animal instanceof Passaro) {
            Passaro passaro = (Passaro) animal;
            passaro.cantar();
        }
    }
    
    public static void main(String[] args) {
        executarComportamentoEspecifico(new Peixe());
        executarComportamentoEspecifico(new Passaro());
    }
}