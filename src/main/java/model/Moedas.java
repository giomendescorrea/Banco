/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author giova
 */

public abstract class Moedas {
    private double valor;
    private double taxaVenda;
    private double taxaCompra;
    private double cotacao;
    private String nomeMoeda;
    
    public Moedas(double valor, double taxaVenda, double taxaCompra, double cotacao, String nomeMoeda) {
        this.valor = valor;
        this.taxaVenda = taxaVenda;
        this.taxaCompra = taxaCompra;
        this.cotacao = cotacao;
        this.nomeMoeda = nomeMoeda;
    }

    public double getValor() {
        return valor;
    }

    public double getTaxaVenda() {
        return taxaVenda;
    }

    public double getTaxaCompra() {
        return taxaCompra;
    }

    public double getCotacao() {
        return cotacao;
    }

    public String getNomeMoeda() {
        return nomeMoeda;
    }

    public double getQuantidade() {
        return valor / cotacao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTaxaVenda(double taxaVenda) {
        this.taxaVenda = taxaVenda;
    }

    public void setTaxaCompra(double taxaCompra) {
        this.taxaCompra = taxaCompra;
    }

    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }

    public void setNomeMoeda(String nomeMoeda) {
        this.nomeMoeda = nomeMoeda;
    }

}
