package Polimorfismo.DevFlix;

public class App {
    public static void main(String[] args) {
        Video video = new Video("Aula de POO");
        video.play();
        Filme filme = new Filme("Inception");
        //filme.play();
        //filme.play("Inglês");
        //filme.play("Inglês", "Espanhol");
        filme.play("Japonês");
        Serie serie = new Serie("Dark", 3, 8);
        System.out.println(serie);
    }
    
}
