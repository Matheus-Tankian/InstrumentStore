package trabalhofinal;

import java.util.Scanner;

public class MeiaLua extends Percursao implements Acustico {
    Scanner input = new Scanner(System.in);
    public MeiaLua(String nome, double preco, int codigo, String modelo) {
        super(nome, preco, codigo, modelo);
    }

   
    @Override
    public void acustico() {
        System.out.println("Acustico");
    }

  
      @Override
    public String toString() {
        return String.format("Meia Lua\tNome %s\tPreco %.2f\tCodigo %d\t Modelo %s",getNome(),getPreco(),getCodigo(),getModelo());
    }
}
