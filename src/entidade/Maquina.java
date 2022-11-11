package entidade;

public class Maquina {
	Integer maqNum;
	String	maqDesc;
	boolean maqEstado;
	
	
	public Maquina(Integer maqNum, String maqDesc, boolean maqEstado) {
		super();
		this.maqNum = maqNum;
		this.maqDesc = maqDesc;
		this.maqEstado = maqEstado;
	}


	public Integer getMaqNum() {
		return maqNum;
	}


	public void setMaqNum(Integer maqNum) {
		this.maqNum = maqNum;
	}


	public String getMaqDesc() {
		return maqDesc;
	}


	public void setMaqDesc(String maqDesc) {
		this.maqDesc = maqDesc;
	}


	public boolean isMaqEstado() {
		return maqEstado;
	}


	public void setMaqEstado(boolean maqEstado) {
		this.maqEstado = maqEstado;
	}
	
	
	public String estadoDamaquina(){
		String maqMsg;
		if(this.maqEstado) {
			maqMsg = "A MAquina esta LIGADA!.";
			System.out.println(maqMsg);
			return maqMsg;
		}else {
			maqMsg = "A MAquina esta DESLIGADA!.";
			System.out.println(maqMsg);
			return maqMsg;
		}
	}
	
}
		
