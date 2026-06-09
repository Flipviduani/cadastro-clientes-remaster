package viduink;

import viduink.entities.Cliente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.UUID;

public class AppCadastroDeClientes {
    static void main() {

        System.out.println("\nSistema para cadastro de clientes.");
        System.out.println("\nPreencha os dados do cliente:");

        //Criando um objeto para acessar o conteúdo da classe Cliente:
        var cliente = new Cliente();

        //Criando um objeto para usar a classe Scanner do Java:
        var scanner = new Scanner(System.in);

        cliente.id = UUID.randomUUID(); //Gerando a ID do cliente
        cliente.dataHoraCadastro = LocalDateTime.now(); //Gerando a data e hora atuais

        System.out.print("\nNome..............: ");
        cliente.nome = scanner.nextLine();

        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Usando o formatter para que o arquivo seja lido no padrão ABNT
        System.out.print("\nData de nascimento: ");
        cliente.dataNascimento = LocalDate.parse(scanner.nextLine(), formatter);

        System.out.print("\nProfissão.........: ");
        cliente.profissao = scanner.nextLine();

        System.out.print("\nCPF...............: ");
        cliente.cpf = scanner.nextLine();

        System.out.print("\nTelefone..........: ");
        cliente.telefone = scanner.nextLine();

        System.out.print("\nE-mail............: ");
        cliente.email = scanner.nextLine();

        //Executando o método para salvar os dados do cliente
        cliente.salvarDados();

    }
}
