package PadroesDeProjeto.ExemplosAula04NOV.Exemplo1;

// Solução 2: Instanciação preguiçosa

public class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
