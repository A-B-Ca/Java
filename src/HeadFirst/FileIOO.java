package HeadFirst;
import java.io.*;
import java.util.List;
import java.util.stream.*;

public class FileIOO {
    public static void main(String[] args){
        FileIOO f= new FileIOO();
        File file= new File("Output.txt");

        List<String> color=List.of("red","blue","white","green");
        List<String> l1= color.stream().filter(a->a.contains("red")).collect(Collectors.toList());
        //color.forEach(col-> System.out.println(col));
        System.out.println(l1);
        try {
            f.write();
            file.createNewFile();
            //f.read();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
    public void write()throws IOException {
        List<String> abc= List.of("red","blue","majentha","darkbrown","cyan","violet","gray","green ", " ", "halogen","orange");
        BufferedWriter bf= new BufferedWriter(new FileWriter("Text.txt"));
        bf.write("First Line");
        for(String a:abc)
        bf.write("\n"+a);
        bf.close();
    }
    public void read() throws IOException{
        String s;
        BufferedReader br= new BufferedReader(new FileReader("Text.txt"));

        while((s=br.readLine())!=null){
            if (s=="red"){

                System.out.println(s);
            }
        }
    }
}
