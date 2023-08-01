package OOPs;

import java.io.*;
public class Character_stream {
    public static void main(String[] args) throws IOException{
        FileReader in = null;
        FileWriter out = null;
        try{
            in = new FileReader("C:\\Users\\anura\\IdeaProjects\\my project\\input.txt") ;
            out = new FileWriter("output_1.txt");

            int c ;
            while((c=in.read())!=-1){
                out.write(c);
                System.out.println((char)c+" "+c);
            }
        }finally {
            if (in!=null){
                in.close();

            }
            if(out!=null){
                out.close();
            }
        }
    }
}