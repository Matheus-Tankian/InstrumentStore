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
public abstract class Pessoa extends Loja{
    private String codigo;

    public Pessoa(String codigo, String nome) {
        super(nome);
        setCodigo(codigo);
    }
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    
    
}
