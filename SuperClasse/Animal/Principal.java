public class Principal {
    public static void main(String[] args) {
        Cachorro c = new Cachorro("Amora");
        c.comer();
        c.beber();
        c.latir();
        c.lamber();
        
        Gato g = new Gato("Gatinho");
        g.comer();
        g.beber();
        g.miar();
        
        Dragao d = new Dragao("Bangela");
        d.soltarFogo();
        d.voar();
    }
}