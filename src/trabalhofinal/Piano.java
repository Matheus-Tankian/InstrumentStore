package trabalhofinal;

import java.util.Scanner;

public class Piano extends Corda implements Acustico {
    Scanner input = new Scanner(System.in);

    public Piano(String nome,double preco, int codigo, String modelo) {
        super(preco, codigo, modelo, nome);
    }
   

  

    @Override
    public void acustico() {
        
        System.out.println("Acustico");
    }
   
    
      @Override
    public String toString() {
        return String.format("Piano\tNome %s\tPreco %.2f\tCodigo %d\t Modelo %s",getNome(),getPreco(),getCodigo(),getModelo());
    }

}
