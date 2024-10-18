// Classe abstrata que define o comportamento geral de um pagamento
abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    // Método abstrato que será implementado pelas subclasses
    public abstract void realizarPagamento();
}

// Classe concreta para pagamento em dinheiro
class PagamentoDinheiro extends Pagamento {

    public PagamentoDinheiro(double valor) {
        super(valor);
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento de R$" + valor + " realizado em dinheiro.");
    }
}

// Classe concreta para pagamento com cartão de crédito
class PagamentoCartaoCredito extends Pagamento {
    private String numeroCartao;
    private String titular;

    public PagamentoCartaoCredito(double valor, String numeroCartao, String titular) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.titular = titular;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito.");
        System.out.println("Titular: " + titular + ", Número do Cartão: " + numeroCartao);
    }
}

// Classe principal para testar o sistema de pagamento
public class SistemaPagamento {
    public static void main(String[] args) {
        // Pagamento em dinheiro
        Pagamento pagamentoDinheiro = new PagamentoDinheiro(100.0);
        pagamentoDinheiro.realizarPagamento();

        // Pagamento com cartão de crédito
        Pagamento pagamentoCartao = new PagamentoCartaoCredito(200.0, "1234-5678-9012-3456", "João Silva");
        pagamentoCartao.realizarPagamento();
    }
}
