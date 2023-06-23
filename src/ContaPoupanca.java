class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, String numConta, int diaRendimento) {
        super(nomeCliente, numConta);
        this.diaRendimento = diaRendimento;
    }
    public void calcularNovoSaldo(double taxaRendimento) {
        double rendimento = saldo * taxaRendimento / 100;
        saldo += rendimento;
        System.out.println("Novo saldo com rendimento: R$" + saldo);
    }

    @Override
    public void sacar(double valor) {

    }
}
