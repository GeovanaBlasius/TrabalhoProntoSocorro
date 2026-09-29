# Sistema de Pronto-Socorro

Sistema em Java, no terminal, que simula o atendimento de um pronto-socorro: cadastro, triagem e fila de pacientes por prioridade.

**Disciplina:** Programação Orientada a Objetos I  
**Tecnologias:** Java

## Funcionalidades

- Inserir paciente na fila, com validação dos dados
- Triagem e organização da fila por prioridade
- Atendimento dos pacientes pelos médicos disponíveis
- Histórico de atendimentos
- Dados de exemplo carregados ao iniciar

## Classes

`Pessoa` (base de `Paciente` e `Medico`), `Triagem`, `FilaAtendimento`, `Atendimento`, `DadosExemplo` e `Main`.

## Como executar

```bash
cd ProntoSocorro/src
javac *.java
java Main
```

---

Desenvolvido por [Geovana Blasius](https://github.com/GeovanaBlasius) · Ciência da Computação, IFC Campus Rio do Sul
