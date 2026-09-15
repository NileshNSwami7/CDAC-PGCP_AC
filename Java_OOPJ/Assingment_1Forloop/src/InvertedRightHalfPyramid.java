
public class InvertedRightHalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		for(int row=1;row<5;row++) {
			for(int column=0;column<row;column++) {
				
				if(row<3) 
					System.out.print(count=row +column);
				else 
					System.out.print(count+=1);
				
				

			}
			System.out.println();
		}
	}

}
