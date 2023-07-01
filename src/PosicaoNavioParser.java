public class PosicaoNavioParser {

    public static PosicaoNavio parse(String posicao) throws IllegalArgumentException {
        String[] parts = posicao.split(",");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Formato de posição inválido. Deve ser linha, coluna, orientação.");
        }

        int linha = Integer.parseInt(parts[0].trim());
        int coluna = Integer.parseInt(parts[1].trim());
        String orientacao1 = parts[2].trim().toUpperCase();
        char orientacao = '*';

        orientacao = orientacao1.charAt(0);
        orientacao = orientacao;


        return new PosicaoNavio(linha, coluna, orientacao);
    }
}
