package Provas.P2_252.Questao1;

public class DoisIdsIguais extends Exception{
    private int IdDuplicado;

    public DoisIdsIguais(int id){
        super("IDs vizinhos duplicados" + id);
        this.IdDuplicado = id;

    }

    public int getIdDuplicado(){
        return IdDuplicado;
    }
}
