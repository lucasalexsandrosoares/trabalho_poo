class Main {
  public static void main(String[] args) {
    Produto p = new Produto();
  
    CdMusica cd = new CdMusica();
    cd.setTipoDoProduto("CD");
    cd.setNomeDoProduto("Festival Summer");
    cd.setNumeroFaixas(10);
    cd.setProdutora("Sony Music");
    

    Produto[] lista = new Produto[4];
    lista[0] = p;
    lista[1] = cd;
    System.out.println(lista[1]);
  }
}