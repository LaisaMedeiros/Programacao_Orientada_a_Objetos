package Genericos.Par;

public class Par<T1, T2> {
    private T1 primeiro;
    private T2 segundo;

    public Par(T1 primeiro, T2 segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }
    
    public T1 getPrimeiro() {
        return primeiro;
    }

    public T2 getSegundo() {
        return segundo;
    }

    public void imprimirPar() {
        System.out.println("Par:("+ primeiro + ", " + segundo +")");
        System.out.println("Tipo do primeiro: " + primeiro.getClass().getSimpleName());
        System.out.println("Tipo do segundo: " + segundo.getClass().getSimpleName());
    }
}
