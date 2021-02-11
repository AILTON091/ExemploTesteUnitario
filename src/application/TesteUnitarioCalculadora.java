package application;

public class TesteUnitarioCalculadora {

	public void reultadoTesteCalculara(){
		
		Calculadora cal = new Calculadora();
		
		Integer resp = cal.somar(2, 2);
		
		if (resp == 4)
			System.out.println("Teste ok!");
		else
			System.out.println("Teste Falhou!");			
	}
}
