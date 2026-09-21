package FileIOStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteInputOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File mainfile = new File("D:\\Programming Room\\CDAC_26\\Java_OOPJ\\TestFileio","ReadWriteInputOutputStream.txt");
		mainfile.createNewFile();
		writeFile(mainfile);
		readFile(mainfile);
	}
	
	public static void readFile(File mainfile) {
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(mainfile);
			
			byte[] arrInFile = inputStream.readAllBytes();
			
			System.out.println(new String(arrInFile));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
					if(inputStream != null) {
						inputStream.close();
					}
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	public static void writeFile(File file) {
		FileOutputStream outStream = null;
		
		try {
			outStream = new FileOutputStream(file);
			
			String s = "Hi.. I am Nilesh.";
			outStream.write(s.getBytes());
			System.out.println("System Written");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e ) {
			e.printStackTrace();
		}
		finally {
			try {
				if(outStream != null) {
					outStream.close();
				}
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
