public class Movimentacao {
    private int tipo;
    private Conta contaDest;
    private Conta contaOrig;
    private double valor;
    private Movimentacao prox;


    public Movimentacao(int tipo,Conta contaDest, Conta contaOrig, double valor){
        this.tipo=tipo;
        this.contaDest=contaDest;
        this.contaOrig=contaOrig;
        this.valor=valor;
        this.prox=null;
    }
    public void setProx(Movimentacao prox) {
        this.prox = prox;
    }
    public Movimentacao getProx(){
        return prox;
    }
    public int getTipo(){
        return this.tipo;
    }

    public double getValor(){
        return valor;
    }
    public Conta getContaOrig(){
        return contaOrig;
    }
    public Conta getContaDest(){
        return contaDest;
    }
    

    
}
