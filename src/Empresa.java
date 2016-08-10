
public class Empresa {
	private String nome;
	private int cnpj;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}


	public static void main(String args[]){
		Empresa e1 = new Empresa();
		
		e1.setNome("NoName");
		e1.setCnpj(848148551);
		
		System.out.println("Nome da empresa "+e1.getNome());
		System.out.println("Cnpj da Empresa "+e1.getCnpj());
	}
	
}