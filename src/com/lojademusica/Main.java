package com.lojademusica;

import com.lojademusica.entidades.Funcionario;

import com.lojademusica.entidades.Produto;
import com.lojademusica.entidades.Venda;
import com.lojademusica.entidades.Instrumento;
import com.lojademusica.entidades.Acessorio;
import com.lojademusica.entidades.Categoria;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", 1);

        // instanciando subclasses concretas, não Produto direto
        Produto guitarra = new Instrumento(101, "Guitarra", 1500.0, Categoria.CORDAS, "Cordas", "Fender");
        Produto baqueta = new Acessorio(201, "Baqueta", 50.0, Categoria.ACESSORIOS, "Madeira");

        f1.cadastrarProduto(guitarra);
        f1.cadastrarProduto(baqueta);

        Venda venda1 = f1.gerarVenda(1);
        venda1.adicionarProduto(guitarra, 1);
        venda1.adicionarProduto(baqueta, 2);

        System.out.println("Itens da venda:");
        venda1.exibirItens();
        System.out.println("Valor total da venda: R$ " + venda1.getValorTotal());
    }
}
