package resources;
//this program will print each character of string
public class eachcharacterinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  sourcestr = "This is test string";
			
		char [] chararr =new char [sourcestr.length()];
		for(int i=0; i<sourcestr.length(); i++)
		{
			chararr [i] = sourcestr.charAt(i);
			System.out.println(chararr [i]);
		}
		}
	

}
