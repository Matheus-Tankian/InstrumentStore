package trabalhofinal;

public abstract class Instruentos extends Loja{

	

	private double preco;

	private int codigo;
        
        private String modelo;

    public Instruentos(double preco, int codigo, String modelo, String nome) {
        super(nome);
        this.preco = preco;
        this.codigo = codigo;
        this.modelo = modelo;
    }
        
	

  

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return String.format("\tNome %s\tPreco %.2f\tCodigo %d\t Modelo %s",getNome(),getPreco(),getCodigo(),getModelo());
    }
    
    
        
        
        

}
