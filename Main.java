
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
