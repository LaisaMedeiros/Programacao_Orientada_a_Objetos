package Provas.P2_252.Questao1;

import java.util.ArrayList;

public class Sistema {
    private static ArrayList <Senha> senhas = new ArrayList<>();

    public void proximo() throws DoisIdsIguais{
        int indiceMenorSenha = 0;
        for (int i = 1; i< senhas.size(); i++){
            if (senhas.get(i).getId() < senhas.get(indiceMenorSenha).getId()){
                indiceMenorSenha = i; 
            }
            if (senhas.get(i).getId() == senhas.get(i-1).getId()){
                throw new DoisIdsIguais(i);
            }
        }
        senhas.remove(indiceMenorSenha);
    }

    public boolean estaVazio(){
        if (senhas.isEmpty()){
            return true;
        }
        return false;
    }

    public void removerIdDuplicado(int id){
        senhas.remove(id);
    }
}
