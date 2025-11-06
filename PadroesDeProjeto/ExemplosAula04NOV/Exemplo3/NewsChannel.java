package Padroes de Projeto.ExemplosAula04NOV.Exemplo3;

public class NewsChannel implements Channel {
    private String news;

    @Override
    public void update(Object new){
        this.setNews((String) news);
    }
}
