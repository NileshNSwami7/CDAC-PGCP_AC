package FileIOStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Example implements Serializable{
    private static final long serialVersionUID = 1L; 

	
	private String name;
	private int age;
	private String address;
	
	
	
	 public Example() {
		super();
	}



	 public Example(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}



	 public String getName() {
		return name;
	}



	 public void setName(String name) {
		 this.name = name;
	 }



	 public int getAge() {
		 return age;
	 }



	 public void setAge(int age) {
		 this.age = age;
	 }



	 public String getAddress() {
		 return address;
	 }



	 public void setAddress(String address) {
		 this.address = address;
	 }
	 
	 public String toString() {
		return "Name:"+getName()+" Address:"+getAddress()+ " Age: "+getAge();
		
	 }


	 public static void main(String []argh) throws IOException{
//	        Scanner in = new Scanner(System.in);
//	        int t=in.nextInt();
//	        for(int i=0;i<t;i++){
//	            int a = in.nextInt();
//	            int b = in.nextInt();
//	            int n = in.nextInt();
//	            int result = 1;
//	            int power=1;
//	            int sum=a;
//	           for(int j=0;j<n;j++){
//	        	   sum=sum + b * power;
//	        	  
//	          
//	            System.out.print(sum+" ");
//	            power=power*2;
//	           }
//	           
//	           System.out.println();
//	            
//	            
//	        }
//	        in.close();
//		 
//		 File file = new File("D:\Programming Room\CDAC_26\Java_OOPJ");
//		 System.out.println(file.exists()); // Check the file is available or not if yes return true if not return false.
//		 System.out.println(file.createNewFile()); //Check the file is available or not if yes return false if not it will create new file and return true.
//		 String[] list=file.list();
//		 
//		 for(String s : list) {
//			 System.out.println(s);
//		 }
		 
		 File file = new File("D:\\Programming Room\\CDAC_26\\Java_OOPJ\\TestFileio","textfile.txt");
		 System.out.println(file.exists());
		 System.out.println(file.createNewFile());
		 System.out.println(file.delete());
		 System.out.println(file.mkdir());
		 System.out.println(file.delete());
		 File file1 = new File("D:\\Programming Room\\CDAC_26\\Java_OOPJ\\TestFileio","textfile.txt");
		 System.out.println(file1.createNewFile());
		 
		 Example ex = new Example();
		 ex.setAddress("Nilesh");
		 ex.setAge(20);
		 ex.setAddress("Pune");
		 
//		 FileOutputStream outStream = new FileOutputStream(file1);
		 
		 writeFile(file1,ex);
		 
		 Example example = (Example) Example.readFile(file1);
		 
		 if(example != null) {
			 System.out.println(example);
		 }
	    }
	 
	 public static void writeFile(File filename,Example objRef){
		 try(FileOutputStream out = new FileOutputStream(filename);
				 ObjectOutputStream objOutstream = new ObjectOutputStream(out)){
			 
			 objOutstream.writeObject(objRef);
			 
		 }catch(FileNotFoundException e ) {
			 e.printStackTrace();
		 }catch (IOException e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
	 }
	 
	 public static Object readFile(File file) {
		 try(FileInputStream fileIn = new FileInputStream(file);
				 ObjectInputStream objInStream = new ObjectInputStream(fileIn)){
			 
			 
			 return objInStream.readObject();
		 }
		 catch(FileNotFoundException e) {
			// TODO: handle exception
			 e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		 catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
		 return null;
	 }

}
