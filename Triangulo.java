/*
1ª) Criar uma Classe chamada Triangulo que contenha como atributos a base e altura de um triângulo. Na classe definir um método para leitura da base e altura, um método construtor e um método para Calcular a área do triângulo (Area=Base * Altura)/2.
No método principal do programa (main) , criar um objeto a partir da classe criada, solicitar e atribuir os valores da base e altura e invocar o método que calcula a área a partir do objeto criado.
*/
public class Triangulo{
  private double base;
  private double altura;

  public Triangulo(){
    
  }
  
  public Triangulo(double base, double altura){
    this.base = base;
    this.altura = altura;
  }
  
  public double calcularArea(){
    return (this.base * this.altura)/2;
  }

  public double getBase(){
    return this.base;
  }

  public void setBase(double base){
    this.base = base;
  }

  public double getAltura(){
    return this.base;
  }

  public void setAltura(double altura){
    this.altura = altura;
  }
}