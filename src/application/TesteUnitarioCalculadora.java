package application;

public class TesteUnitarioCalculadora {

	public void reultadoTesteCalculara(){
		
		Calculadora cal = new Calculadora();
		
		Integer resposta = cal.somar(2, 2);
		
		if (resposta == 4)
			System.out.println("Teste ok!");
		else
			System.out.println("Teste Falhou!");			
	}
}
