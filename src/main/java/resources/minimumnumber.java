package resources;
//this program will find minimum number in an integer array
public class minimumnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intarray = new int[]{50, 40, 30, 100,1};
			
		int min = intarray[0];
		for (int i=0;i<intarray.length;i++)
		{
			if(intarray[i] < min)
				{
					min = intarray[i];
				}
		}
		
		System.out.println(min);
	}
	

}
