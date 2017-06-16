/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoia;

import java.util.Random;

/**
 *
 * @author hirob
 */
public class CriarMatriz {

    public String[][] criarMatriz() {
        String[][] matriz = new String[10][10];

        //Criar Matriz em branco
        for (int l = 0; l < 10; l++) {
            for (int c = 0; c < 10; c++) {
                matriz[l][c] = " ";
            }
        }
        //Setar o final
        matriz[9][9] = "F";
        matriz[0][0] = "I";

        //Quantidade de obstaculos
        Random obs1 = new Random();

        //Defino o range de quadrados pretos( de 10 a 25)
        int range = 25 - 10 + 1; // Maximo - minimo +1
        int obstaculo = obs1.nextInt(range) + 10;

        System.out.println(obstaculo+" obstáculos.");

        Random randomLinha = new Random();
        Random randomColuna = new Random();

        //Coloca os obstáculos na matriz
        for (int i = 0; i < obstaculo; i++) {
            int linha = randomLinha.nextInt(10);
            int coluna = randomColuna.nextInt(10);
            //Verifica se já existe um obstaculo na posicao e se é o final
            if (!"F".equals(matriz[linha][coluna]) && !"x".equals(matriz[linha][coluna])
                    & !"I".equals(matriz[linha][coluna])) {
                matriz[linha][coluna] = "x";
            } else {
                i = i - 1;
            }
        }
        //Coloca 5 vida de 5
        for (int i = 0; i < 5; i++) {
            int linha = randomLinha.nextInt(10);
            int coluna = randomColuna.nextInt(10);
            if (!"F".equals(matriz[linha][coluna])
                    && !"x".equals(matriz[linha][coluna])
                    && !"I".equals(matriz[linha][coluna])
                    && !"C".equals(matriz[linha][coluna])) {
                matriz[linha][coluna] = "C";
            } else {
                i = i - 1;
            }
        }
        //Coloca 3 vida de 10
        for (int i = 0; i < 3; i++) {
            int linha = randomLinha.nextInt(10);
            int coluna = randomColuna.nextInt(10);
            if (!"F".equals(matriz[linha][coluna])
                    && !"x".equals(matriz[linha][coluna])
                    && !"I".equals(matriz[linha][coluna])
                    && !"C".equals(matriz[linha][coluna])
                    && !"D".equals(matriz[linha][coluna])) {
                matriz[linha][coluna] = "D";
            } else {
                i = i - 1;
            }
        }
        

        return matriz;
    }

//    public void obstaculo() {
//
//        Random obs1 = new Random();
//        //Defino o range de quadrados pretos( de 10 a 25)
//        int range = 25 - 10 + 1; // Maximo - minimo +1
//        int obstaculo = obs1.nextInt(range) + 10;
//
//        Random randomLinha = new Random();
//        Random randomColuna = new Random();
//
//        for (int i = 0; i <= obstaculo; i++) {
//            int linha = randomLinha.nextInt(10);
//            int coluna = randomColuna.nextInt(10);
//            if (linha == 9 && coluna == 9) {
//
//            }
//        }
//
//    }

}
