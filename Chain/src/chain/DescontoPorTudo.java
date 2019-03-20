/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain;

/**
 *
 * @author 41713029
 */
public class DescontoPorTudo implements Desconto {
private Desconto proximo;   
    @Override
    public double desconta(Orcamento orcamento) {
         //comparar se o orçamento é maior que 300 e tem mais de 4 itens, recebe 20% de desconto
        if((orcamento.getItens().size() > 4 )&& (orcamento.getValor() > 300)  ){
          return orcamento.getValor() * 0.2;
        }
        else {
            //caso não atenda ao requisito, passa o valor do orçamento 
            //para a função na próxima classe instanciada. 
          return proximo.desconta(orcamento);
        }
    }
    //preenche a variavel 'próximo' com a próxima classe da corrente
    // a variavel passar a ser um objeto instanciado.
    @Override
    public void setProximo(Desconto proximo) {
        
    }
    
}//fim classe
