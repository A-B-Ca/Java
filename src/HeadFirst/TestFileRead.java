package HeadFirst;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class TestFileRead {
    public static void main(String[] args){
        TestFileRead test = new TestFileRead();
        test.read();
    }
    public void read(){
        try{
            String s;
            BufferedReader br= new BufferedReader(new FileReader("Text.txt"));
            while((s=br.readLine())!=null){
                if(s.contains("red")){
                    System.out.println("gotvalue "+s);
                }

            }

        }
        catch(IOException ioe){
            ioe.printStackTrace();

        }
    }

}
