class Contador {
    static int totalObjetos = 0; // existe apenas 1 vez, compartilhado por todos

    Contador() {
        totalObjetos++; // incrementa o total sempre que um objeto é criado
    }
}
