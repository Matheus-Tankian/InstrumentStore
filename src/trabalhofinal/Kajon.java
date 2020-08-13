package trabalhofinal;

import java.util.Scanner;

public class Kajon extends Percursao implements Eletrico, Acustico {
    Scanner input = new Scanner(System.in);
    public Kajon(String nome, double preco, int codigo, String modelo) {
        super(nome, preco, codigo, modelo);
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
        return String.format("Kajon\tNome %s\tPreco %.2f\tCodigo %d\t Modelo %s",getNome(),getPreco(),getCodigo(),getModelo());
    }
}
