package Exercicios.ReceitaFederal;

public class ComparadorContribuintes{
    /**
     * Compara dois contribuintes da mesma categoria
     */
    public static  <T extends Categoria> String comparar(Contribuinte<T> contribuinte1, Contribuinte<T> contribuinte2) {
        // A garantia de mesma categoria já vem do tipo genérico T
        
        if (contribuinte1.getPontos() > contribuinte2.getPontos()) {
            return contribuinte1.getNome() + " tem mais pontos que " + contribuinte2.getNome();
        } else if (contribuinte1.getPontos() < contribuinte2.getPontos()) {
            return contribuinte2.getNome() + " tem mais pontos que " + contribuinte1.getNome();
        } else {
            return contribuinte1.getNome() + " e " + contribuinte2.getNome() + " estão empatados";
        }
    } 
    
}
