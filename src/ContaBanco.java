public class ContaBanco {

    public String numConta;
    public int tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(String numConta, int tipo, String dono) {
        this.numConta = numConta;
        if(tipo ==1 || tipo ==2){
            this.tipo = tipo;
        } else {
            System.out.println("ERRO - tipo inválido");
        }
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(){
        if (this.status==false){
            this.status = true;
            System.out.println("Conta aberta");
        }
        if(getTipo()==1){
            this.saldo = 50.0;
        } else if (getTipo()==2) {
            this.saldo = 150.0;
        } else {
            System.out.println("Tipo incorreto");
        }
    }
    public void mostrarSaldo(){ // esse fui eu que inventei
        System.out.println("Saldo atual é R$ "+getSaldo());
    }

    public void fecharConta(){
        if (this.status==true && getSaldo()==0){
            setStatus(false);
            System.out.println("Conta Encerrada!");
        } else {
            System.out.println("Conta não pode ser fechada agora");
        }
    }

    public void depositar(Double valor){
        if(isStatus() && valor>0){
            saldo += valor;
            System.out.println("O valor de R$ "+valor+" foi depositado");
            System.out.println("Saldo atual é de R$"+this.saldo);
        }else{
            System.out.println("ERRO: Reveja seus valores");
        }
    }
    public void sacar(Double saque){
        if (isStatus() && saque <= saldo){
            saldo-=saque;
            System.out.println("Seu saque foi de R$ "+saque);
            System.out.println("Seu saldo atual é R$ "+saldo);
        } else {
            System.out.println("Reveja seus valores");
        }
    }
    public void pagarMensalidade(){
        if (isStatus()){
            if(tipo==1){
                saldo -= 12;
            } else if (tipo==2){
                saldo -=20;
            } else {
                System.out.println("ERRO - tipo 1 ou 2 somente");
            }
        }
    };

}
