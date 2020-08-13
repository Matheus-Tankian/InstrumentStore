package trabalhofinal;

import java.util.Scanner;

public class Violao extends Corda implements Eletrico, Acustico {
   
    Scanner input = new Scanner(System.in);

    public Violao(String nome,double preco, int codigo, String modelo) {
        super(preco, codigo, modelo, nome);
    }
   
    

   

    @Override
    public void eletrico() {
        System.out.println("Eletrico");
    }

    @Override
    public void acustico() {
        System.out.println("Acustico");
    }
    
  
    
      @Override
    public String toString() {
        return String.format("Violao\tNome %s\tPreco %.2f\tCodigo %d\t Modelo %s",getNome(),getPreco(),getCodigo(),getModelo());
    }

}
