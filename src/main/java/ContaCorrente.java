public class ContaCorrente extends Conta {

    private static int SEQUENCIAL = 10001;

    public static int getSEQUENCIAL() {
        return SEQUENCIAL;
    }

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.SEQUENCIAL++;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirExtratoConta();
        System.out.printf("Agencia: %d\n", this.SEQUENCIAL);
    }
}
