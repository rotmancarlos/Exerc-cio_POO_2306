class ContaEspecial extends  ContaBancaria {
    private double limite;

    public ContaEspecial(String nomeCliente, String numConta, double limite) {
        super(nomeCliente, numConta);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque realizado: R$" + valor);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
}
