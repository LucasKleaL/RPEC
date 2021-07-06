
public class Main {

	public static void main(String[] args) {
		
		Expressao exp = new Expressao();
		
		exp.validaExpressao("[(1+2)]+(1+2)()()");
		exp.validaExpressao("(1+5)*56+12)");
		exp.validaExpressao("(1+5)*)56+12)");
		exp.validaExpressao("(1+5)*[56+12)");
		exp.validaExpressao("(((1+2)-3)*6)");

	}

}
