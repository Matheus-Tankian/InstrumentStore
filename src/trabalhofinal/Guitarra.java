package trabalhofinal;

import java.util.Scanner;

public class Guitarra extends Corda implements Eletrico{
    Scanner input = new Scanner(System.in);

    public Guitarra(String nome,double preco, int codigo, String modelo) {
        super(preco, codigo, modelo, nome);
    }
    


    @Override
    public void eletrico() {
        System.out.println("Eletrico");
    }
   
    @Override
    public String toString() {
        return String.format("Guitarra\tNome %s\tPreco %.2f\tCodigo %d\t Modelo %s",getNome(),getPreco(),getCodigo(),getModelo());
    }
    
    

}
