public class question4 {
        public static void main(String[]args){
            int []array ={1,3,5,3,2,1};
            int index;
            index = negativeParabola(array);
            System.out.println(index);

        }
        public static int negativeParabola(int []array) {
            int maxNumber = 0;
            if(array.length == 0){
                maxNumber =-1;
            }
            else {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] > array[maxNumber]) {
                        maxNumber = i;
                    }
                }
                for (int i = 0; i < maxNumber; i++) {
                    if (array[i] > array[i + 1]) {
                        maxNumber = -1;
                    }
                }
                for (int i = maxNumber + 1; i < array.length - 1; i++) {
                    if (array[i] < array[i + 1]) {
                        maxNumber = -1;
                    }
                }
            }
            return maxNumber;
        }
    }

