/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoia;

/**
 *
 * @author hiroshi.siqueira
 */
public class TrabalhoIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matriz = new int[10][10];
        int[][] percorrido = new int[10][10];
        int[][] matrizCopia;
        int referenciaLinha = 0;
        int referenciaColuna = 0;

        matriz[0][0] = 0;
        matriz[0][1] = 1;
        matriz[0][2] = 0;
        matriz[0][3] = 0;
        matriz[0][4] = 0;
        matriz[0][5] = 0;
        matriz[0][6] = 0;
        matriz[0][7] = 0;
        matriz[0][8] = 0;
        matriz[0][9] = 1;

        matriz[1][0] = 0;
        matriz[1][1] = 1;
        matriz[1][2] = 1;
        matriz[1][3] = 1;
        matriz[1][4] = 1;
        matriz[1][5] = 0;
        matriz[1][6] = 1;
        matriz[1][7] = 1;
        matriz[1][8] = 1;
        matriz[1][9] = 1;

        matriz[2][0] = 0;
        matriz[2][1] = 0;
        matriz[2][2] = 0;
        matriz[2][3] = 0;
        matriz[2][4] = 0;
        matriz[2][5] = 0;
        matriz[2][6] = 0;
        matriz[2][7] = 0;
        matriz[2][8] = 0;
        matriz[2][9] = 0;

        matriz[3][0] = 0;
        matriz[3][1] = 1;
        matriz[3][2] = 1;
        matriz[3][3] = 1;
        matriz[3][4] = 0;
        matriz[3][5] = 0;
        matriz[3][6] = 0;
        matriz[3][7] = 1;
        matriz[3][8] = 0;
        matriz[3][9] = 0;

        matriz[4][0] = 0;
        matriz[4][1] = 0;
        matriz[4][2] = 0;
        matriz[4][3] = 1;
        matriz[4][4] = 1;
        matriz[4][5] = 0;
        matriz[4][6] = 0;
        matriz[4][7] = 1;
        matriz[4][8] = 1;
        matriz[4][9] = 0;

        matriz[5][0] = 0;
        matriz[5][1] = 1;
        matriz[5][2] = 0;
        matriz[5][3] = 1;
        matriz[5][4] = 0;
        matriz[5][5] = 0;
        matriz[5][6] = 0;
        matriz[5][7] = 1;
        matriz[5][8] = 0;
        matriz[5][9] = 0;

        matriz[6][0] = 0;
        matriz[6][1] = 0;
        matriz[6][2] = 0;
        matriz[6][3] = 0;
        matriz[6][4] = 0;
        matriz[6][5] = 1;
        matriz[6][6] = 1;
        matriz[6][7] = 1;
        matriz[6][8] = 0;
        matriz[6][9] = 1;

        matriz[7][0] = 0;
        matriz[7][1] = 0;
        matriz[7][2] = 1;
        matriz[7][3] = 0;
        matriz[7][4] = 0;
        matriz[7][5] = 0;
        matriz[7][6] = 0;
        matriz[7][7] = 1;
        matriz[7][8] = 0;
        matriz[7][9] = 1;

        matriz[8][0] = 0;
        matriz[8][1] = 0;
        matriz[8][2] = 1;
        matriz[8][3] = 0;
        matriz[8][4] = 1;
        matriz[8][5] = 0;
        matriz[8][6] = 0;
        matriz[8][7] = 0;
        matriz[8][8] = 0;
        matriz[8][9] = 0;

        matriz[9][0] = 0;
        matriz[9][1] = 0;
        matriz[9][2] = 1;
        matriz[9][3] = 0;
        matriz[9][4] = 1;
        matriz[9][5] = 0;
        matriz[9][6] = 0;
        matriz[9][7] = 1;
        matriz[9][8] = 1;
        matriz[9][9] = 0;

        matrizCopia = matriz;

        for (int x = 0; x < 10; x++) {
            String log = "";
            for (int t = 0; t < 10; t++) {
                log = log + "[" + matriz[x][t] + "] ";

            }
            System.out.println(log);
        }

        System.out.println("\n");

        for (int i = 0; i < 10; i++) {

        }

        for (int i = 0; i < 10; i++) {
            String log = "";
            for (int z = 0; z < 10; z++) {
                if (matrizCopia[i][z] == 0) {

                    matrizCopia[referenciaLinha][referenciaColuna] = 0;

                    matrizCopia[i][z] = 5;

                    referenciaLinha = i;
                    referenciaColuna = z;
                    for (int l = 0; l < 10; l++) {
                        String visual = "";
                        for (int c = 0; c < 10; c++) {
                            visual = visual + "[" + matriz[l][c] + "] ";

                        }
                        System.out.println(visual);
                        
                    }
                    System.out.println("\n");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }

                }

                //log = log + "[" + matrizCopia[i][z] + "] ";

            }
           // System.out.println(log);
        }
    }
}
