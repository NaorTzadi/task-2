import java.util.Scanner;
import java.util.Random;

    public class question7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the game level");
            System.out.println("1 - easy | 2 - medium | 3 - hard | 4 - random");
            int gameLevel = scanner.nextInt();
            System.out.println("Enter your Guess of  the secret code: ");
            int number = scanner.nextInt();
            int[] secretCode = new int[4];
            int [] guessingNumbers = new int[4];
            initArray(secretCode);
            assignNumberToArray(secretCode);
            //assignInputToArray(number, guessingNumbers);
            itIsValidCode(guessingNumbers);
            for (int i = 0; i < secretCode.length; i++)
                System.out.print(secretCode[i]);
        }

        public static void initArray(int[] secretCode) {
            for (int i = 0; i < secretCode.length; i++) {
                secretCode[i] = -1;
            }
            return;
        }

        public static int generateRandNumber() {
            Random random = new Random();
            int randomNumber = random.nextInt(6) + 1;
            // System.out.print(randomNumber + "");
            return randomNumber;

        }

        public static void assignNumberToArray(int[] secretCode) {
            int randNum;
            for (int i = 0; i < secretCode.length; i++) {
                randNum = generateRandNumber();
                secretCode[i] = randNum;
                boolean isTwice = checkDuplicateNumber(secretCode, i, randNum);
                while (isTwice == true) {
                    randNum = generateRandNumber();
                    secretCode[i] = randNum;
                    isTwice = checkDuplicateNumber(secretCode,i, randNum);
                }
            }
        }

        public static boolean checkDuplicateNumber(int[] secretCode, int i, int randNum) {
            for (int j = 0; j < i; j++)
                if (secretCode[j] == randNum) {
                    return true;
                }
            return false;
        }

        public static boolean itIsValidCode ( int[] guessingNumbers) {
            for(int i=0; i<guessingNumbers.length -1; i++)
                if(guessingNumbers[i] < 1 || guessingNumbers[i] > 6)
                    return false;
            return true;
        }

        public static int[] numberOfGuessing (int[] secretCode, int[] guessingNumbers){
            int[] numberOfGuessing = new int[2];
            int accurateGuessing =0, partialGuessing = 0;
            for(int i=0; i<secretCode.length -1; i++){
                for(int j=0; j<guessingNumbers.length -1; j++){
                    if(secretCode[i] == guessingNumbers[j])
                        if(i == j)
                            accurateGuessing++;
                        else
                            partialGuessing++;
                }
            }
            numberOfGuessing[0] = accurateGuessing;
            numberOfGuessing[1] = partialGuessing;
            return numberOfGuessing;
        }

    }

