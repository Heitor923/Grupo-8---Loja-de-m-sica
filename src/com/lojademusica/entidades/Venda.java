package com.lojademusica.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.lojademusica.entidades.ItemVenda;





public class Venda {
    private int id;
    private Date data;
    private List<ItemVenda> itens;
    private double valorTotal;

    public Venda(int id, Date data) {
        this.id = id;
        this.data = data;
        this.itens = new ArrayList<>();
        
    }

    public void adicionarProduto(Produto p, int qtd) {
        ItemVenda item = new ItemVenda(p, qtd);
        itens.add(item);
        calcularTotal();
    }

    public double calcularTotal() {
        valorTotal = 0;
        for (ItemVenda item : itens) {
            valorTotal += item.calcularSubtotal();
        }
        return valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public int getId() {
    return id;
}
}
