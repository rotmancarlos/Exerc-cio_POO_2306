import java.text.DecimalFormat;

abstract class ContaBancaria {
    protected String nomeCliente;
    protected String numConta;
    protected double saldo;

    public ContaBancaria(String nomeCliente, String numConta) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado: R$" + valor);
    }

    public abstract void sacar(double valor);

    public void mostrarDados() {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Número da Conta: " + numConta);
        System.out.println("Saldo: R$" + df.format(saldo));
    }

}