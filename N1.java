/*
 * Copyright (C) 2024 Kauã de Oliveira Honorato
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package avaliacao.n1;
import java.util.Scanner;

/**
 *
 * @author Kauã de Oliveira Honorato
 *(08/02/2024)
 **/


public class N1 { //Declara a Classe
    
    public static void main(String[] args) { //Declara o tipo
        
        int opcao = 0, qde_expresso=0, qde_capuccino=0, //Declara as variáveis
            qde_leite_com_cafe=0, qde_cafes_vendidos;
        double valor_expresso, valor_capuccino,
            valor_leite_com_cafe, valor_cafes_vendidos;
        
        Scanner sc = new Scanner(System.in); //Atribui um comando pro método Scanner
    
        do {
        
                System.out.println("Forneça uma opção: \n"+ //Emite na tela uma mensagem com todas as opções
                                    "1 ­ café expresso; \n"+
                                    "2 ­ café capuccino; \n"+
                                    "3 ­ leite com café; \n"+
                                    "4 ­ totalizar vendas;");
      
                opcao = sc.nextInt(); //lê a entrada com o valor da opção
      
                if ( opcao == 1 ) qde_expresso++; //inicia o laço de repetição que soma a quantidade de cada item vendido
                                                          
                else if (opcao == 2) qde_capuccino++;
                else if (opcao == 3) qde_leite_com_cafe++;
                else if (opcao != 4) System.out.println("Opção inválida"); //mensagem de erro caso o usuário insira uma opção inválida
                                                                                 
      
        } while ( opcao != 4); //inicia a exceção para quando o valor inserido for igual a 4
    
     
        //calcula o valor vendido de cada item antes de finalizar as vendas
        valor_expresso = qde_expresso*0.75; 
        valor_capuccino = qde_capuccino;    
        valor_leite_com_cafe = qde_leite_com_cafe*1.25;     
        qde_cafes_vendidos = qde_expresso + qde_capuccino + qde_leite_com_cafe;
        valor_cafes_vendidos = valor_expresso + valor_capuccino + valor_leite_com_cafe;
    
        
        //exibe a quantidade e o valor de cada item vendido antes de finalizar as vendas
        System.out.println("Qde café expresso: "+qde_expresso+" ­ valor: "+valor_expresso);
        System.out.println("Qde café capuccino: "+qde_capuccino+" ­ valor: "+valor_capuccino);    
        System.out.println("Qde leite com café: "+qde_leite_com_cafe+
                            " ­ valor: "+valor_leite_com_cafe);        
        System.out.println("Qde cafés vendidos: "+ qde_cafes_vendidos +
                            " ­ valor cafés vendidos: "+valor_cafes_vendidos);
    }                     
}
 
