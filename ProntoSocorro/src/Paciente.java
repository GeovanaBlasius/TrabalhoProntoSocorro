import java.time.LocalDateTime;

public class Paciente extends Pessoa {
    private String classificacao; // Vermelho, Amarelo, Verde, Azul
    private LocalDateTime horaChegada;
    private LocalDateTime horaAtendimento;
    private boolean atendido;

    public Paciente(String nome, String cpf, String classificacao) {
        super(nome, cpf);
        this.classificacao = classificacao;
        this.horaChegada = LocalDateTime.now();
        this.atendido = false;
    }

    public Paciente(String nome, String cpf) {
        super(nome, cpf);
        this.horaChegada = LocalDateTime.now();
        this.atendido = false;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public LocalDateTime getHoraChegada() {
        return horaChegada;
    }

    public LocalDateTime getHoraAtendimento() {
        return horaAtendimento;
    }

    public boolean isAtendido() {
        return atendido;
    }

    public void registrarAtendimento() {
        this.horaAtendimento = LocalDateTime.now();
        this.atendido = true;
    }

    @Override
    public String toString() {
        return getNome() + " - Classificação: " + classificacao;
    }
}
