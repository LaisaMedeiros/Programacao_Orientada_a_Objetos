package SobrecargaDeMetodos.Jogo;
public class App {
    public static void main(String[] args) throws Exception {
        Personagem personagem1 = new Personagem("Aragorn");
        System.out.println(personagem1);
        Arqueiro personagem2 = new Arqueiro("Legolas");
        System.out.println(personagem2);
    }
}
