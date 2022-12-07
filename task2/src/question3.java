public class question3 {
        public static void main(String[] args){
            int array[] = {1,2,3,4,4,5,6,7,7,4,3,8};
            array = duplicatedNumber(array);
            for(int i=0;i< array.length;i++){
                System.out.print(" "+array[i]+",");
            }
        }

        public static int[] duplicatedNumber(int[] array){
            for(int i=0; i< array.length; i++){
                for(int j=i+1; j< array.length; j++){
                    if(array[i]==array[j]){
                        array= removeNumber(array,j);
                    }

                }
            }
            return array;
        }
        public static int[] removeNumber(int[] array, int Index){
            if(Index<0||Index> array.length){
                System.out.println("array Index out of bound");
                return array;
            }
            int result[]= new int[array.length-1];
            for(int i=0; i< result.length; i++){
                if(i<Index){
                    result[i]=array[i];
                }
                else{
                    result[i]= array[i+1];
                }
            }
            return result;
        }
    }

