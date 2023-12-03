public class staircaseSearch {
    public static boolean staircase(int matrix[][], int key) {
        int row=matrix.length-1, col=0;

        while(row>=0 && col<matrix[0].length){
            if(key == matrix[row][col]){
                System.out.println("found key at "+"("+row+","+col+")");
                return true;
            }

            else if(key<matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String srgs[]) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int key=4;
        staircase(matrix, key);
    }
}
