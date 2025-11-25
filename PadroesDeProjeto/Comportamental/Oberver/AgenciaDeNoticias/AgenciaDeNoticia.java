package PadroesDeProjeto.Comportamental.Oberver.AgenciaDeNoticias;

import java.util.List;
import java.util.ArrayList;

public class AgenciaDeNoticia implements Subject{
    private List<Observer> observers = new ArrayList<>();
    
    @Override
    public void adicionar(Observer o){
        observers.add(o);
    }

    @Override
    public void remover(Observer o){
        observers.remove(o);
    }

    // metodo para notificar evento
    @Override
    public void notificar(String noticia){
        for (Observer o : observers){
            o.update(noticia);
        }
    }
    // metodo para realizar evento
    public void publicarNoticia(String noticia){
        System.out.println("Agencia: Nova noticia publicada\n" + noticia);
        notificar(noticia);
    }

}
