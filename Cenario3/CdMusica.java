public class CdMusica extends Produto{
    public int NumeroFaixas;
    public String Produtora;

    public void setNumeroFaixas(int NumeroFaixas){
        this.NumeroFaixas = NumeroFaixas;
    }
    public void setProdutora(String Produtora){
        this.Produtora = Produtora;
    }
    public int getNumeroFaixas(){
      return NumeroFaixas;
    }
    public String getProdutora(){
      return Produtora;
    }
    public String toString(){
      return "cd " + NumeroFaixas + "\nprodutora: " + Produtora + "\nnome do produto: " + nomeDoProduto + "\ntipo do produto: " + tipoDoProduto;
    }
  
}
