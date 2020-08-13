package trabalhofinal;

import java.util.Scanner;

public class Trompete extends Sopro implements Acustico {
    Scanner input = new Scanner(System.in);
    public Trompete(String nome, double preco, int codigo, String modelo) {
        super(nome, preco, codigo, modelo);
    }


    @Override
    public void acustico() {
        System.out.println("Acustico");
    }

  
      @Override
    public String toString() {
        return String.format("Trompete\tNome %s\tPreco %.2f\tCodigo %d\t Modelo %s",getNome(),getPreco(),getCodigo(),getModelo());
    }
}
