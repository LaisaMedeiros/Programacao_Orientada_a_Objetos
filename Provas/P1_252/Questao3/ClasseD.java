package Provas.P1_252.Questao3;

import java.util.ArrayList;

public class ClasseD <T extends Classe>{
    private ArrayList<T> listaClasses = new ArrayList<T>();

    public boolean removerElemento(int identificador){
        //remove o objeto pelo identificador
        //percorre e lista
        for (T obj: listaClasses){
            if (obj.getIdentificador() == identificador){
                listaClasses.remove(obj);
                return true;
            }
        }
        return false;
    }
    public boolean inserirElemento(T objeto){
        listaClasses.add(0, objeto);
        return true;
    }

    public void imprimirEmOrdem(){
        for(T obj: listaClasses){
            obj.imprimir();
        }
    }

}
