package Default;

public class ConsolInput {
	
	public static int getInt() {
		String objeString = getString();
		
		int num = Integer.parseInt(objeString);
		
		return num;
	}
	
	public static String getString() {
		
		try {
			byte[]arrInput = new byte[100];
			
			int length = System.in.read(arrInput);
			
			byte []arrfinal = new byte[length-2];
			
			System.arraycopy(arrInput, 0, arrfinal, 0, length-2);
			
			String objeString = new String(arrfinal);
			
			return objeString;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
