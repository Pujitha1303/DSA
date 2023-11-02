<<<<<<< HEAD
package strings;
// finding if two strings are anagrams 
import java.util.*;
public class anagram{

    public static void main(String []args){
        String s1="listen";
        String s2="silent";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        boolean result=true;
        char c[]=s1.toCharArray();
        char c1[]=s2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        for(int i=0;i<c.length;i++){
            if(c[i]!=c1[i]){
                 result=false;
                break;
            }
        }
        if(result){
            System.out.println("characters are anagrams");
        }
        else{
            System.out.println("characters are not anagrams");
        }

    }

=======
package strings;
// finding if two strings are anagrams 
import java.util.*;
public class anagram{

    public static void main(String []args){
        String s1="listen";
        String s2="silent";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        boolean result=true;
        char c[]=s1.toCharArray();
        char c1[]=s2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        for(int i=0;i<c.length;i++){
            if(c[i]!=c1[i]){
                 result=false;
                break;
            }
        }
        if(result){
            System.out.println("characters are anagrams");
        }
        else{
            System.out.println("characters are not anagrams");
        }

    }

>>>>>>> 9f6a58fa87af45e320a7ea767631df05ab33d66f
}