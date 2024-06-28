package Professor;

public class CoordenadorCurso extends Professor {

	private double salarioAdicional;
	
	public CoordenadorCurso(int numeroRegistro, String nome, String dataNomeacao, double salario, double salarioAdicional) {
		
		super(numeroRegistro, nome, dataNomeacao, salario);
		this.salarioAdicional = salarioAdicional;
	}

	public void analisarPedidoSegundaChamada() {
		
		System.out.println(this.nome + " está analisando pedido de segunda chamada.");
	}
	
	public void analisarPedidoSuficiencia() {
		
		System.out.println(this.nome + " está analisando pedido de suficiência.");
	}
	
	public void participarReunioesDirecao() {
		
		System.out.println(this.nome + " está participando de reuniões da direção do campus.");
	}
	
	public void imprimirDadosCoordenador() {
		
		super.imprimirDadosProfessor();
		System.out.println("Salário Adicional: R$" + this.salarioAdicional);
		System.out.println("Salário Total: R$" + this.calcularSalario());
	}
	
	private double calcularSalario() {
		
		return this.salario + this.salarioAdicional;
	}
}