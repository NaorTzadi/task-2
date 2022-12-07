import java.util.Scanner;

    public class question2 {
        public static void main(String[] args) {
            System.out.println("please enter your phone number");
            Scanner scanner = new Scanner(System.in);
            String phoneNumber;
            phoneNumber = scanner.next();
            while(true) {
                if (formula1(phoneNumber)) {
                    break;
                }
                if (formula2(phoneNumber)) {
                    break;
                }
                if (formula3(phoneNumber)) {
                    break;
                }
            }

        }
        public static boolean formula1(String phoneNumber) {
            phoneNumber = phoneNumber.trim();
            if(phoneNumber.length() == 11 && phoneNumber.startsWith("050-") == true){
                System.out.print(phoneNumber);
                return true;
            }
            return false;
        }

        public static boolean formula2(String phoneNumber) {
            phoneNumber = phoneNumber.trim();
            if (phoneNumber.length() == 10 && phoneNumber.startsWith("050") == true){
                System.out.print(phoneNumber);
                for(int i=4; i<phoneNumber.length(); i++){

                }
                return true;
            }
            return false;
        }

        public static boolean formula3(String phoneNumber) {
            phoneNumber = phoneNumber.trim();
            if (phoneNumber.length() == 12 && phoneNumber.startsWith("97250") == true) {
                System.out.print(phoneNumber);
                return true;
            }
            return false;
        }
    }

