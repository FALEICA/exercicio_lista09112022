package entidade;

public class Produto {
	private String prodName;

	public Produto(String prodName) {
		this.prodName = prodName;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	
	public void showMsgProd() {
		System.out.println("Ok! o produto é: " + this.prodName);
		
	}
	
	

}
