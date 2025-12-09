package Provas.P2_252.Questao1;

public class Main {
    public static void main (String args[]){
        Sistema sistema = new Sistema();
        while (!sistema.estaVazio()) {
            try{
                sistema.proximo();
            }
            catch (DoisIdsIguais e) {
                System.out.println(e.getMessage());
                sistema.removerIdDuplicado(e.getIdDuplicado());
            }
        }
    }
}
