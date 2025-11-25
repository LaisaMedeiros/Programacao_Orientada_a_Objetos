package PadroesDeProjeto.Comportamental.Oberver.AgenciaDeNoticias;

public class Jornal implements Observer {
    @Override
    public void update(String noticia){
        System.out.println("Jornal recebeu noticia" + noticia + "\n");

    }
}
