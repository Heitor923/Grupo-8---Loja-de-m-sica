package com.lojademusica;

import com.lojademusica.entidades.*;

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("faea",  1);


        Produto guitarra = new Instrumento(101, "Guitarra", 1500.0, Categoria.CORDAS, "Elétrica", "Fender");
        Produto bateria = new Instrumento(102, "Bateria", 2500.0, Categoria.PERCUSSAO, "Acústica", "Yamaha");
        Produto cordaExtra = new Acessorio(201, "Corda Extra", 50.0, Categoria.ACESSORIOS, "Aço");

        f.cadastrarProduto(guitarra);
        f.cadastrarProduto(bateria);
        f.cadastrarProduto(cordaExtra);

        System.out.println("Produtos Cadastrados");
        f.consultarProduto(101).exibirDetalhes();
        f.consultarProduto(102).exibirDetalhes();
        f.consultarProduto(201).exibirDetalhes();

   
        Venda venda1 = f.gerarVenda(1);
        venda1.adicionarProduto(guitarra, 1);
        venda1.adicionarProduto(cordaExtra, 2);

        Venda venda2 = f.gerarVenda(2);
        venda2.adicionarProduto(bateria, 1);

        System.out.println("\nVendas Realizadas");
        Venda v1 = f.consultarVenda(venda1.getId());
        System.out.printf("%n ID Venda: %d, Valor Total: R$ %.2f %n ", v1.getId(), v1.getValorTotal() );
        Venda v2 = f.consultarVenda(venda2.getId());
        System.out.printf("ID Venda: %d, Valor Total: R$ %.2f %n ", v2.getId(), v2.getValorTotal() );


    }
}

