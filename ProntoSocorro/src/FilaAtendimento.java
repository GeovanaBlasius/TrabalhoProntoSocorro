import java.util.*;

public class FilaAtendimento {
    private List<Paciente> fila;
    public static final Map<String, Integer> PRIORIDADE_ORDEM = Map.of(
            "VERMELHO", 1,
            "AMARELO", 2,
            "VERDE", 3,
            "AZUL", 4
    );

    public FilaAtendimento() {
        fila = new LinkedList<>();
    }

    public void adicionarPaciente(Paciente p, boolean exibirMensagem) {
        fila.add(p);
        if (exibirMensagem) {
            System.out.println("✅ Paciente " + p.getNome() + " adicionado à fila.");
        }
    }

    public Paciente chamarProximo() {
        if (fila.isEmpty()) {
            System.out.println("⚠️ Nenhum paciente na fila.");
            return null;
        }

        fila.sort(Comparator.comparingInt(p ->
                PRIORIDADE_ORDEM.getOrDefault(p.getClassificacao().toUpperCase(), Integer.MAX_VALUE))
        );

        Paciente proximo = fila.remove(0);
        System.out.println("➡️ Chamando paciente: " + proximo.getNome() + " | Prioridade: " + proximo.getClassificacao());
        return proximo;
    }

    public void organizarFilaPorPrioridade() {
        fila.sort(Comparator.comparingInt(p ->
                PRIORIDADE_ORDEM.getOrDefault(p.getClassificacao().toUpperCase(), Integer.MAX_VALUE)
        ));
    }

    public void mostrarFila() {
        System.out.println("\n--- FILA DE ATENDIMENTO ---");
        if (fila.isEmpty()) {
            System.out.println("Fila vazia.");
        } else {
            int pos = 1;
            for (Paciente p : fila) {
                System.out.println(pos++ + "º - " + p.getNome() + " | Prioridade: " + p.getClassificacao());
            }
        }
    }
}
