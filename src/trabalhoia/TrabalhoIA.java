/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoia;

import javax.swing.JOptionPane;

/**
 *
 * @author hiroshi.siqueira
 */
public class TrabalhoIA {

    /**
     * @param args the command line arguments
     */
    //Variavel Global
    static String bonusVida = "";
    static String verificaCondicao = "";

    public static void main(String[] args) {

        MetodoCaminhada caminhar = new MetodoCaminhada();
        CriarMatriz matriz1 = new CriarMatriz();
        String[][] matriz = matriz1.criarMatriz();
        int referenciaLinha = 0;
        int referenciaColuna = 0;
        int caminhoPercorrido=0;

        //Escrita Matriz Inicial
        for (int x = 0; x < 10; x++) {
            String log = " ";
            for (int t = 0; t < 10; t++) {
                log = log + "[" + matriz[x][t] + "] ";

            }
            System.out.println(log);
        }

        System.out.println("\n");
        
        int vida = 50;
        for (int i = 0; i <= 50; i++) {

            
            matriz = caminhar.verificar(referenciaLinha, referenciaColuna, matriz);
            //caminhar.verificar2(matriz);
            //Relação a bonus vida
            vida--;
            caminhoPercorrido++;
            
            if ("C".equals(bonusVida)) {
                vida = vida + 5;
                bonusVida = "";
                System.out.println("Ganhou 5 de vida");
            } else {
                if ("D".equals(bonusVida)) {
                    vida = vida + 10;
                    System.out.println("Ganhou 10 de vida");
                    bonusVida = "";
                }
            }
            if (vida < 0) {
                JOptionPane.showMessageDialog(null, "Sem vida, fim do jogo");
                break;
            } else {
                if ("semSaida".equals(verificaCondicao)) {
                    JOptionPane.showMessageDialog(null, "Caminho sem saída. Fim do Jogo");
                    break;
                } else {
                    System.out.println("Você tem " + vida + " vidas.");

                    {
                        //Escrita
                        for (int l = 0; l < 10; l++) {
                            String visual = " ";
                            for (int c = 0; c < 10; c++) {
                                visual = visual + "[" + matriz[l][c] + "] ";
                                if ("A".equals(matriz[l][c])) {
                                    referenciaLinha = l;
                                    referenciaColuna = c;
                                    //Verificação Vitória
                                    if ("-".equals(matriz[9][9]) || "A".equals(matriz[9][9])) {
                                        JOptionPane.showMessageDialog(null, "Parabéns, você ganhou!");
                                        i = 100;
                                    }
                                }
                            }
                            System.out.println(visual);

                        }
                    }
                    System.out.println("\n");
                    try {
                        Thread.sleep(700);
                    } catch (InterruptedException ex) {
                    }

                    //PAROU AS PARADA DE ESCRITA
                }

            }
        }
    }
}
