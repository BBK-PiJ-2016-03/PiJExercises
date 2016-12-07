public class ArrayChecker{

    public static void main(String[] args){
        ArrayChecker ac = new ArrayChecker();
        int[] arr = new int[]{1,2,2,1};
        System.out.println("Symmetrical (true): " + ac.isSymetrical(arr));

        int[] arr2 = new int[]{1,2,3,2,1};
        System.out.println("Symmetrical (true): " + ac.isSymetrical(arr2));

        int[] arr3 = new int[]{1,1,2,3,4,5,4,3,2,1};
        System.out.println("Symmetrical (false): " + ac.isSymetrical(arr3));

        int[] arr4 = new int[]{1,1,2,3,4,5,4,3,2};
        System.out.println("Symmetrical (false): " + ac.isSymetrical(arr4));

        int[] arr5 = new int[]{1, 2, 3, 4, 5};
        System.out.print("Symmetrical (5,4,3,2,1): ");
        for(int number : ac.reverse(arr5)){        
            System.out.print(number+",");
        }
        System.out.println();

        int[] arr6 = new int[]{};
        System.out.print("Symmetrical (): ");
        for(int number : ac.reverse(arr6)){        
            System.out.print(number+",");
        }
        System.out.println();

        int[] arr7 = new int[]{1};
        System.out.print("Symmetrical (1): ");
        for(int number : ac.reverse(arr7)){        
            System.out.print(number+",");
        }
    }

    private boolean isSymetrical(int[] arr){   
        boolean symmetric = true;
        int midPoint = (arr.length - 1) / 2;

        for(int i = 0; i <= midPoint; i++){
            symmetric = checkSymmetric(arr, i);
            if(!symmetric)
                break;
        }

        return symmetric;
    }

    private boolean checkSymmetric(int[] arr, int index){
        if(arr[index] == arr[arr.length - 1 - index]){
            return true;
        }
        return false;
    }

    private int[] reverse(int[] forward){
        int[] reversed = new int[forward.length];

        for(int i = 0; i < reversed.length; i++){
            reversed[i] = forward[forward.length - 1 - i];
        }

        return reversed;
    }
}