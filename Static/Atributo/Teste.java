public class Teste {
    public static void main(String[] args) {
        Contador c1 = new Contador(); // 1º objeto criado → totalObjetos = 1
        Contador c2 = new Contador(); // 2º objeto criado → totalObjetos = 2
        Contador c3 = new Contador(); // 3º objeto criado → totalObjetos = 3

        System.out.println("Total de objetos: " + Contador.totalObjetos);
    }
}
