package PadroesDeProjeto.ExemplosAula04NOV.Exemplo2;

// Component Interface
public abstract class Bebida {
    // Armazena a descrição base, que será manipulada pelos decoradores.
    public String descricao;

    // construtor
    public Bebida (String descricao){
        this.descricao = descricao;
    }

    // Método para obter o nome/descrição da bebida
    // Não precisos er sobrescrito, pois já pertence as classes filhas
    public String getDescricao(){
        return descricao;
    }

    // Método para calcular o custo da bebida
    public abstract double custo();
}
