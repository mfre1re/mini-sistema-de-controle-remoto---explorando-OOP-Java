public class Conta {
    private static int proxConta = 1;
    private int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private String status;
    public Conta(float saldo, String status) {
        this.saldo = saldo;
        this.status = status;
        this.numConta += proxConta++;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void abrirConta(){
        this.setStatus("aberta");
    }

    public void depositar(int valor){
        if(this.status == "fechado"){
            System.out.println("Não é possível depositar um valor para uma conta que não existe");
        } else{
            this.saldo += valor;
        }
    }

    public void exibirStatus(){
        System.out.println("Número da Conta: " + getNumConta());
        System.out.println("Tipo da Conta: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: R$" + getSaldo());
        System.out.println("Status da conta: " + isStatus());
    }
}
