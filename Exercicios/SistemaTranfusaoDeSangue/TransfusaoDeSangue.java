package Exercicios.SistemaTranfusaoDeSangue;

// <T extends TipoSanguineo> indica que T deve ser um subtipo de TipoSanguineo
public class TransfusaoDeSangue {

    public static<T extends TipoSanguineo> void ehCompativel(Pessoa <T> doador, Pessoa <T> receptor){
        System.out.println("✅ Transfusão realizada: " + doador + " → " + receptor);
        System.out.println("   Tipos compatíveis: " + doador.getTipoSanguineo().getNomeTipo());
    }
}
