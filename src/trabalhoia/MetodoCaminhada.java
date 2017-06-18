/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoia;

import java.util.ArrayList;
import java.util.List;

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
        //DIREITA BAIXO CIMA ESQUERDA
        matriz = matriz1;
        linha = linha1;
        coluna = coluna1;

        if (coluna != 9
                && !"x".equals(matriz[linha][coluna + 1]) && !"A".equals(matriz[linha][coluna + 1])
                && !"-".equals(matriz[linha][coluna + 1])) {
            System.out.println("Para direita");
            paraDireita();
        } else {
            if (linha != 9
                    && !"x".equals(matriz[linha + 1][coluna]) && !"A".equals(matriz[linha + 1][coluna])
                    && !"-".equals(matriz[linha + 1][coluna])) {
                System.out.println("Para baixo");
                paraBaixo();
            } else {
                if (linha != 0
                        && !"x".equals(matriz[linha - 1][coluna]) && !"A".equals(matriz[linha - 1][coluna])
                        && !"-".equals(matriz[linha - 1][coluna])) {
                    System.out.println("Para cima");
                    paraCima();
                } else {
                    if (coluna != 0
                            && !"x".equals(matriz[linha][coluna - 1]) && !"A".equals(matriz[linha][coluna - 1])
                            && !"-".equals(matriz[linha][coluna - 1])) {
                        System.out.println("Para esquerda");
                        paraEsquerda();
                    } else {
                        //matriz[0][0] = "  ";
                        TrabalhoIA.verificaCondicao = "semSaida";
                    }
                }
            }
        }
        return matriz;
    }

    public void paraCima() {
        if ("C".equals(matriz[linha - 1][coluna])) {
            TrabalhoIA.bonusVida = "C";
        } else {
            if ("D".equals(matriz[linha - 1][coluna])) {
                TrabalhoIA.bonusVida = "D";
            }
        }
        matriz[linha][coluna] = "-";
        matriz[linha - 1][coluna] = "A";
        linhaRef = linha - 1;
        colunaRef = coluna;

    }

    public void paraBaixo() {
        if ("C".equals(matriz[linha + 1][coluna])) {
            TrabalhoIA.bonusVida = "C";
        } else {
            if ("D".equals(matriz[linha + 1][coluna])) {
                TrabalhoIA.bonusVida = "D";
            }
        }

        matriz[linha][coluna] = "-";
        matriz[linha + 1][coluna] = "A";

        linhaRef = linha + 1;
        colunaRef = coluna;

    }

    public void paraDireita() {
        if ("C".equals(matriz[linha][coluna + 1])) {
            TrabalhoIA.bonusVida = "C";
        } else {
            if ("D".equals(matriz[linha][coluna + 1])) {
                TrabalhoIA.bonusVida = "D";
            }
        }

        matriz[linha][coluna] = "-";
        matriz[linha][coluna + 1] = "A";

        linhaRef = linha;
        colunaRef = coluna + 1;

    }

    public void paraEsquerda() {
        if ("C".equals(matriz[linha][coluna - 1])) {
            TrabalhoIA.bonusVida = "C";
        } else {
            if ("D".equals(matriz[linha][coluna - 1])) {
                TrabalhoIA.bonusVida = "D";
            }
        }

        matriz[linha][coluna] = "-";
        matriz[linha][coluna - 1] = "A";

        linhaRef = linha;
        colunaRef = coluna - 1;

    }

//    public void algoritmoA(String[][] matriz1, int linha1, int coluna1) {
//        int distanciaFinal;
//        int distanciaAndada;
//
//        matriz = matriz1;
//        linha = linha1;
//        coluna = coluna1;
//    }

    public String[][] verificar2(String[][] matriz1, int linha1, int coluna1) {
        matriz = matriz1;
        linha = linha1;
        coluna = coluna1;

        List<Integer> arrayOrdem = new ArrayList();
        List<Integer> arraySoma = new ArrayList();
        if (coluna != 9
                && !"x".equals(matriz[linha][coluna + 1]) && !"A".equals(matriz[linha][coluna + 1])
                && !"-".equals(matriz[linha][coluna + 1])) {
            int soma;
            soma = 18 - (linha + coluna + 1);
            arraySoma.add(soma);
            arrayOrdem.add(1);
        }

        if (linha != 9
                && !"x".equals(matriz[linha + 1][coluna]) && !"A".equals(matriz[linha + 1][coluna])
                && !"-".equals(matriz[linha + 1][coluna])) {
            int soma;
            soma = 18 - (linha + 1 + coluna);
            arraySoma.add(soma);
            arrayOrdem.add(2);

        }
        if (linha != 0
                && !"x".equals(matriz[linha - 1][coluna]) && !"A".equals(matriz[linha - 1][coluna])
                && !"-".equals(matriz[linha - 1][coluna])) {
            int soma;
            soma = 18 - (linha + coluna - 1);
            arraySoma.add(soma);
            arrayOrdem.add(3);
        }
        if (coluna != 0
                && !"x".equals(matriz[linha][coluna - 1]) && !"A".equals(matriz[linha][coluna - 1])
                && !"-".equals(matriz[linha][coluna - 1])) {
            int soma;
            soma = 18 - (linha + coluna - 1);
            arraySoma.add(soma);
            arrayOrdem.add(4);
        }

        int menor = 18;
        int cont = 0;
        int ordem = 5;
        for (int arraySoma1 : arraySoma) {

            if (arraySoma1 < menor) {
                menor = arraySoma1;

                ordem = arrayOrdem.get(cont);
            }
            cont++;
        }

        if (ordem == 1) {
            System.out.println("Vai para direita");
            paraDireita();
        } else {
            if (ordem == 2) {
                System.out.println("Vai para baixo");
                paraBaixo();
            } else {
                if (ordem == 3) {
                    System.out.println("vai para cima");
                    paraCima();
                } else {
                    if (ordem == 4) {
                        System.out.println("vai para esquerda");
                        paraEsquerda();
                    } else {
                        System.out.println("Nao entrou em nenhum");
                        TrabalhoIA.verificaCondicao = "semSaida";
                    }
                }
            }
        }
        return matriz;
    }

}
