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
public class MetodoCaminhada {

    private String[][] matriz = new String[10][10];
    private int[][] percorrido = new int[10][10];
    private int linha;
    private int coluna;

    public void verificar(int linha1, int coluna1, String[][] matriz1, int[][] percorrido1) {
        //para cima, para baixo, para direita, para esquerda
        matriz = matriz1;
        linha = linha1;
        coluna = coluna1;

        if (linha != 0) {
            paraCima();
        } else {
            if (linha != 9) {
                paraBaixo();
            } else {
                if (coluna != 9) {
                    paraDireita();
                } else {
                    paraEsquerda();
                }
            }
        }
    }

    public void paraCima() {
        if (!"x".equals(matriz[linha - 1][coluna])) {
            matriz[linha - 1][coluna] = "~";
        }

    }

    public void paraBaixo() {
        if (matriz[linha + 1][coluna] != "x") {
            matriz[linha + 1][coluna] = "~";
        }
    }

    public void paraDireita() {
        if (matriz[linha][coluna + 1] != "x") {
            matriz[linha][coluna + 1] = "~";
        }
    }

    public void paraEsquerda() {
        if (matriz[linha][coluna - 1] != "x") {
            matriz[linha][coluna - 1] = "~";
        }
    }

    public void verificar() {

    }
}
