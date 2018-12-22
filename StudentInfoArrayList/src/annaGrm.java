import java.util.Arrays;
import java.util.Scanner;

public class annaGrm {

	public static void main(String[] args) {
Scanner input=new Scanner (System.in);

boolean found=true; // boolean method to retrun value true or false .

System.out.println("Enter Your First Word:");

String first=input.nextLine().trim().toLowerCase().replace("\\s", ""); // using   pre-defined's java method .

System.out.println("Enter Your Second Word:");

String second=input.nextLine().trim().toLowerCase().replace("\\s", "");

if(first.length()!=second.length()){ // checking both string's length
	found=false; // retrun true or false 
}

else{
char[] x=first.toCharArray();// Converting String to char Array  using a toCharArray method.(first string)
char [] y=second.toCharArray();//Converting String to char Array  using a toCharArray method.(second string)

Arrays.sort(x); //sort method to Array sort 
Arrays.sort(y);

found=Arrays.equals(x, y); // if char  Array x and y is equal each other then  found is true .
}
if(found)// if found true then 
{
System.out.println("Yes Anagrame !! ");	
}
else 
{
	System.out.println("Sorry not a Anagrame!!");
}
	}

}
