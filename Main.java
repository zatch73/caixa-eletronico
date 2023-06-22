import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner rd = new Scanner(System.in);
    List<String> options = new ArrayList<String>();
    while(true){
      System.out.println(hasBoldText("Enter the password length", 0));
      System.out.print("Write the length: ");
      int lengthPS = rd.nextInt();

      System.out.println(hasBoldText("It can havea special characters? (y or n)", 0));
      System.out.print("Enter: ");
      options.add(rd.next());

      System.out.println(hasBoldText("It can have numbers? (y or n)", 0));
      System.out.print("Enter: ");
      options.add(rd.next());
      
      System.out.println(hasBoldText("It can have letters? (y or n)", 0));
      System.out.print("Enter: ");
      String letters = rd.next();
      

      if(Password.hasTheOption(letters)){
        
        System.out.println(hasBoldText("It can have lowercase letters? (y or n)", 0));
        System.out.print("Enter: ");
        options.add(rd.next());
        
        System.out.println(hasBoldText("It can have uppercase letters? (y or n)", 0));
        System.out.print("Enter: ");
        options.add(rd.next());
        rd.close();
        System.out.print("This is your password: ");
        System.out.println(Password.generatePassword(lengthPS, options) + "\n");
        break;
      }else {
        rd.close();
        System.out.print("This is your password: ");
        System.out.println(Password.generatePassword(lengthPS, options) + "\n");
        break;
      }
    }
    
  }

public static String hasBoldText(String text, int style) {
    String tagClose = "\u001B[0m";
    switch (style) {
        case 0:
            String white = "\u001B[37m";
            String value = String.format("\u001B[1m%s%s%s", white, text, tagClose);
            return value;
        default:
            return "";
    }
}
}