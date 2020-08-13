package trabalhofinal;

import java.util.Scanner;

public class Bateria extends Percursao implements Eletrico, Acustico {
    Scanner input = new Scanner(System.in);

    public Bateria(String nome, double preco, int codigo, String modelo) {
        super(nome, preco, codigo, modelo);
    }
   

  
    @Override
    public void eletrico() {
        System.out.println("Eletrica");
    }

    @Override
    public void acustico() {
        System.out.println("Acustica");
    }
    
    
    
    @Override
    public String toString() {
        return String.format("Bateria\tNome %s\tPreco %.2f\tCodigo %d\t Modelo %s",getNome(),getPreco(),getCodigo(),getModelo());
    }
}
