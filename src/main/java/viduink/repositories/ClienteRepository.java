package viduink.repositories;

import viduink.entities.Cliente;

import java.io.FileWriter;
import java.io.PrintWriter;

public class ClienteRepository {
    public void salvar(Cliente cliente) {

        try {

            var fileWriter = new FileWriter("clientes.txt", true);
            var printWriter = new PrintWriter(fileWriter);

            printWriter.println(cliente.getId());
            printWriter.println(cliente.getNome());
            printWriter.println(cliente.getEmail());
            printWriter.println(cliente.getTelefone());
            printWriter.println(cliente.getCpf());
            printWriter.println(cliente.getDataHoraCadastro());
            printWriter.println("*******");

            printWriter.close();

            System.out.println("\nCliente gravado com sucesso!");

        } catch (Exception e) {

            System.out.println("\nErro ao gravar cliente.");
        }
    }
}
