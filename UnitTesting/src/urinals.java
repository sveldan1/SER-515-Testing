import java.util.*;
import java.io.*;

//AUTHOR: SOWMYA VELDANDI
public class urinals {
    public static boolean isStringValid(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='1' && s.charAt(i+1)=='1'){
                return false;
            }
            else if (!(s.charAt(i)=='1') && !(s.charAt(i)=='0')) {
                return false;
            }

        }
        return true;
    }
    int countUrinals(String s){
        System.out.println("Not yet implemented");
        return 0;
    }
    public static void main(String[] args) throws IOException {


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s= sc.nextLine();
        ///System.out.print("You have entered: "+s);
        if(isStringValid(s)){System.out.println("valid");}
        else{
            System.out.println("not valid");
        }

    }
}