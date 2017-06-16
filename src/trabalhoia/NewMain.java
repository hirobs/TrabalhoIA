/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoia;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author hirob
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CriarMatriz criarMatriz = new CriarMatriz();
        String[][] matriz = new String[10][10];
        //matriz = criarMatriz.criarMatriz();
        //somar linha + coluna
        //int linhateste = 7;
        //int colunateste = 2;
        //int soma = linhateste + colunateste;
        //int distancia = 18 - soma;
        //JOptionPane.showMessageDialog(null, distancia);

        for (int l = 0; l < 10; l++) {
            for (int c = 0; c < 10; c++) {
                matriz[l][c] = " ";
            }
        }
        int linha = 5;
        int coluna = 6;
        
        matriz[linha][coluna]="A";
        
        //Escrita Matriz Inicial
        for (int x = 0; x < 10; x++) {
            String log = " ";
            for (int t = 0; t < 10; t++) {
                log = log + "[" + matriz[x][t] + "] ";

            }
            System.out.println(log);
        }

        // int distancia = 18 - soma;
        //System.out.println(distancia);
        if (coluna != 9
                && !"x".equals(matriz[linha][coluna + 1]) && !"A".equals(matriz[linha][coluna + 1])
                && !"-".equals(matriz[linha][coluna + 1])) {
            int soma;
            soma = 18 - (linha + coluna + 1);
            System.out.println("direita");
            System.out.println(soma);

        }

        if (linha != 9
                && !"x".equals(matriz[linha + 1][coluna]) && !"A".equals(matriz[linha + 1][coluna])
                && !"-".equals(matriz[linha + 1][coluna])) {
            int soma;
            soma = 18 - (linha + 1 + coluna);
            System.out.println("baixo");
            System.out.println(soma);

        }
        if (linha != 0
                && !"x".equals(matriz[linha - 1][coluna]) && !"A".equals(matriz[linha - 1][coluna])
                && !"-".equals(matriz[linha - 1][coluna])) {
            int soma;
            soma = 18 - (linha + coluna - 1);
            System.out.println("cima");
            System.out.println(soma);
        }
        if (coluna != 0
                && !"x".equals(matriz[linha][coluna - 1]) && !"A".equals(matriz[linha][coluna - 1])
                && !"-".equals(matriz[linha][coluna - 1])) {
            int soma;
            soma = 18 - (linha + coluna - 1);
            System.out.println("esquerda");
            System.out.println(soma);

        }

//        if(coluna != 9
//                && !"x".equals(matriz[linha][coluna + 1]) && !"A".equals(matriz[linha][coluna + 1])
//                && !"-".equals(matriz[linha][coluna + 1])) {
//            System.out.println("para direita");
//            paraDireita();
//        } else {
//            if (linha != 9
//                    && !"x".equals(matriz[linha + 1][coluna]) && !"A".equals(matriz[linha + 1][coluna])
//                    && !"-".equals(matriz[linha + 1][coluna])) {
//                System.out.println("para baixo");
//                paraBaixo();
//            } else {
//                if (linha != 0
//                        && !"x".equals(matriz[linha - 1][coluna]) && !"A".equals(matriz[linha - 1][coluna])
//                        && !"-".equals(matriz[linha - 1][coluna])) {
//                    System.out.println("para cima");
//                    paraCima();
//                } else {
//                    if (!"x".equals(matriz[linha][coluna - 1]) && !"A".equals(matriz[linha][coluna - 1])
//                            && !"-".equals(matriz[linha][coluna - 1])) {
//                        System.out.println("para esuqera");
//                        paraEsquerda();
//                    }
//                }
//            }
//        }
    }

}
