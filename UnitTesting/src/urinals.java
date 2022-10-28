import java.util.*;
import java.io.*;

//AUTHOR: SOWMYA VELDANDI
public class urinals {
    public static  int RULE_NO=0;
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

    static File createFile(){
        String s = "rule"+RULE_NO+".txt";
        if(RULE_NO==0){
            s="rule.txt";
        }
        File file=new File(s);
        while (file.exists()){
            RULE_NO++;
            return createFile();
        }
        return file;
    }

     static boolean writeintoFile(String s, File f){
        try{
        FileWriter writer = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write(s);
        bw.close();
        RULE_NO++;}
        catch (Exception e){
            return false;
        }
        return  true;
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
        System.out.println("Enter 0 if input is given from keyboard or Enter 1 if the input is given from input file");
        int a=Integer.parseInt(sc.nextLine().trim());
        if(a==0){
            System.out.println("Enter string");
        String s= sc.nextLine();
        ///System.out.print("You have entered: "+s);
//        if(isStringValid(s)){System.out.println("valid");}
//        else{
//            System.out.println("not valid");
//        }

       int  n= countUrinals(s);
        System.out.println(n);
    } else if (a==1) {
            StringBuilder ot=new StringBuilder();
            File f = new File("src/urinals.dat");
            FileReader fr =new FileReader(f);
            if(fr==null){
                System.out.println("urinals.dat file is empty");
            }
            BufferedReader br = new BufferedReader(fr);
            String str;
            while ((str=br.readLine())!=null){
                if(isStringValid(str)){
                    int n=countUrinals(str);
                    ot.append(n);
                    ot.append("\n");
                }
                else{
                    ot.append("-1");
                    ot.append("\n");
                }
            }

           System.out.println(writeintoFile(ot.toString(),createFile()));


        }
        else{
            System.out.println("Input is wrong");
        }
    }
}