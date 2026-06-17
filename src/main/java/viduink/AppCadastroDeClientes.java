package viduink;

import viduink.entities.Cliente;
import viduink.repositories.ClienteRepository;
import viduink.services.ClienteService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppCadastroDeClientes {
    static void main(String[] args) {

        System.out.println("\nSistema para cadastro de clientes.");
        System.out.println("\nPreencha os dados do cliente:");

        //Criando um objeto para acessar o conteúdo da classe Cliente:
        var cliente = new Cliente();

        //Criando um objeto para usar a classe Scanner do Java:
        var scanner = new Scanner(System.in);

        //Metodo para chamar o serviço do cliente
        var service = new ClienteService();
        //Metodo para chamar o repositório do cliente
        var repository = new ClienteRepository();

        service.prepararCadastro(cliente);

        System.out.print("\nNome..............: ");
        cliente.setNome(scanner.nextLine());

        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Usando o formatter para que o arquivo seja lido no padrão ABNT

        System.out.print("\nData de nascimento: ");
        cliente.setDataNascimento(
                LocalDate.parse(scanner.nextLine(), formatter)
        );

        System.out.print("\nProfissão.........: ");
        cliente.setProfissao(scanner.nextLine());

        System.out.print("\nCPF...............: ");
        cliente.setCpf(scanner.nextLine());

        System.out.print("\nTelefone..........: ");
        cliente.setTelefone(scanner.nextLine());

        System.out.print("\nE-mail............: ");
        cliente.setEmail(scanner.nextLine());

        //Executando o metodo para salvar os dados do cliente
        repository.salvar(cliente);

    }
}