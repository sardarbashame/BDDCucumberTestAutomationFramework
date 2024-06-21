package resources;
//this program will print each character of string
public class extractAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  sourcestr = "Ja@$$@724va*^%##beau^%$#$tiful@!!!$35";
		String  deststr = sourcestr.replaceAll("[^a-zA-Z]+", "");
		System.out.println(deststr);
		
		
	
	}
	

}
