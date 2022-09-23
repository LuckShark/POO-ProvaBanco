public class Principal {
    public static void main(String[] args) {
        ContaBanco contaCorrente = new ContaBanco("00123",1,"Kahel");
        ContaBanco contaPoupanca = new ContaBanco("66600", 2,"Igor");

        //Para cada uma delas a classe deve abrir a conta,
        // depositar dinheiro , sacar dinheiro, mostrar o saldo
        // ao fim de cada operação e tentar fechar a conta.

        //Operações Conta 1 (corrente)

        contaCorrente.abrirConta();
        contaCorrente.mostrarSaldo();
        contaCorrente.depositar(1.0);
        contaCorrente.sacar(5.0);
        contaCorrente.fecharConta();

        System.out.println("------------------");

        //Operações Conta 2 (poupança)

        contaPoupanca.abrirConta();
        contaPoupanca.mostrarSaldo();
        contaPoupanca.depositar(50.0);
        contaPoupanca.sacar(49.0);
        contaPoupanca.fecharConta();

        System.out.println("------------------");

    }
}
