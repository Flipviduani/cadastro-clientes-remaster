package viduink.entities;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

//Classe de modelo de Dados para Cliente:
public class Cliente {

    //Atributos da Cliente:
    private UUID id;
    private String nome;
    private LocalDate dataNascimento;
    private String profissao;
    private String cpf;
    private String telefone;
    private String email;
    private LocalDateTime dataHoraCadastro;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(LocalDateTime dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    /* Antes de ser refatorado:
    Metodo para salvar os dados do cliente em um arquivo:

    public void salvarDados() {
        try {
            //Definindo o local e nome do arquivo:
            var fileWriter = new FileWriter("Clientes.txt", true);

            //Escrever no arquivo
            var printWriter = new PrintWriter(fileWriter);

            printWriter.println(id);
            printWriter.println(nome);
            printWriter.println(email);
            printWriter.println(telefone);
            printWriter.println(cpf);
            printWriter.println(dataHoraCadastro);
            printWriter.println("*******");

            //Fechar o arquivo:
            printWriter.close();
        } catch (Exception e) {
            System.out.println("Falha ao salvar dados.");
        }
    } */
}