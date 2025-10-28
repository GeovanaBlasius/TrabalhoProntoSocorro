import java.util.Scanner;

public class Triagem {
    private String classificacao;

        public static String classificar(int resp1, int resp2, int resp3, int resp4) {
            int pontuacao = 0;

            if (resp1 == 1) pontuacao += 1; // dor muito forte
            if (resp2 == 1) pontuacao += 2; // sangramento
            if (resp3 == 1) pontuacao += 1; // febre alta
            if (resp4 == 1) pontuacao += 2; // falta de ar

            String prioridade;
            if (pontuacao >= 4) {
                prioridade = "VERMELHO";    // Gravíssima
            } else if (pontuacao >= 2) {
                prioridade = "AMARELO";     // Grave
            } else if (pontuacao == 1) {
                prioridade = "VERDE";       // Leve
            } else {
                prioridade = "AZUL";        // Muito leve
            }

            return prioridade;
        }

    public String getClassificacao() {
        return classificacao;
    }
}
