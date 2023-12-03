public class diagonalSum {
    public static int calculateDiagonalSum(int matrix[][]){
        int sum=0;
        //pd
        for(int i=0; i<matrix.length;i++){
            sum+= matrix[i][i];
            //sd
            if(i!= matrix.length-1-i){
            sum+= matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String srgs[]) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.println(calculateDiagonalSum(matrix));
    }
}
