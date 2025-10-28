import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class DadosExemplo {

    // mapa de prioridade
    private static final Map<String, Integer> prioridadeOrdem = Map.of(
            "VERMELHO", 1,
            "AMARELO", 2,
            "VERDE", 3,
            "AZUL", 4
    );

    public static List<Paciente> carregarPacientes() {
        List<Paciente> pacientes = new ArrayList<>();

        pacientes.add(new Paciente("Ana Souza", "11111111111", "Vermelho"));
        pacientes.add(new Paciente("Bruno Lima", "22222222222", "Amarelo"));
        pacientes.add(new Paciente("Carla Mendes", "33333333333", "Verde"));
        pacientes.add(new Paciente("Diego Ferreira", "44444444444", "Vermelho"));
        pacientes.add(new Paciente("Eduarda Alves", "55555555555", "Azul"));
        pacientes.add(new Paciente("Felipe Costa", "66666666666", "Vermelho"));
        pacientes.add(new Paciente("Gabriela Santos", "77777777777", "Amarelo"));
        pacientes.add(new Paciente("Henrique Rocha", "88888888888", "Verde"));
        pacientes.add(new Paciente("Isabela Martins", "99999999999", "Amarelo"));
        pacientes.add(new Paciente("João Carvalho", "10101010101", "Azul"));
        pacientes.add(new Paciente("Karina Dias", "12121212121", "Verde"));
        pacientes.add(new Paciente("Lucas Pereira", "13131313131", "Vermelho"));
        pacientes.add(new Paciente("Mariana Teixeira", "14141414141", "Amarelo"));
        pacientes.add(new Paciente("Nicolas Gomes", "15151515151", "Verde"));
        pacientes.add(new Paciente("Olívia Barbosa", "16161616161", "Azul"));
        pacientes.add(new Paciente("Pedro Silva", "17171717171", "Verde"));
        pacientes.add(new Paciente("Rafaela Castro", "18181818181", "Amarelo"));
        pacientes.add(new Paciente("Samuel Nunes", "19191919191", "Vermelho"));
        pacientes.add(new Paciente("Tatiane Moura", "20202020202", "Azul"));
        pacientes.add(new Paciente("Vinícius Lopes", "21212121212", "Verde"));

        // UPPERCASE
        for (Paciente p : pacientes) {
            if (p.getClassificacao() == null || p.getClassificacao().isEmpty()) {
                p.setClassificacao("AZUL");
            } else {
                p.setClassificacao(p.getClassificacao().toUpperCase());
            }
        }

        // Ordena pela prioridade
        pacientes.sort(Comparator.comparingInt(
                p -> prioridadeOrdem.getOrDefault(p.getClassificacao(), Integer.MAX_VALUE)
        ));

        return pacientes;
    }

    public static List<Medico> carregarMedicos() {
        List<Medico> medicos = new ArrayList<>();

        medicos.add(new Medico("Dr. João Henrique", "99999999999", "Clínico Geral"));
        medicos.add(new Medico("Dra. Maria Fernanda", "88888888888", "Pediatra"));
        medicos.add(new Medico("Dr. Pedro Augusto", "77777777777", "Cardiologista"));

        return medicos;
    }
}
