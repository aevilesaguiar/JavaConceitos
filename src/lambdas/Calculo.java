package lambdas;

@FunctionalInterface //força ter um unico método e usando em uma expressão lambda
public interface Calculo {
	
	public abstract double executar(double a, double b);
	
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
				}
	
	}
