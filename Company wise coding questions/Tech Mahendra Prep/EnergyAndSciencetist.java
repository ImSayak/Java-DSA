public class EnergyAndSciencetist {
    public static int calculateEnergy(int e,int r,int n){
        int result = e;
        int energySum = e;
        for(int i=1;i<n;i++){
            energySum += r;
            result += energySum;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(calculateEnergy(5, 3, 3));
    }
}
