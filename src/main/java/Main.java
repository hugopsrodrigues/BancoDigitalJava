public class Main {
    public static void main(String[] args) {
        Cliente novoCliente = new Cliente();
        novoCliente.setCpf("12345678901");
        novoCliente.setNome("Joao dos Testes");

        IConta cc = new ContaCorrente(novoCliente);
        cc.depositar(100);

        IConta cp = new ContaPoupanca(novoCliente);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
