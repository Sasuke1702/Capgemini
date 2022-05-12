public class Question1 {
    static int ArmStrong(int i){
        int n, rem, result=0;
        n = i;
        while(n!=0){
            rem = n%10;
            result += Math.pow((double) rem,3);
            n /= 10;
        }
        if(result==i){
            return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            int x =ArmStrong(i);
            if(x>0){
                System.out.println(i);
            }
        }
    }
}