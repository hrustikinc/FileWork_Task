import java.util.*;
import java.io.*;
public class Calculate {
    public static void main(String[] args)  throws IOException, FileNotFoundException {
        File file = null;
        LineNumberReader buff = null;
        FileReader fr = null;
        Stack stack;
        try {
            stack = new Stack(); 
            file = new File("C:\\1.txt");
            fr = new FileReader(file); 
            buff = new LineNumberReader(fr);  
            String s;
            System.out.println("This text is divided into lines:");
            while((s=buff.readLine())!=null) {  
            	    System.out.println("*"+buff.getLineNumber()+"*"+"   "+s);
                    stack.push(s.toString());
            }
        String lines = "";
        BufferedReader fin = null;
        fin = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        while (fin.ready()) {
       		lines += fin.readLine() + '\n';
        }
        fin.close();
        String[] arr = lines.split("[^A-Za-zР-пр-џ+-]+");
        System.out.println("The number of words in the text: "+arr.length);
        System.out.println("The number of characters of text: "+file.length());
        System.out.println("The number of lines of text: "+stack.getSize());
        }
        finally {
            if(fr!=null)
                fr.close();
            if(buff!=null)
                fr.close();
        }
    }
}
class Stack
{
    private ArrayList <String> list = new ArrayList<String>();
    public void push(String lnre) {
        list.add(lnre);
    }        
    public String toString() {
       return list.toString(); 
    }   
    public int getSize() {
        return list.size();
    }                                 
}
