public abstract class Navio {
    protected PosicaoNavio posicao;
    protected char simbolo;

    public Navio(PosicaoNavio posicao, Tabuleiro tabuleiro, char simbolo) {
        this.posicao = posicao;
        //tabuleiro.posicionarNavio(this);
        this.simbolo = simbolo;
    }


    public PosicaoNavio getPosicao() {
        return posicao;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public abstract int getTamanho();

    @Override
    public String toString() {
        return "Navio{" +
                "posicao=" + posicao +
                ", simbolo=" + simbolo +
                '}';
    }
}
