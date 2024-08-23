package entidade;

public class Conta {
    protected int numero;
    private String nome;
    private double saldo;
    
        public Conta(int numero, String nome, double saldo) {
		
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}
	public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;  
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public String mostrar() {
    	return "\n Nome: " + nome + "\n Saldo: " + saldo;
    		
    }
   
}