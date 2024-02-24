
public class recapDemo1 {

	public static void main(String[] args) {
		
		int number1=20;
		int number2=25;
		int number3=245;
		int bigNumber=0;
	
		
		if(number1>number2&&number1>number3&&bigNumber<number1)
		{
			bigNumber=number1;
			
		}
		else if(bigNumber<number2&&number2>number1&&number2>number3) {
			bigNumber=number2;
					
			
		}
		else if(bigNumber<number3&&number3>number2&&number3>number1) {
			bigNumber=number3;
		}
		
		System.out.println(bigNumber);
		
		
		
		
		
		
		
		

	}

}
