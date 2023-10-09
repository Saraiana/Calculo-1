# Calculo-1
Cálculo utilizando 2 variáveis
A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Fazer um algoritmo que 
calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo: 
a. Professor Nível 1 R$12,00 por hora/aula;
b. Professor Nível 2 R$17,00 por hora/aula;
c. Professor Nível 3 R$25,00 por hora/aula.

# Código

package Exercicio33;

import java.util.*;

public class Main {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int horaAula;
        int nivel;
        float salario;
        
        System.out.println("Informe a quantidade de hora/aula");
        horaAula = leitor.nextInt();
        
        System.out.println("Informe o nível do professor, escolhendo entre 1, 2 ou 3");
        nivel = leitor.nextInt();

        if (nivel == 1){
        salario = (horaAula * 12);
        System.out.println(salario);
        } else {
        if (nivel == 2) {
        salario = (horaAula * 17);
        System.out.println(salario);
        } else {
        if (nivel == 3) {
        salario = (horaAula * 25);
        System.out.println(salario);
        } else {
        System.out.println("Nível inválido");
        }
        }
        }
        
    }
    
}
