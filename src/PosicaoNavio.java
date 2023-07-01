public class PosicaoNavio {
    private int linha;
    private int coluna;
    private char orientacao;

    public PosicaoNavio(int linha, int coluna, char orientacao) {
        this.linha = linha;
        this.coluna = coluna;
        this.orientacao = orientacao;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public char getOrientacao() {
        return orientacao;
    }

    @Override
    public String toString() {
        return "PosicaoNavio{" +
                "linha=" + linha +
                ", coluna=" + coluna +
                ", orientacao=" + orientacao +
                '}';
    }
}
