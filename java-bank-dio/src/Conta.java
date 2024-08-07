public abstract class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean saque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferencia(double valor, Conta destino) {
        if (saque(valor)) {
            destino.deposito(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Número: " + numero + ", Saldo: " + saldo;
    }
}
