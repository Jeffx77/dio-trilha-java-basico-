public class main {

    public static void main(String[] args) {
        Cliente Jefferson = new Cliente();
        Jefferson.setNome("Jefferson");

        Conta cc = new ContaCorrente(Jefferson);
        ContaPoupanca cp = new ContaPoupanca(Jefferson);

        cc.depositar(100);
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        
    }
}
