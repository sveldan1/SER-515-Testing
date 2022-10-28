import java.util.*;
import java.io.*;

//AUTHOR: SOWMYA VELDANDI
public class urinals {
    public static boolean isStringValid(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='1' && s.charAt(i+1)=='1'){
                return false;
            }


        }
        return true;
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