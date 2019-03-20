package chain;
// saber o próximo desconto de forma generica
public interface Desconto {
    //recebe o valor do orçamento
    double desconta(Orcamento orcamento);
    //setar qual desconto será chamado em seguida pela classe implementada na interface
    void setProximo(Desconto proximo);
  }


