import java.util.*;
import java.io.*;
import java.util.HashMap;

class Day8{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> phonebook = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phonebook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phonebook.containsKey(s))
            { int phone=phonebook.get(s);
            System.out.println(s + "=" + phone);
            } else 
                System.out.println("Not found");
            
        }
        in.close();
    }
}
