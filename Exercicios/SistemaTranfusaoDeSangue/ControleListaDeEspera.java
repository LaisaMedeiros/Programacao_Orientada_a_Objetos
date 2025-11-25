package Exercicios.SistemaTranfusaoDeSangue;

import java.util.ArrayList;
import java.util.List;

// classe generica 
public class ControleListaDeEspera <T extends TipoSanguineo> implements Subject{
    private List<Observer> listaEspera = new ArrayList<>();
    

    @Override
    public void adicionar(Observer<T> observer){

    }
    
}
