public class decimal_to_binary{

    public static void toBinary(int a){
        String res = "";
        while(a>0){
            int binary = a%2;
            res = binary+""+ res;
            a= a/2;
        }
        System.out.println(res);
    }
    public static void main(String args[]){
        toBinary(16);
    }
}