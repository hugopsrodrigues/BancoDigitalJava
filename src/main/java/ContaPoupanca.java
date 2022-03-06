public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 20001;

    public static int getSEQUENCIAL() {
        return SEQUENCIAL;
    }

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.SEQUENCIAL++;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        super.imprimirExtratoConta();
        System.out.printf("Agencia: %d\n", this.SEQUENCIAL);
    }
}
