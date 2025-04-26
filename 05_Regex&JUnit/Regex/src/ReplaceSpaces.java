public class ReplaceSpaces{
    public static void main(String[] args) {
        String text ="This  is an    example with    multiple spaces.";
        System.out.println("Text is : "+text);
        text = text.replaceAll("\\s+"," ") ;
        System.out.println("Text is : "+text);

    }

}




