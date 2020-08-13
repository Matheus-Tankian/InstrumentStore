package trabalhofinal;

import java.util.Scanner;

public class Sintetizador extends Teclas implements Eletrico {
    Scanner input = new Scanner(System.in);
           
    public Sintetizador(String nome, double preco, int codigo, String modelo) {
        super(nome, preco, codigo, modelo);
    }

  

    @Override
    public void eletrico() {
        System.out.println("Eletrico");
    }
    
   
      @Override
    public String toString() {
        return String.format("Sintetizador\tNome %s\tPreco %.2f\tCodigo %d\t Modelo %s",getNome(),getPreco(),getCodigo(),getModelo());
    }

}
