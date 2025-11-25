package PadroesDeProjeto.Criacional.Singleton.Exemplo3;

public class Configuracao {

    private static Configuracao instance;
    private String idioma;
    private String tema;

    private Configuracao(){
        idioma = "Portugues";
        tema = "Claro";
    }

    public static Configuracao getInstance(){
        if (instance == null){
            instance = new Configuracao();
        }
        return instance;
    }

    public String getIdioma(){
        return idioma;
    }

    public String getTema(){
        return tema;
    }

    public void setIdioma(String idioma){
        this.idioma = idioma;
    }

    public void setTema(String tema){
        this.tema = tema;
    }
}
