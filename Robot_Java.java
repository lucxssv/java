public class Robo {
    String nome;
    String cor;
    
  public static void main(String args[]) {
      
    Robo obj1 = new Robo();
    
    obj1.nome = "R-801";
    obj1.cor = "Azul";
    
    System.out.println("O meu nome é " + obj1.nome);
    System.out.println("Minha cor é " + obj1.cor);
  }
}