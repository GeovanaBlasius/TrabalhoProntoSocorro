import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa {
    private String especialidade;
    private List<Atendimento> historico;

    public Medico(String nome, String cpf, String especialidade) {
        super(nome, cpf);
        this.especialidade = especialidade;
        this.historico = new ArrayList<>();
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public List<Atendimento> getHistorico() {
        return historico;
    }

    public void realizaAtendimento(Paciente paciente) {
        Atendimento atendimento = new Atendimento(paciente, this);
        historico.add(atendimento);
        System.out.println("Atendendo paciente: " + paciente.getNome());
    }

    @Override
    public String toString() {
        return "Dr(a). " + getNome() + " - " + especialidade;
    }
}
