package chain;

public class TestaDescontos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        CalculadorDeDescontos calculador = new CalculadorDeDescontos();
        Orcamento orcamento = new Orcamento(400.0);
        orcamento.adicionaItem(new Item("CANETA",250.0));
        orcamento.adicionaItem(new Item("LAPIS",250.0));
        orcamento.adicionaItem(new Item("papel",250.0));
        orcamento.adicionaItem(new Item("Tesoura",250.0));
        orcamento.adicionaItem(new Item("Borracha",250.0));
        orcamento.adicionaItem(new Item("Granpo",250.0));
        //Calcular 
        double desconto = calculador.calcula(orcamento);      
        System.out.println("seu desconto é "+desconto); 
    }
    
}//fim classe
