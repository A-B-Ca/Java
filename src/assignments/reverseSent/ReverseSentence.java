package assignments.reverseSent;


public class ReverseSentence {

    public static void main(String[] args) {
        String s1 = "I am a computer programmer";
        String[] words = s1.split("\\s");
        for (int i=words.length-1;i>=0;i--) {
            System.out.print(words[i]+" ");
        }

    }
}

