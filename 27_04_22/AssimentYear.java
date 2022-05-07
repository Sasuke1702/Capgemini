import java.util.*;
public class AssimentYear{
    public static void main(String args[]){
        int year,jan=31,mar=31,apri=30,may=31,jun=30,july=31,aug=31,sep=30,oct=31,nov=30,dec=31;
        int days=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year :");
        year=sc.nextInt();
        while(year<=2022){
            if(year%4==0){
                days+=jan+mar+apri+may+jun+july+aug+sep+oct+nov+dec+29;
            }else{
                days+=jan+mar+apri+may+jun+july+aug+sep+oct+nov+dec+28;
            }
            year++;
        }
        System.out.println("Days :"+days);
    }
}