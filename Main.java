/*
1ª) Criar uma Classe chamada Triangulo que contenha como atributos a base e altura de um triângulo. Na classe definir um método para leitura da base e altura, um método construtor e um método para Calcular a área do triângulo (Area=Base * Altura)/2.
No método principal do programa (main) , criar um objeto a partir da classe criada, solicitar e atribuir os valores da base e altura e invocar o método que calcula a área a partir do objeto criado.
*/
import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    Triangulo t = new Triangulo();
    String input = JOptionPane.showInputDialog("Base do triângulo");
    double base = Integer.parseInt(input);
    t.setBase(base);
    double altura = Integer.parseInt(input);
    input = JOptionPane.showInputDialog("Altura do triângulo");
    t.setAltura(altura);
    double area = t.calcularArea();
    JOptionPane.showMessageDialog(null, "Área do triângulo: " + area);
  }
}