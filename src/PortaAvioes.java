public class PortaAvioes extends Navio {
    public PortaAvioes(PosicaoNavio posicao, Tabuleiro tabuleiro) {

        super(posicao, tabuleiro, 'P');
    }

    @Override
    public int getTamanho() {
        return 5;
    }
}
