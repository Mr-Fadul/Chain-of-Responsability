package chain;

public class DescontoPorMaisDeCincoItens implements Desconto {
	
	private Desconto proximo;    
    //recebe a quantidade de itens.
        @Override
    public double desconta(Orcamento orcamento) {
        //se maior que 5 pega o valor do orçamento e da o desconto de 10%.
        if(orcamento.getItens().size() > 5) {
          return orcamento.getValor() * 0.1;
        }
        else {
            //caso tenha menos de 5 itens, passa o valor do orçamento 
            //para a função na próxima classe instanciada. 
          return proximo.desconta(orcamento);
        }
      }
      //preenche a variavel 'próximo' com a próxima classe da corrente
    // a variavel passar a ser um objeto instanciado.
        @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
      }
}//fim classe
