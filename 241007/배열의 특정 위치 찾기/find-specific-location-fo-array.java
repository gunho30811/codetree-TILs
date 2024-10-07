import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int sum=0;
        int n=0;
        double avg=0;
        int [] array=new int[10];
        for(int i=0;i<10;i++){
            array[i]=sc.nextInt();
            if((i+1)%2==0){
            sum+=array[i];
            }
            else if((i+1)%3==0){
            avg+=array[i];
            n++;
            }

        }
        avg=avg/n;
        System.out.println(sum+" "+avg);


    }
}