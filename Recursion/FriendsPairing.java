public class FriendsPairing {
    public static int friendsPair(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        int fnm1= friendsPair(n-1);
        //pair
        int fnm2= friendsPair(n-2);
        int pairingWays= (n-1) * fnm2;
        return fnm1 + pairingWays;
    }
    public static void main(String[] args) {
        System.out.println(friendsPair(3));
    }
}
