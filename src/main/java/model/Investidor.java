/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author giova
 */
public class Investidor extends Pessoa{
    private Carteira carteira1 = new Carteira();

    public Investidor(String nome, String cpf, String senha) {
        super(nome, cpf, senha);
    }

    public Investidor() {
    }

    public Carteira getCarteira1() {
        return carteira1;
    }

    public void setCarteira1(Carteira carteira1) {
        this.carteira1 = carteira1;
    }
    
    
    
}
