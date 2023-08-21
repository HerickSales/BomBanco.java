public class Cliente {
    private int id;
    private Conta conta;

    public Cliente (int id, Conta conta) {
        this.id = id;
        this.conta = conta;
    }
    public void setConta(Conta conta){
        this.conta=conta;
    }

    public void imprimirDados(){
        System.out.println("Id do cliente: "+id+"\nNumero da conta: "+conta.getNumero());

        System.out.println("\nMovimentacoes");
        System.out.println("--------------------------------------");
    
        imprimirMovs();
    }

    public void imprimirMovs(){

        Movimentacao aux=conta.getMovs();
        if(aux==null){
        System.out.println("Nao ha Movimentacoes");
        }
        while(aux != null){
            System.out.print("Tipo: ");
            if(aux.getTipo()==0){
                System.out.println("Deposito ");
            }else if(aux.getTipo()==1){
                System.out.println("Saque");
            }else{
                System.out.println("Transferencia");
                if(aux.getContaOrig()==this.conta){
                    System.out.println("Conta destino: "+aux.getContaDest().getNumero());
                }else{
                    System.out.println("Conta Origem: "+aux.getContaOrig().getNumero());
                }
            }

            System.out.println("valor: "+aux.getValor());
            System.out.println("");
            aux=aux.getProx();
        }
        System.out.println("--------------------------------------");
        System.out.println("Saldo final: "+ conta.getSaldo());
        System.out.println("--------------------------------------");

        
    }




    
}



