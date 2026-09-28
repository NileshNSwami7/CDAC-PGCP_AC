package LambdaExpressions;

interface RandomNumber{
	public String generateNumber();
}

public class GenarateRandomNumber {
	
	
	
	public static void main(String[] args) {
		
		
		RandomNumber r = ()->{
			String str="";
			for(int i=0;i<3;i++) {
				int num = (int)(Math.random() * 9) % 10;
				str=str+num;
			}
			return str;
		};
		
		
		
		System.out.println(r.generateNumber());
	}

	
	

}
