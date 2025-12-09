package Provas.P1_251.Questao5;

public class SistemaReceitaFederal {
    public <T extends Contribuinte> String comparaContribuintes(T contribuinte1, T contribuinte2){
        if (contribuinte1.getPontos() > contribuinte2.getPontos()){
            return "O contribuinte" + contribuinte1.getNome() + "é maior";
        } else if (contribuinte1.getPontos() < contribuinte2.getPontos()){
            return "O contribuinte" + contribuinte2.getNome() + "é maior";
        } else {
            return "Os dois contribuintes tem a mesma quantidade de pontos";
        }
    }
}
 