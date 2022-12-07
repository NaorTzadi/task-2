import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        System.out.println("enter a discriminate equal");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (isLegalEqual(str)){
            int a = extractA(str);
            int b = extractB(str);
            int c = extractC(str);
            resultEqual(a,b,c);
        }
        else
            System.out.println("the input is not legal");
    }
    public static void resultEqual(int a, int b, int c) {
        double denominator, numerator;
        denominator = 2 * a;
        if ((b * b - 4 * a * c) > 0){
            System.out.println("cannot sqrt negative number - no result!!");
            return;
        }
        numerator= Math.sqrt(b*b - (4*a*c));
        b *= -1;
        System.out.println("x1: " + (b + numerator) / denominator);
        System.out.println("x2: " + (b - numerator) / denominator);
    }

    public static boolean isLegalEqual(String str){
        return true;
    }
    public static int extractC (String str){
        String[] stringTmp, a, aNum, bNum;
        stringTmp = str.split("=");
        a = stringTmp[0].split("x");
        int numA;
        if(a[2].indexOf("-") == -1)
            numA = Integer.parseInt(a[2].substring(1,a[2].length()));
        else{
            numA = Integer.parseInt(a[2].split("-")[1]);
            numA *= -1;
        }
        return numA;
    }
    public static int extractB (String str){
        String[] stringTmp, a, aNum, bNum;
        int numA;
        stringTmp = str.split("=");
        a = stringTmp[0].split("x");
        numA = Integer.parseInt(a[1].substring(3,a[1].length()));
        return numA;
    }
    public static int extractA (String str) {
        String[] stringTmp, a, aNum;
        stringTmp = str.split("=");
        a = stringTmp[0].split("^");
        aNum = a[0].split("x");
        int numA;
        if (aNum[0].indexOf("-") == -1)
            numA = Integer.parseInt(aNum[0]);
        else {
            numA = Integer.parseInt(aNum[0].split("-")[1]);
            numA *= -1;
        }
        return numA;
    }
}

