package chain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private double valor;
    private List<Item> itens;
//recebe o valor do orçamento e instancia a variavel
    public Orcamento(double valor) {
        this.valor = valor;
        //recebe a lista imutavel montada a partir dos itens construidos na classe itens
        this.itens = new ArrayList<Item>();
    }
//busca valor
    public double getValor() {
        return valor;
    }
//busca a lista imutavel
    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }
//recebe os itens da classe itens e preenche uma lista, que retorna no metodo list<iten> que o torna imutavel
    public void adicionaItem(Item item) {
        itens.add(item);
    }

}