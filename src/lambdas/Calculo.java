package lambdas;

@FunctionalInterface //for�a ter um unico m�todo e usando em uma express�o lambda
public interface Calculo {
	
	public abstract double executar(double a, double b);
	
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
				}
	
	}
