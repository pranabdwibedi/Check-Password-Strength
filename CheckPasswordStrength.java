import java.util.Scanner;
public class CheckPasswordStrength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Password : ");
        String Password = input.next();
        int symbols = 0, LowerCase = 0, UpperCase = 0, Numbers = 0;
        for(int i = 0;i < Password.length();i++){
            int checkChar = (int) Password.charAt(i);
            if((33 <= checkChar && checkChar <= 47) || (58 <= checkChar && checkChar <= 64) || (91 <= checkChar && checkChar <= 96) || (123 <= checkChar && checkChar <= 126))
                symbols++;
            else if(48 <= checkChar && checkChar <= 57)
                Numbers++;
            else if(65 <= checkChar && checkChar <= 90)
                UpperCase++;
            else if(97 <= checkChar && checkChar <= 122)
                LowerCase++;
        }
        String Status = new String();
        if(Password.length() < 12 || LowerCase == 0 || UpperCase == 0 || symbols == 0 || Numbers == 0)
            Status = "WEAK";
        else if(Password.length() < 14)
            Status = "GOOD";
        else
            Status = "STRONG";
        System.out.println(Status);
    }
}
