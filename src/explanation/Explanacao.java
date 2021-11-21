package explanation;

public class Explanacao {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//O que sao classes wrapper? Classes wrapper sao como os tipos primitivos que temos, mas com alguns metodos
		//Que podem nos ajudar e muito. Mas claro que eles ocupam muito mais espaco do que um tipo primitivo normal
		
		//Como Declarar uma ClasseWrapper?
		
		byte byteNormal = 1;
		short shortNormal = 1;
		int intNormal = 1;
		long longNormal = 1l;
		float floatNormal = 1.0f;
		double doubleNormal = 3040.0d;
		char charNormal = 'A';
		boolean booleanNormal = true;
		
		//A maioria das declaracoes de Wrapper, funciona so colocando a primeira letra maiuscula
		
		Byte byteWrapper = 2;
		Short shortWrapper = 2; //Obs.: A classe Long precisa de um "l" no final, porque se nao o java nao reconhece que
		Integer intWrapper = 2; //O dado e do tipo Long. Mesma coisa com o Float e Double.
		Long longWrapper = 2l;
		Float floatWrapper = 2f;
		Double doubleWrapper = 2d;
		Character charWrapper = 'B';
		Boolean booleanWrapper = false;
		
		//Boxing e Unboxing
		
		//O que e isso? Como o nome ja diz, a gente pode "encapsular" ou "desencapsular" ou termos mais leigos, podemos
		//Colocar algum valor em uma caixa (Boxing) e tirar da caixa (Unboxing) e essa caixa e a ClasseWrapper, ou seja,
		//Podemos colocar e tirar algum valor da ClasseWrapper.
		
		//Boxing na pratica...
		
		@SuppressWarnings("removal")
		Integer integer = new Integer("9"); //Esse e o boxing, mas ele ja ta muito antigo e nao precisamos escrever assim
		//O java faz isso automaticamente para nos
		
		//Autoboxing
		
		Integer integer2 = 9;
		
		//Ou seja, o java transforma automaticamente um valor primitivo em uma ClasseWrapper pra gente
		
		//Tambem podemos fazer isso...
		
		intWrapper = intNormal; //Ele esta fazendo isso: intWrapper = new Integer(intNormal);
		//Tudo automatico e muito mais facil de entender
		
		//Unboxing...
		//Automatico
		
		//Mesma coisa com a syntax inversa...
		intNormal = intWrapper; //Ele esta fazendo isso: intNormal = intWrapper.intValue();
		
		
		
		//Metodos...
		
		//Podemos tranformar uma string em um valor primitivo ou em um valor de uma classe
		String test = "145";
		
		//Metodo para transformar em primitivo
		
		intNormal = Integer.parseInt(test);
		
		//Metodo para tranformar em um valor de classe
		
		intWrapper = Integer.valueOf(test);
		
		//Podemos usar o parseInt no exemplo acima? Sim, e recomendavel? Nao sei, o que eu vi e que o parse e mais
		//Rapido do que o valueOf, entao em minha humilde opiniao, quando der pra usar o parse, use.
		//MAS tem alguns casos que nao da para usar o parse, porque ele nao funciona com ClassesWrappers, nem com
		//Tipos primitivos como parametros, apenas com String.
		
		String a = "topa";
		charNormal = Character.valueOf(a.charAt(3));
		System.out.println(Character.toUpperCase(charWrapper));
		System.out.println(a.toUpperCase());
		
		//O String ja e uma classe wrapper, nao existe um String primitivo, por isso ele tem diversos metodos interessantes

		//Podemos converter assim tambem...
		
		intWrapper = Integer.valueOf("100000");
		System.out.println(intNormal + 5);
		
		//Como eu expliquei no exemplo acima, o parse so funciona com string, nao funciona com tipos primitivos e
		//ClassesWrappers como parametros.
		
		//doubleWrapper = Double.parseDouble(doubleNormal);
		System.out.println(doubleWrapper);
		
		//O valueOf funciona com String, tipos primitivos e ClassesWrappers, mas eu vi que ele e mais pesado doque o parse
		
		doubleWrapper = Double.valueOf(doubleNormal);
		System.out.println(doubleWrapper);
		
		//Metodos adicionais...
		
		System.out.println("Testes...");
		//Obs.: Aspas Simples
		System.out.println(Character.isDigit('A'));
		System.out.println(Character.isDigit('7'));
		System.out.println(Character.isLetter('A'));
		System.out.println(Character.isLetter('2'));
		System.out.println(Character.isLetterOrDigit('1'));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isLowerCase('A'));
		
		//E temos muito mais metodos que as ClassesWrappers nos proporciona
		
		//Ah... Entao so vo usar ClassesWrappers. Nao faz isso amigo, elas ocupam muito mais espaco do que um tipo
		//Primitivo, ou seja, so use ClassesWrappers se precisar de algum dos seus metodos.
		
		//Operacoes matematicas com ClassesWrappers.
		
		//Conseguimos fazer de boa, igual com tipo primitivo, so que nao faz sentido usar para operacoes matematicas
		//Porque elas ocupam muito mais espaco.
		
		System.out.println(intWrapper + floatWrapper);
		
		//Obs.: Para fazer um ArrayList de inteiros ou qualquer outro tipo de tipo primitivo, precisamos usar Wrappers :D
		//Obs.2: Nao conseguimos fazer Arrays normais com Wrappers, apenas com tipos primitivos
		}
}