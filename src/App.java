public class App {
    public static void main(String[] args) throws Exception {
        Cliente c2=new Cliente(1, null);
        Cliente c1= new Cliente(012, null);
        Conta ct1=new Conta(002, 98, c1);
        Conta ct2=new Conta(003, 2000, c2);
        c1.setConta(ct1);
        c2.setConta(ct2);
        Movimentacao m1=new Movimentacao(0, null, null, 120);
        Movimentacao m2=new Movimentacao(1, null, null, 100);
        ct1.realizarDeposito(m1);
        ct1.realizarSaque(m2);

        Movimentacao m3= new Movimentacao(2, ct2, ct1, 100);

        ct1.realizarTransf(m3);


        c1.imprimirDados();

        c2.imprimirDados();

        
    }
}
