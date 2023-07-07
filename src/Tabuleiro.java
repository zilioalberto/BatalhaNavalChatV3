public class Tabuleiro {
    private int tamanho;
    private char[][] tabuleiro;
    private boolean posicionamentoValido;

    public Tabuleiro(int tamanho) {
        this.tamanho = tamanho;
        tabuleiro = new char[tamanho][tamanho];
        inicializarTabuleiro();
    }

    private void inicializarTabuleiro() {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                tabuleiro[i][j] = '*';
            }
        }
    }

    public void exibirTabuleiro() {
        // Imprimir números das colunas
        System.out.print("   ");
        for (int j = 0; j < tamanho; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Imprimir linhas e conteúdo do tabuleiro
        for (int i = 0; i < tamanho; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < tamanho; j++) {
                System.out.print((tabuleiro[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public boolean posicionarNavio(Navio navio) {
        PosicaoNavio posicao = navio.getPosicao();
        int linha = posicao.getLinha();
        int coluna = posicao.getColuna();
        int tamanho = navio.getTamanho();
        char simbolo = navio.getSimbolo();

        try {
            if (linha < 0 || linha >= tamanho || coluna < 0 || coluna >= tamanho) {
                throw new IllegalArgumentException("Posição inválida. Por favor, escolha outra posição dentro dos limites do tabuleiro.");
            }

            if (posicao.getOrientacao() != 'H' && posicao.getOrientacao() != 'V') {
                throw new IllegalArgumentException("Orientação inválida. Por favor, escolha uma orientação válida (H ou V).");
            }

            if (posicao.getOrientacao() == 'H') {
                for (int i = coluna; i < coluna + tamanho; i++) {
                    if (!posicaoEstaLivre(linha, i)) {
                        throw new IllegalArgumentException("Posição ocupada. Por favor, escolha outra posição.");
                    }
                }

                for (int i = coluna; i < coluna + tamanho; i++) {
                    tabuleiro[linha][i] = simbolo;
                }
                posicionamentoValido = true;
            } else if (posicao.getOrientacao() == 'V') {
                for (int i = linha; i < linha + tamanho; i++) {
                    if (!posicaoEstaLivre(i, coluna)) {
                        throw new IllegalArgumentException("Posição ocupada. Por favor, escolha outra posição.");
                    }
                }

                for (int i = linha; i < linha + tamanho; i++) {
                    tabuleiro[i][coluna] = simbolo;
                }
                posicionamentoValido = true;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            posicionamentoValido = false;
        }
        return posicionamentoValido;

    }




    public void setPosicao(int linha, int coluna, char simbolo) {
        tabuleiro[linha][coluna] = simbolo;
    }

    public boolean posicaoEstaLivre(int linha, int coluna) {
        return tabuleiro[linha][coluna] == '*';
    }

    public boolean isPosicionamentoValido() {
        return posicionamentoValido;
    }

    public void setPosicionamentoValido(boolean b) {
    }
}
