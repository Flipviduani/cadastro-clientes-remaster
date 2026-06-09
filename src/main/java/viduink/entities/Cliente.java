package viduink.entities;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.UUID;

//Classe de modelo de Dados para Cliente:
public class Cliente {

    //Atributos da Cliente:
    public UUID id;
    public String nome;
    public String email;
    public String telefone;
    public String cpf;
    public LocalDateTime dataHoraCadastro;

    //Método para salvar os dados do cliente em um arquivo:
    public void salvarDados(){
        try{
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
        }
        catch(Exception e){
            System.out.println("Falha ao salvar dados.");
        }
    }


}
