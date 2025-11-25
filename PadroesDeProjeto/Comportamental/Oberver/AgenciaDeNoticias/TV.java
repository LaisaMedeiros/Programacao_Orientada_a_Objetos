package PadroesDeProjeto.Comportamental.Oberver.AgenciaDeNoticias;

public class TV implements Observer{
    @Override
    public void update (String noticia){
        System.out.println("TV exibindo noticia" + noticia + "\n");
    }
}
