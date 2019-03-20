package chain;

public class Item {

    private String nome;
    private double valor;
// recebe o nome do item e valor e seta suas variaveis
    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
//busca nome do iten
    public String getNome() {
        return nome;
    }
//busca o valor do iten
    public double getValor() {
      return valor;
    }

}
