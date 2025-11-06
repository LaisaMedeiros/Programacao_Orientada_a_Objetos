package Padroes de Projeto.ExemplosAula04NOV.Exemplo3;

public class NewsAgency {
    private  String news;
    private List<Channel> channels = new ArrayList<>();
    private void addObserver(Channel channel){
        this.channel.add(channel);
    }
    public void removeObserver(Channel channel){
        this.channel remove(channel);
    }
    public void setNews(String news){
        this.news = news;
        for (Channel channel: this.channels){
            channel.update(this.news);
        }
    }
}
