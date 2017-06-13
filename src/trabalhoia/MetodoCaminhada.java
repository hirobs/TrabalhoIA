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

    private String[][] matriz;
    private int linha;
    private int coluna;
    private int linhaRef;
    private int colunaRef;

    public String[][] verificar(int linha1, int coluna1, String[][] matriz1) {
        //direita baixo cima esquerda
        matriz = matriz1;
        linha = linha1;
        coluna = coluna1;

       // System.out.println("A linha é" + linha);
       // System.out.println("A coluna é" + coluna);

        if (coluna != 9
                && !"x".equals(matriz[linha][coluna + 1]) && !"A".equals(matriz[linha][coluna + 1])
                && !"-".equals(matriz[linha][coluna + 1])) {
            System.out.println("para direita");
            paraDireita();
        } else {
            if (linha != 9
                    && !"x".equals(matriz[linha + 1][coluna]) && !"A".equals(matriz[linha + 1][coluna])
                    && !"-".equals(matriz[linha + 1][coluna])) {
                System.out.println("para baixo");
                paraBaixo();
            } else {
                if (linha != 0
                        && !"x".equals(matriz[linha - 1][coluna]) && !"A".equals(matriz[linha - 1][coluna])
                        && !"-".equals(matriz[linha - 1][coluna])) {
                    System.out.println("para cima");
                    paraCima();
                } else {
                    if (coluna!=0
                            &&!"x".equals(matriz[linha][coluna - 1]) && !"A".equals(matriz[linha][coluna - 1])
                            && !"-".equals(matriz[linha][coluna - 1])) {
                        System.out.println("para esuqera");
                        paraEsquerda();
                    }else{
                        matriz[0][0]="  ";
                    }
                }
            }
        }
        return matriz;
    }

    public void paraCima() {
        if (!"x".equals(matriz[linha - 1][coluna]) && !"A".equals(matriz[linha - 1][coluna])
                && !"-".equals(matriz[linha - 1][coluna])) {
            matriz[linha][coluna] = "-";
            matriz[linha - 1][coluna] = "A";
            linhaRef = linha - 1;
            colunaRef = coluna;

        }

    }

    public void paraBaixo() {
        if (!"x".equals(matriz[linha + 1][coluna]) && !"A".equals(matriz[linha + 1][coluna])
                && !"-".equals(matriz[linha + 1][coluna])) {
            matriz[linha][coluna] = "-";
            matriz[linha + 1][coluna] = "A";

            linhaRef = linha + 1;
            colunaRef = coluna;
        }
    }

    public void paraDireita() {
        if (!"x".equals(matriz[linha][coluna + 1]) && !"A".equals(matriz[linha][coluna + 1])
                && !"-".equals(matriz[linha][coluna + 1])) {
            matriz[linha][coluna] = "-";
            matriz[linha][coluna + 1] = "A";

            linhaRef = linha;
            colunaRef = coluna + 1;
        }
    }

    public void paraEsquerda() {
        if (!"x".equals(matriz[linha][coluna - 1]) && !"A".equals(matriz[linha][coluna - 1])
                && !"-".equals(matriz[linha][coluna - 1])) {
            matriz[linha][coluna] = "-";
            matriz[linha][coluna - 1] = "A";

            linhaRef = linha;
            colunaRef = coluna - 1;
        }
    }

}
