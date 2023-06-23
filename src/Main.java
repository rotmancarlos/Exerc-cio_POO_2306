
public class Main {
    public static void main(String[] args) {
// Criar contas
        ContaPoupanca poupanca = new ContaPoupanca("Carlos", "2107", 10);
        ContaEspecial especial = new ContaEspecial("Rotman", "2206", 500.0);

// Sacar um valor das contas
        poupanca.sacar(200.0);
        especial.sacar(700.0);


// Depositar
        poupanca.depositar(1000.0);
        especial.depositar(300.0);


// Mostrar novo saldo com rendimento
        poupanca.calcularNovoSaldo(1.5);

//Taxa Rendimento de 1.5


// Mostrar dados da conta do cliente
        poupanca.mostrarDados();
        especial.mostrarDados();
    }

}