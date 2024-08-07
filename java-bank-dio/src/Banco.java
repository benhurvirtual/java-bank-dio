import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Conta> contas = new HashMap<>();

    public void adicionarConta(Conta conta) {
        contas.put(conta.getNumero(), conta);
    }

    public Conta buscarConta(String numero) {
        return contas.get(numero);
    }

    public boolean realizarTransferencia(String numeroOrigem, String numeroDestino, double valor) {
        Conta contaOrigem = buscarConta(numeroOrigem);
        Conta contaDestino = buscarConta(numeroDestino);

        if (contaOrigem != null && contaDestino != null) {
            return contaOrigem.transferencia(valor, contaDestino);
        }
        return false;
    }
}
