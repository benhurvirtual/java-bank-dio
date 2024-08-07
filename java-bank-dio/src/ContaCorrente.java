public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    @Override
    public boolean saque(double valor) {
        if (valor > 0 && valor <= (getSaldo() + limite)) {
            return super.saque(valor);
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + ", Limite: " + limite;
    }
}
