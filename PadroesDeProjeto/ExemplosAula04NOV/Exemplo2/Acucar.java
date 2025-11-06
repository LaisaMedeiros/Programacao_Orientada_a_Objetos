package Padroes de Projeto.ExemplosAula04NOV.Exemplo2;

public class Acucar extends Adicional {
    public Acucar (Bebida beb){
        super ("Açucar ", beb);
    }
    @Override
    public String getDescricao(){
        return bebida.getDescricao() + "com açúcar";
    }

    @Override
    public double custo(){
        return bebida.custo() + 1;
    } 
}
