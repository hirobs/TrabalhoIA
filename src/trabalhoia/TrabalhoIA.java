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

        String[][] matriz = new String[10][10];
        String[][] percorrido = new String[10][10];
        String[][] matrizCopia;
        int referenciaLinha = 0;
        int referenciaColuna = 0;

        matriz[0][0] = " ";
        matriz[0][1] = "x";
        matriz[0][2] = " ";
        matriz[0][3] = " ";
        matriz[0][4] = " ";
        matriz[0][5] = " ";
        matriz[0][6] = " ";
        matriz[0][7] = " ";
        matriz[0][8] = " ";
        matriz[0][9] = "x";

        matriz[1][0] = " ";
        matriz[1][1] = "x";
        matriz[1][2] = "x";
        matriz[1][3] = "x";
        matriz[1][4] = "x";
        matriz[1][5] = " ";
        matriz[1][6] = "x";
        matriz[1][7] = "x";
        matriz[1][8] = "x";
        matriz[1][9] = "x";

        matriz[2][0] = " ";
        matriz[2][1] = " ";
        matriz[2][2] = " ";
        matriz[2][3] = " ";
        matriz[2][4] = " ";
        matriz[2][5] = " ";
        matriz[2][6] = " ";
        matriz[2][7] = " ";
        matriz[2][8] = " ";
        matriz[2][9] = " ";

        matriz[3][0] = " ";
        matriz[3][1] = "x";
        matriz[3][2] = "x";
        matriz[3][3] = "x";
        matriz[3][4] = " ";
        matriz[3][5] = " ";
        matriz[3][6] = " ";
        matriz[3][7] = "x";
        matriz[3][8] = " ";
        matriz[3][9] = " ";

        matriz[4][0] = " ";
        matriz[4][1] = " ";
        matriz[4][2] = " ";
        matriz[4][3] = "x";
        matriz[4][4] = "x";
        matriz[4][5] = " ";
        matriz[4][6] = " ";
        matriz[4][7] = "x";
        matriz[4][8] = "x";
        matriz[4][9] = " ";

        matriz[5][0] = " ";
        matriz[5][1] = "x";
        matriz[5][2] = " ";
        matriz[5][3] = "x";
        matriz[5][4] = " ";
        matriz[5][5] = " ";
        matriz[5][6] = " ";
        matriz[5][7] = "x";
        matriz[5][8] = " ";
        matriz[5][9] = " ";

        matriz[6][0] = " ";
        matriz[6][1] = " ";
        matriz[6][2] = " ";
        matriz[6][3] = " ";
        matriz[6][4] = " ";
        matriz[6][5] = "x";
        matriz[6][6] = "x";
        matriz[6][7] = "x";
        matriz[6][8] = " ";
        matriz[6][9] = "x";

        matriz[7][0] = " ";
        matriz[7][1] = " ";
        matriz[7][2] = "x";
        matriz[7][3] = " ";
        matriz[7][4] = " ";
        matriz[7][5] = " ";
        matriz[7][6] = " ";
        matriz[7][7] = "x";
        matriz[7][8] = " ";
        matriz[7][9] = "x";

        matriz[8][0] = " ";
        matriz[8][1] = " ";
        matriz[8][2] = "x";
        matriz[8][3] = " ";
        matriz[8][4] = "x";
        matriz[8][5] = " ";
        matriz[8][6] = " ";
        matriz[8][7] = " ";
        matriz[8][8] = " ";
        matriz[8][9] = " ";

        matriz[9][0] = " ";
        matriz[9][1] = " ";
        matriz[9][2] = "x";
        matriz[9][3] = " ";
        matriz[9][4] = "x";
        matriz[9][5] = " ";
        matriz[9][6] = " ";
        matriz[9][7] = "x";
        matriz[9][8] = "x";
        matriz[9][9] = " ";

        matrizCopia = matriz;

        for (int x = 0; x < 10; x++) {
            String log = " ";
            for (int t = 0; t < 10; t++) {
                log = log + "[" + matriz[x][t] + "] ";

            }
            System.out.println(log);
        }

        System.out.println("\n");

        for (int i = 0; i < 10; i++) {
            for (int z = 0; z < 1; z++) {
                if (" ".equals(matrizCopia[i][z])) {
                    //Verificando se "para cima" existe
                    if (i - 1 >= 0 && " ".equals(matriz[i - 1][z])) {
                        //Verificando se a posicao "para cima" é obstaculo
                        System.out.println("oi");
                    }

                    matrizCopia[referenciaLinha][referenciaColuna] = "";

                    matrizCopia[i][z] = "x";

                    
                    
                    matrizCopia[referenciaLinha][referenciaColuna] = " ";

                    matrizCopia[i][z] = "~";

                    referenciaLinha = i;
                    referenciaColuna = z;
                    
                    
                    //ISSO É SÓ A ESCRITA
                    for (int l = 0; l < 10; l++) {
                        String visual = " ";
                        for (int c = 0; c < 1; c++) {
                            visual = visual + "[" + matriz[l][c] + "] ";

                        }
                        System.out.println(visual);

                    }
                    System.out.println("\n");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                    //PAROU AS PARADA DE ESCRITA

                }

                //log = log + "[" + matrizCopia[i][z] + "] ";
            }
            // System.out.println(log); aaaaaaaaaaa
        }

    }
}
