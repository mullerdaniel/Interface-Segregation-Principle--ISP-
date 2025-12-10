import Interfaces.CadastrarClienteInterface;

public class Main {
    public static void main(String[] args) {

        // Cliente Comum
        CadastrarClienteInterface clienteComum = new ClienteComumService();

        clienteComum.cadastrarCliente("Lucas", "lucas@email.com");
        System.out.println(clienteComum.buscarClientePorEmail("lucas@email.com"));

        System.out.println("\n-----------------------------\n");


        // Cliente VIP
        ClienteVIPService clienteVIP = new ClienteVIPService();
        // Ele implementa todas as interfaces necessarias

        clienteVIP.cadastrarCliente("Luiz", "luiz@email.com");
        System.out.println(clienteVIP.buscarClientePorEmail("luiz@email.com"));

        clienteVIP.enviarNotificacao("luiz@email.com",
                "Bem-vinda à área VIP!");

        clienteVIP.aplicarDescontoVIP("luiz@email.com",
                15.0);

    }
}
