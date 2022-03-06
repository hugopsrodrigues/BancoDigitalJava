public class Main {
    public static void main(String[] args) {
        IConta cc = new ContaCorrente();
        cc.depositar(100);

        IConta cp = new ContaPoupanca();
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
