package CompareLambda;

import java.util.ArrayList;
import java.util.Collections;

public class Colors{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>color = new ArrayList<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Green");
		color.add("Blue");
		color.add("Orange");
		
		
		
		Collections.sort(color);
		
		System.out.println("Nature Sorting order :"+color);
		
		Collections.sort(color,(color1,color2)-> color2.compareTo(color1));
//		{
			
//			if(color1.compareTo(color2)>0) {
//				return -1;
//			}else if(color1.compareTo(color2)<0) {
//				return 1;
//			}else {
//				return 0;
//			}
			
//		});
		System.out.println("Customise sorting order : "+color);
		
		ArrayList<Integer>number = new ArrayList<Integer>();
		number.add(2);
		number.add(5);
		number.add(8);
		number.add(3);
		number.add(1);
		
		
		
		Collections.sort(number);
		
		System.out.println("Nature Sorting order :"+number);
		
		Collections.sort(number,(num1,num2)->
			
			Integer.compare(num2, num1));
			
		System.out.println("Customise sorting order : "+number);
		
	}

	

}
