public class Matematica {
    
    static int mult(int a, int b){
        return a * b;
    }
    static double mult(double a, double b){
        return a * b;
    }
    static double mult(double a, double b, double c){
        return a * b * c;
    }
    
  public static void main(String[] args) {
    
    System.out.println("Mult: " + Matematica.mult(5, 3));
    System.out.println("Mult: " + Matematica.mult(3.2, 4.1));
    System.out.println("Mult: " + Matematica.mult(1.4, 2));
    System.out.println("Mult: " + Matematica.mult(2, 3.5));
    System.out.println("Mult: " + Matematica.mult(4.5, 5.2, 2));
  }
}