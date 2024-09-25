public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {1,2,3,4};

        if(equals(a,b)){
            System.out.println("The arrays are equal.");
        }
        else
            System.out.println("The arrays are not equal.");
    }

    public static boolean equals(int[] x, int[] y){
        if (x.length != y.length){
            return false;
        }
        for (int i = 0; i < x.length; i++){
            if (x[i] != y[i]){
                return false;
            }
        }
        return true;
    }
}