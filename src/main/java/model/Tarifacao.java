/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package model;

import java.util.Random;


/**
 *
 * @author giova
 */

public interface Tarifacao {
    // arraylist que organiza as 3 moedas que temos
    double[] cotacoes = new double[3];
    
    // taxas definidas previamente no projeto
    default double taxaCompraBitcoin() {
        return 0.02;
    }
    default double taxaVendaBitcoin() {
        return 0.03;
    }
    default double taxaCompraEthereum() {
        return 0.01;
    }
    default double taxaVendaEthereum() {
        return 0.02;
    }
    default double taxaCompraRipple() {
        return 0.01;
    }
    default double taxaVendaRipple() {
        return 0.01;
    }
    
    default double cotacaoMoedas(double precoAtual) {
        Random random = new Random();
        double variacao = (random.nextDouble() - 0.5) * 0.01;
        return precoAtual * (1 + variacao);
    }
    
    default void setCotacao(int index, double cotacao) {
        if (index >= 0 && index < cotacoes.length) {
            cotacoes[index] = cotacao;
        }
    }
    default double getCotacao(int index) {
        if (index >= 0 && index < cotacoes.length) {
            return cotacoes[index];
        }
        return 0.0;
    } 
}

