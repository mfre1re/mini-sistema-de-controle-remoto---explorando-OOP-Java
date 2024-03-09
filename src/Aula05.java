public class Aula05 {
    public static void main(String[] args) {
        Conta c1 = new Conta(0.0f, "fechado");
        c1.setDono("Miguel");
        c1.setTipo("cc");
        c1.setSaldo(475000);
        c1.setStatus("Aberta");
        c1.exibirStatus();

        System.out.println();

        Conta c2 = new Conta(0.0f, "fechado");
        c2.setDono("Isadora");
        c2.setTipo("cp");
        c2.setSaldo(475000);
        c2.abrirConta();
        c2.depositar(5000);
        c2.exibirStatus();
    }
}
