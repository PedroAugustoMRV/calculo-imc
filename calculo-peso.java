import java.util.Scanner;

//instrução1
//instrução2
//instrução3
//instrução4
//instrução5
//..

class calculoPeso {
	
	
	public static void check(int sexo,double altura,double peso)
	{
		
		if(sexo == 1 )
		{
			String categoriaIMC = "Abaixo do peso";
			double IMC = (peso / (altura * altura)) * 10000 ;
			if (IMC > 18.5 || IMC < 24.9)
			{
			   	categoriaIMC = "Peso normal";
			}
			else if (IMC > 25.0 || IMC < 29.9)
			{
				categoriaIMC = "Sobrepeso";
			}
			else if (IMC > 30.0 || IMC < 34.9)
			{
			    categoriaIMC = "Obesidade Grau I";	
			}
			else if (IMC > 35.0 || IMC < 39.9)
			{
				categoriaIMC = "Obesidade Grau II";
			}
			else
			{
				categoriaIMC = "Obesidade Grau III";
			}
			System.out.printf("O seu  sexo e Feminino e seu IMC e: %.2f e sua categoria e %s\n", IMC, categoriaIMC);
			
			menu();
			System.exit(0);
		}
		if(sexo == 2 )
		{
			String categoriaIMC = "Abaixo do peso";
			double IMC = (peso / (altura * altura)) * 10000 ;
			if (IMC > 18.5 || IMC < 24.9)
			{
			   	categoriaIMC = "Peso normal";
			}
			else if (IMC > 25.0 || IMC < 29.9)
			{
				categoriaIMC = "Sobrepeso";
			}
			else if (IMC > 30.0 || IMC < 34.9)
			{
			    categoriaIMC = "Obesidade Grau I";	
			}
			else if (IMC > 35.0 || IMC < 39.9)
			{
				categoriaIMC = "Obesidade Grau II";
			}
			else
			{
				categoriaIMC = "Obesidade Grau III";
			}
			System.out.printf("O seu  sexo e Maculino e sua categoria e %s\n", IMC, categoriaIMC);
			menu();
			System.exit(0);
		}
		if(sexo == 3)
		{
			System.exit(0);
		}
			System.out.print("GENERO NAO INDENTIFICADO\n");
			menu();
		
		  
	}
	
	public static void menu()
	{
		Scanner ler = new Scanner(System.in);
		
		int sexo;
	
    	double altura;
		double peso;
        
		System.out.println("Digite '1' para Feminino e '2' para masculino OBS: SO A ESSES GENEROS!!!");
		sexo = ler.nextInt();
		
		System.out.println("Digite sua altura em CM sem '.' ou ','");
		altura = ler.nextDouble();
		
		System.out.println("Digite seu peso em CM sem '.' ou ','");
		peso = ler.nextDouble();
		
		
		check(sexo,altura,peso);
		
		
		//System.out.printf("%f", total); 
	
	}
  
	public static void main(String args[])
	{  
    
			menu();

    		System.exit(0);
		
	}

}