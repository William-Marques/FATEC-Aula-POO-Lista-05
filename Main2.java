/*
2ª) Criar uma Classe chamada Equacao que contenha como atributos 3 valores inteiros, A, 
B e C. Na classe definir um método para leitura dos valores, um método construtor e um 
método para calcular as raízes da equação.
R1 = -b+ (raiz de delta) / (2*a)
R2 = -b-(raiz de delta) / (2*a)
Considerar que:
- Se delta = 0, as raízes são iguais;
- Se delta <0, não existem raízes reais;
- Se delta >=, existem 2 raízes diferentes
No método principal do programa (main) , criar um objeto a partir da classe criada, solicitar 
e atribuir os valores e invocar o método que calcula as raízes a partir do objeto criado.
*/
import javax.swing.JOptionPane;

public class Main2 {
    public static void main(String[] args) {

        try {
            Integer a = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de A:"));
            Integer b = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de B:"));
            Integer c = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de C:"));
            
            Equacao equacao = new Equacao(a, b, c);
            equacao.calcularRaiz();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro, o valor enviado é inválido");
        }
    }
}