package FileIOStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import Default.ConsolInput;

public class ENcryptAndDecrptyMenuDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File mainFile = new File("D:\\Programming Room\\CDAC_26\\Java_OOPJ\\TestFileio","EncryptMessage"); 
		mainFile.createNewFile();
		int num;
		do {
			System.out.println("1.Ecrypt your message");
			System.out.println("2.Decrypt your message");
			System.out.println("3.Exit");
			num = ConsolInput.getInt();
			switch(num) {
				case 1 ->  encryptMessage(mainFile);
				case 2 ->  decryptMessage(mainFile);
			}
		}while(num != 3 );

	}
	
	public static void encryptMessage(File file) {
		
		
		FileOutputStream outStream = null;
		try {
			outStream = new FileOutputStream(file);
			System.out.println("Please enter your message");
			
			String str = ConsolInput.getString();
			
			String message = encryption(str);
			
			System.out.println(message);
			
			outStream.write(message.getBytes());
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(outStream != null) {
					System.out.println("Your message encrypted successfully..!");
					outStream.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		
		}
	}
	
	
	public static void decryptMessage(File file) {
		FileInputStream inStream = null;
		
		try{
			inStream = new FileInputStream(file);
			
			byte[] arrFile = inStream.readAllBytes();
			
			String decryptMsg = new String(arrFile,StandardCharsets.UTF_8);
			
			String message = decryption(decryptMsg, 5);
			
			System.out.println(message);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(inStream != null) {
					System.out.println("Your message decrypted successfully..! ");
					inStream.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String encryption(String message) {
		
		String encMessage="";
		for(int temp = 0; temp<message.length();temp++ ) {
			
			int codeKey = 5; 
			char ch = message.charAt(temp);
			if(ch >= 'A' && ch <= 'Z') {
				
				ch = (char)(ch + codeKey);
				
				if(ch > 'Z') {
					ch = (char)(ch-26);
				}
			}
			if(ch >= 'a' && ch<= 'z' ) {
				
				ch = (char)(ch+codeKey);
				
				if(ch > 'z') {
					ch = (char)(ch-26);
				}
			}
			encMessage = encMessage + ch;
		}
		return encMessage;
	}
	
	public static String decryption(String message,int codeKey) {
		String decMessage="";
		
		for(int temp=0;temp<message.length();temp++) {
			
			char ch = message.charAt(temp);
			if(ch >= 'A' && ch <= 'Z') {
				ch = (char)(ch - codeKey);
				if(ch < 'A') {
					ch = (char)(ch+26);
				}
			}
			if(ch >= 'a' && ch <= 'z') {
				ch = (char)(ch - codeKey);
				if(ch < 'a') {
					ch = (char)(ch+26);
				}
			}
			
			decMessage = decMessage + ch;
		}
		return decMessage;
	}

}
