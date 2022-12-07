import java.util.Random;
import java.util.Scanner;

    public class question5 {
        public static void main(String[] args) {
            Scanner player = new Scanner(System.in);
            char[][] printTheBoard = {{' ',' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}};

            printTheBoard(printTheBoard);

            while (true) {
                getPositionFromUser(printTheBoard, player);
                if(isGameOver(printTheBoard)){
                    break;
                }
                printTheBoard(printTheBoard);

                computer(printTheBoard);
                if(isGameOver(printTheBoard)){
                    break;
                }
                printTheBoard(printTheBoard);
            }

        }
        public static boolean isGameOver(char[][] printTheBoard){
            if(checkWinner(printTheBoard,'X')){
                printTheBoard(printTheBoard);
                System.out.println("PLAYER WON");
                return true;
            }
            if(checkWinner(printTheBoard,'O')){
                printTheBoard(printTheBoard);
                System.out.println("COMPUTER WON");
                return true;
            }
            for (int i = 0; i < printTheBoard.length; i++) {
                for (int j = 0; j <printTheBoard[i].length; j++) {
                    if (printTheBoard[i][j] == ' ') {
                        return false;
                    }
                }
            }
            printTheBoard(printTheBoard);
            System.out.println("TIE");
            return true;
        }



        public static boolean checkWinner(char[][] printTheBoard,char symbol) {
            if((printTheBoard[0][0]==symbol && printTheBoard[0][1]==symbol && printTheBoard[0][2]==symbol)||
                    (printTheBoard[1][0]==symbol && printTheBoard[1][1]==symbol && printTheBoard[1][2]==symbol)||
                    (printTheBoard[2][0]==symbol && printTheBoard[2][1]==symbol && printTheBoard[2][2]==symbol)||

                    (printTheBoard[0][0]==symbol && printTheBoard[1][0]==symbol && printTheBoard[2][0]==symbol)||
                    (printTheBoard[0][1]==symbol && printTheBoard[1][1]==symbol && printTheBoard[2][1]==symbol)||
                    (printTheBoard[0][2]==symbol && printTheBoard[1][2]==symbol && printTheBoard[2][2]==symbol)||

                    (printTheBoard[0][0]==symbol && printTheBoard[1][1]==symbol && printTheBoard[2][2]==symbol)||
                    (printTheBoard[0][2]==symbol && printTheBoard[1][1]==symbol && printTheBoard[2][0]==symbol)){
                return true;
            }
            return false;
        }
        private static int computer(char[][] printTheBoard) {
            Random random = new Random();
            int computer;
            while (true) {
                computer = random.nextInt(9) + 1;
                if(isAvailable(printTheBoard,computer)){
                    break;
                }
            }
            System.out.println("======");
            move(printTheBoard, Integer.toString(computer), 'O');
            return computer;
        }


        public static boolean isAvailable(char[][] printTheBoard, int position){
            switch (position) {
                case 1:
                    return (printTheBoard[0][0] == ' ');
                case 2:
                    return (printTheBoard[0][1] == ' ');
                case 3:
                    return (printTheBoard[0][2] == ' ');
                case 4:
                    return (printTheBoard[1][0] == ' ');
                case 5:
                    return (printTheBoard[1][1] == ' ');
                case 6:
                    return (printTheBoard[1][2] == ' ');
                case 7:
                    return (printTheBoard[2][0] == ' ');
                case 8:
                    return (printTheBoard[2][1] == ' ');
                case 9:
                    return (printTheBoard[2][2] == ' ');
                default:
                    return true; // might need to change to false*
            }
        }
        public static void getPositionFromUser(char[][] printTheBoard, Scanner player) {
            String position;
            while (true) {
                System.out.println("please enter your position (1-9): ");
                position = player.nextLine();
                if (isAvailable(printTheBoard, Integer.parseInt(position))) {
                    break;
                }else{
                    System.out.println(position+" is not a valid move");
                }
            }
            move(printTheBoard, position, 'X');
        }

        public static void move(char[][] printTheBoard, String position, char symbol) {
            switch (position) {
                case "1":
                    printTheBoard[0][0] = symbol;
                    break;
                case "2":
                    printTheBoard[0][1] = symbol;
                    break;
                case "3":
                    printTheBoard[0][2] = symbol;
                    break;
                case "4":
                    printTheBoard[1][0] = symbol;
                    break;
                case "5":
                    printTheBoard[1][1] = symbol;
                    break;
                case "6":
                    printTheBoard[1][2] = symbol;
                    break;
                case "7":
                    printTheBoard[2][0] = symbol;
                    break;
                case "8":
                    printTheBoard[2][1] = symbol;
                    break;
                case "9":
                    printTheBoard[2][2] = symbol;
                    break;
                default:
            }
        }

        private static void printTheBoard(char[][] printTheBoard){
            System.out.println(printTheBoard[0][0] + "|" + printTheBoard[0][1] + "|" + printTheBoard[0][2]);
            System.out.println("-+-+-");
            System.out.println(printTheBoard[1][0] + "|" + printTheBoard[1][1] + "|" + printTheBoard[1][2]);
            System.out.println("-+-+-");
            System.out.println(printTheBoard[2][0] + "|" + printTheBoard[2][1] + "|" + printTheBoard[2][2]);
        }

    }

