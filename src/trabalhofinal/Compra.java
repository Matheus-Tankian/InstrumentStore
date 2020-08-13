/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;

/**
 *
 * @author Matheus
 */
public class Compra{

  
    int codigo;
    double preco;
    String nome,modelo;
    
    Compra(String nome, String modelo, int codigo, double preco) {
        setCodigo(codigo);
        setModelo(modelo);
        setNome(nome);
        setPreco(preco);
       
    }
    
     @Override
    public String toString() {
        return String.format("\nNome %s\t Modelo %s\t Preco %.2f\t Codigo %d",getNome(),getModelo(),getPreco(),getCodigo());
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    

   
    
  
  
 
   
    
   
    
}
