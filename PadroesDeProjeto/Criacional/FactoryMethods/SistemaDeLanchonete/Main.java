package PadroesDeProjeto.Criacional.FactoryMethods.SistemaDeLanchonete;

public class Main {
    public static void main (String args[]){
        CriadorDeLanches FabDeSanduiche = new CriarSanduiche();
        //entregarLanche() é um método da classe abstrata CriadorDeLanches
        // como FabDeSanduiche é uma subclasse de CriadorDeLanches, ela herda esse método
        // o meotod criarLanche que retorna um Sanduiche é pego de dentro da propria classe CriarSanduiche
        FabDeSanduiche.entregarLanche();
    }
}
