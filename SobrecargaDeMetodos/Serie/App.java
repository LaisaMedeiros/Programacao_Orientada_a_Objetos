public class App {
    public static void main(String[] args) throws Exception {
        Serie serie1 = new Serie("Breaking Bad", 5, 2008);;
        //Chama o método toString da classe Object
        //Se não tivesse sido sobrescrito, iria imprimir algo como:
        //Imprime o nome da classe @ eo endereço de memória do objeto
        //System.out.println(serie1.toString()) os dois são a mesma coisa
        System.out.println(serie1); 
    }
}
