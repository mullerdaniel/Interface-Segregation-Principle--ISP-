package Interfaces;

public interface CadastrarClienteInterface {
    void cadastrarCliente(String nome, String email);
    String buscarClientePorEmail(String email);
}

