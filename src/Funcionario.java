
public class Funcionario {

		private String nome;
		private double salario;
		private int rg;
		private final int identificador;
		private static int numFuncionarios;
		
		Funcionario(){
			identificador = ++numFuncionarios;
		}
		
		Funcionario(String nome){
			setNome(nome);
			identificador = ++numFuncionarios;
		}
		
		public int getIdentificador(){
			return this.identificador;
		}
		
		public double getSalario() {
			return this.salario;
		}
		
		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		public int getRg() {
			return rg;
		}
		
		public void setRg(int rg) {
			this.rg = rg;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		
		
		
	public static void main(String args[]){
 		Funcionario f1 = new Funcionario();
 		
 		f1.setNome("Manoel");
 		f1.setSalario(2365);
 		f1.setRg(14541);
 		
 		  System.out.print("Nome do funcionário: " + f1.getNome());
		  System.out.print("\nSalario Atual: R$ " + f1.getSalario());
		  System.out.println("\nRG do funcionario: "+f1.getRg());
 		
 		}
 	}
 	
