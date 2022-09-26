public class AplicacaoCliente {
    public static void main(String[] args) {
        ClienteDoBanco cliente = new ClienteDoBanco("Daniel Rodrigues da Silva");
        ContaBancaria conta = new ContaBancaria("1365-9");

        Fachada facade = new Fachada();
        facade.fazerDeposito(1700, cliente, conta);
    }
}
