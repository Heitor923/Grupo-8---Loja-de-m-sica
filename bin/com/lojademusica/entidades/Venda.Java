public class Venda {
    private int id;
    private Date data;
    private List<ItemVenda> itens;
    private double valorTotal;

    public Venda(int id, Date data) {
        this.id = id;
        this.data = data;
        this.itens = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void adicionarProduto(Produto p, int qtd) {

    }
    public double calcularTotal() {

    }
    public double getValorTotal() {
        return valorTotal;
    }

}