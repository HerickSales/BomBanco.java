public class Conta {
    private int numero;
    private double saldo;
    private Cliente cliente;
    private Movimentacao movs;
    

    public Conta(int numero, double saldo, Cliente cliente){
        this.numero=numero;
        this.saldo=saldo;
        this.cliente=cliente;
        this.movs=null;

    }
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public int getNumero(){
        return this.numero;
    }
    public Movimentacao getMovs(){
        return movs;
    }

    public void setMovs(Movimentacao mov){
        this.movs=mov;
    }
    

    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public double getSaldo(){
        return saldo;
    }

    public boolean realizarDeposito(Movimentacao mov){
        saldo+=mov.getValor();

        addMov(mov);
       return true;
    }

    public boolean realizarSaque(Movimentacao mov){
        if(mov.getValor()>saldo){
            System.out.println("Saldo insuficiente");
            return false;
        }
        saldo-=mov.getValor();
        addMov(mov); 
        return true;
    }

    public boolean realizarTransf(Movimentacao mov){
        if(mov.getContaOrig().getSaldo()<mov.getValor()){
            System.out.println("Saldo insuficiente para realizar a transferencia");
            return false;
        }
        Conta aux=mov.getContaOrig();
        aux.setSaldo(aux.getSaldo()-mov.getValor());
        aux.addMov(mov);
        aux=mov.getContaDest();
        aux.setSaldo(aux.getSaldo()+mov.getValor());
        aux.addMov(mov);


        return true;
    }

    private void  addMov(Movimentacao mov){
        Movimentacao aux=movs;
        mov.setProx(null);
        if(aux==null){
            setMovs(mov);
            return;
        }
            while( aux.getProx()!= null){ 
                aux=aux.getProx();
            }
            aux.setProx(mov);   
        }

}