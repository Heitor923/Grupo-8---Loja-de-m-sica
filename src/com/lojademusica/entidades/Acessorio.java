public class Acessorio extends Produto {
    private String material;

    public Acessorio(int codigo, String nome, double preco, Categoria categoria, String material) {
        super(codigo, nome, preco, categoria);
        this.material = material;
    }
public String getMaterial() {
        return material;
    }
    @Override
    public void exibirDetalhes() {
        System.out.printf("Acessório: %s - Material: %s\n", getNome(), getMaterial());
    }
}
