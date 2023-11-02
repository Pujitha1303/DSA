// ?6.String Concatenation: Take two strings as input and concatenate them without using the + operator.

package strings;
import java.util.*;

public class concatenation {

public String concat(String s1, String s2){
       String s3= s1+s2;
       return s3;
}
// approach-1 
public char[] duplicate(String s){
    char c[]= s.toCharArray();
    char b[]=new char[c.length];
    int rd=0;
    b[rd]=c[0];
    for(int i=1;i<c.length;i++){
        if(b[rd]!=c[i]){
             rd++;
             b[rd]=c[i];
        }
    }
    return b;
}
// approach 2
public int removeduplicate(String s){
    char[] c = s.toCharArray();
    int rd = 1;
    for (int i = 1; i < c.length; i++) {
        if (c[rd] != c[i]) {
            rd++;
            c[rd] = c[i];
        }
    }
    return rd + 1;
}

//approach 3 - using bultin string method
public String RemoveDulpicate(String s ){

    String result="";
    for(int i=0;i<s.length();i++){
           String ch= ""+ s.charAt(i);
             if(result.contains(ch)){
                continue;
             }
             result=result+ch;
    }
   return result;

}


    public static void main(String []args){
    concatenation obj= new concatenation();
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    // String s2=sc.nextLine();
    // String s3=obj.concat(s1, s2);
    char [] c=obj.duplicate(s1);
    int rd=obj.removeduplicate(s1);
    char [] arr=s1.toCharArray();
    for(int i=0;i<rd;i++){
        System.out.println(arr[i]+" these are secound method output");
    }
    System.out.println("*****************");
    for(char i:c){
        System.out.println(i);
    }

    System.out.println("*****************");
    String result=obj.RemoveDulpicate(s1);
    System.out.println(result);
    }
    
    
}
