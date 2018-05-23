
public class hello {
	
	public static void main(String[] args) {
		Conta contaDaGiselle = new Conta();
		Conta contaDoGui = new Conta();
		
		contaDaGiselle.setAgencia(1467);
		int numeroDaContaDaGiselle = contaDaGiselle.getAgencia();
		
		System.out.println(numeroDaContaDaGiselle);
	}

}
