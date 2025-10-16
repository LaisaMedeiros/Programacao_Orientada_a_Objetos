public static void main(String args[])
{
  String frase = null;
  String novaFrase = null;
  try
  {
    novaFrase = frase.toUpperCase();
  }
  catch(NullPointerException e) //CAPTURA DA POSSÍVEL exceção.
  {
    //TRATAMENTO DA exceção
    System.out.println("O frase inicial está nula,
    para solucional tal o problema, foi lhe atribuito um valor default.");
    frase = "Frase vazia";
    novaFrase = frase.toUpperCase();
  }
  System.out.println("Frase antiga: "+frase);
  System.out.println("Frase nova: "+novaFrase);
}

//É um classe que tenta transformar uma frase em maiúsculo.
//caso a frase esteja nula e se tente usar o método toUpperCase() na mesma será lançada uma exceção de NullPointerException.
// O NullPointerException é uma classe de exceção em Java (especificamente, é uma subclasse de RuntimeException).
