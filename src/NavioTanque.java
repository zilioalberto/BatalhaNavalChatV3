public class NavioTanque extends Navio {
    public NavioTanque(PosicaoNavio posicao, Tabuleiro tabuleiro) {
        super(posicao, tabuleiro, 'T');
    }

    @Override
    public int getTamanho() {
        return 4;
    }
}
