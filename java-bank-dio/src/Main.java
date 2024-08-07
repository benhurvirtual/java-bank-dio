public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente contaCorrente = new ContaCorrente("12345", 1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("54321");

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        contaCorrente.deposito(500);
        contaPoupanca.deposito(300);

        System.out.println("Antes da transferência:");
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);

        banco.realizarTransferencia("12345", "54321", 200);

        System.out.println("Depois da transferência:");
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
    }
}
