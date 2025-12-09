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

// Na primeira linha: O construtor da classe concreta CriarSanduiche é chamado, e um novo objeto (instância) dessa classe é criado na memória;
// então a logica sempre é: criar um objeto da fabrica que vc quer gerar o ite, ai usar esse objeto da fabrica para chamar o metodo que retorna 
// uma instancia do item. Aantes eu tinha gerado uma sinatcnai da fabrica e n uma instabbcia do item
// O cliente (seu main) só precisa saber que tipo de fábrica usar (ex: CriarSanduiche).