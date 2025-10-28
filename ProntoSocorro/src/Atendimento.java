import java.time.LocalDateTime;

public class Atendimento {
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime horaAtendimento;

    public Atendimento(Paciente paciente, Medico medico) {
        this.paciente = paciente;
        this.medico = medico;
        this.horaAtendimento = LocalDateTime.now();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public LocalDateTime getHoraAtendimento() {
        return horaAtendimento;
    }

    @Override
    public String toString() {
        return "Atendimento: " + paciente.getNome() +
                " com " + medico.getNome() +
                " em " + horaAtendimento;
    }
}
