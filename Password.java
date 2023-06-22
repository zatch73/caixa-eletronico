import java.util.List;
import java.util.Random;
public abstract class Password {
    private static Random random = new Random();
    public static String generatePassword(int lengthPS, List<String> options){
        String password = "";
        int j;
        for(int i = 0; i <= lengthPS; i++){
            if(options.size() > 2){
                j = random.nextInt(4);
            }else {
                j = random.nextInt(2);
            }
            switch(j){
                case 0:
                if(hasTheOption(options.get(j))){
                    password += hasTheCharacterSpecial();
                }else {
                    i--;
                }
                break;
                case 1:
                if(hasTheOption(options.get(j))){
                    password += random.nextInt(0, 10);
                }else {
                    i--;
                }
                break;
                case 2:
                if(hasTheOption(options.get(j))){
                    password += hasTheCharacter(97, 123);
                }else {
                    i--;
                }
                break;
                case 3:
                if(hasTheOption(options.get(j))){
                    password += hasTheCharacter(65, 91);
                }else {
                    i--;
                }
                break;
            }            
        }
        return password;
    }

    public static boolean hasTheOption(String option){
        if(option.equals("y")){
            return true;
        }
        return false;
    }

    public static char hasTheCharacter(int start, int end){
        return (char) random.nextInt(start, end);
    }

    public static char hasTheCharacterSpecial(){
        int[] numbers = {
            65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, // Letras maiúsculas
            97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, // Letras minúsculas
            64, 35, 36, 37, 38, 42, 33, 63, 43, 45
        };
        return (char) numbers[random.nextInt(numbers.length)];
    }
    
}
