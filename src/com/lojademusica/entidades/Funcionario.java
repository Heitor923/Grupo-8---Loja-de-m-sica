package com.lojademusica.entidades;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String nome;
    private int id;
    private List<Produto> produtos;
    private List<Venda> vendas;


    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.produtos = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }

     public void cadastrarProduto(Produto p){

        produtos.add(p);
    }
    public Produto consultarProduto(int codigo){

        for(Produto p : produtos){
            if(p.getCodigo() == codigo){
                return p;
            }
        }
        return null;
    }

    public Venda gerarVenda(int idVenda){
        Venda v = new Venda(idVenda, new java.util.Date());
        vendas.add(v);
        return v;
    }
    
    public Venda consultarVenda(int idVenda){
       for (Venda v : vendas){
        if(v.getId() == idVenda){
            return v;
        }
       }
       return null;
    }

    } 
