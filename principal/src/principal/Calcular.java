package principal;  // abertur do pacote do projeto

import java.util.Scanner; // importação da classe scanner

public class Calcular {  // abertura da clase secunária
    int a,b,c,d; // declaração das variáveis que serão utilizadas para os calculos
    Scanner ler = new Scanner(System.in);  // obejeto ler criado a partir da classe scanner
    
    public void calcular_area(){ // criação abertura do método para calcular área
        System.out.println("Digite a base e a altura");  // comando para mostrar mensagem na tela
        a = ler.nextInt(); // atribuição de um valor digitado para a variável a
        b = ler.nextInt(); // atribuição de um valor digitado para a variável b
        System.out.println("A area é"+a*b/2); // comando para mostrar mensagem na tela junto com o calculo a ser realizado
    }
    public void calcular_area_retangulo(){ // criação e abertura do método para calcular área do retângulo
        System.out.println("Digite a base e a altura"); // comando para mostrar mensagem na tela
        a = ler.nextInt(); // atribuição de um valor digitado para a variável a
        b = ler.nextInt(); // atribuição de um valor digitado para a variável b
        System.out.println("A area é"+a*b);  // comando para mostrar mensagem na tela junto com o calculo a ser realizado
    
} // fechamento do método para calcular área do retângulo
}
