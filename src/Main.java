public class Main {

    public static void main(String[] args) {
        Cliente robinson = new Cliente();
        robinson.setNome("Robinson");

        Conta cc = new ContaCorrente(robinson);
        Conta poupanca = new ContaPoupanca(robinson);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
