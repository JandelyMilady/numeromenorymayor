import java.util.Scanner;


public class numeromenor {

	static int mayoromenor(int num1, int num2)
		{
    	  if (num1<num2)
    	{
    	 System.out.print("El numero menor es: ");
    		return num1;	
    		
    	  } 
    	  else if (num2<num1)
    	  {
    	 System.out.print("El numero mayor es: ");
    		  return num1;
    		  
    	  }
    	  else
    	  {
    	 System.out.print("Los numeros son = : ");
    		  return 0;
    	  }
} 
			  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese Primer Numero: ");
		int num1=s.nextInt();
		System.out.println("Ingrese Segundo Numero: ");
		int num2=s.nextInt();
		System.out.println(mayoromenor(num1,num2));
	}

}
