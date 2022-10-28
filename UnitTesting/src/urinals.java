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
   static int countUrinals(String s){
        if(isStringValid(s)){
            char []  st=s.toCharArray();
            int count=0;
            for(int i=0;i<st.length;i++){
                if(st[i]=='0'){
                    boolean l =(i==0) || (st[i-1]=='0');
                    boolean r=(i==st.length-1) || (st[i+1]=='0');

                    if(l && r){
                        count++;

                      st[i]='1';

                    }
                }
            }
            return count;
        }
        else{
            return -1;
        }
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
       int  n= countUrinals(s);
        System.out.println(n);
    }
}