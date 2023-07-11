package activities;

public class Activity2 {
    public static void main(String[] args) {
        int numArray[] = {10,77,10,54,-11,10};
        int sum=0;

        for(int i : numArray){
            if(i==10){
                 sum+=i;
            }
            if(sum>30){
                break;
            }
        }
        if(sum==30){
            System.out.println("sum:"+sum);
        }


    }
}
