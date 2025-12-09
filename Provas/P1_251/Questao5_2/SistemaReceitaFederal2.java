package Provas.P1_251.Questao5_2;

public class SistemaReceitaFederal2 {
    public String comparaContribuintes(Contribuinte c1, Contribuinte c2){
        if (c1.getClass() != c2.getClass()){
            return "Os dois objetos são de classes diferentes";
        }
        if (c1.getPontos() > c2.getPontos()) {
            return c1.getNome() + " tem mais pontos que " + c2.getNome();
        } else if (c2.getPontos() > c1.getPontos()) {
            return c2.getNome() + " tem mais pontos que " + c1.getNome();
        } else {
            return c1.getNome() + " e " + c2.getNome() + " estão empatados";
        }
    }
}
