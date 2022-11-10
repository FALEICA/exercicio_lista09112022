package entidade;

public class Pessoa {
	private Integer	idPessoa;
	private String	namePessoa;
	private	double	salarioPessoa;
	
	
	public Pessoa(Integer idPessoa, String namePessoa, double salarioPessoa) {
		this.idPessoa = idPessoa;
		this.namePessoa = namePessoa;
		this.salarioPessoa = salarioPessoa;
			
	}


	public Integer getIdPessoa() {
		return idPessoa;
	}


	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}


	public String getNamePessoa() {
		return namePessoa;
	}


	public void setNamePessoa(String namePessoa) {
		this.namePessoa = namePessoa;
	}


	public double getSalarioPessoa() {
		return salarioPessoa;
	}


	public void setSalarioPessoa(double salarioPessoa) {
		this.salarioPessoa = salarioPessoa;
	}
	
	
	
	public double acrescimoSalario(double salarioPessoa, double percent) {
		return this.salarioPessoa = this.salarioPessoa * 1+(percent/100);
		
		
	}
	
	

}
