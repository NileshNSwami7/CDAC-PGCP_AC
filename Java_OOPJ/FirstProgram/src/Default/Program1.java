package Default;

public class Program1 {
	
	public static void main(String arhs[]) {
		
		try {
		byte []arrInput = new byte[100];
		System.out.println("Size of array:"+ arrInput.length);
		System.out.println(arrInput);
		System.out.println("Enter value :");
		int length = System.in.read(arrInput);
		System.out.println("Length:"+length);
		byte []arrFinal = new byte[length-2];
		
		System.arraycopy(arrInput, 0, arrFinal, 0, length-2);
		
		String objString = new String(arrFinal);
		System.out.println(objString);
		int result = Integer.parseInt(objString);
		System.out.println("Data entered is:"+result);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
