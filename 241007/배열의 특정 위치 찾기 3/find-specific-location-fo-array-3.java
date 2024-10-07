import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc=new Scanner(System.in);
        int [] array=new int[100];
        int sum=0;
        
        for(int i=0;i<100;i++){
            array[i]=sc.nextInt();
            if(array[i]==0&&i>=3){
                sum+=array[i-1]+array[i-2]+array[i-3];
                break;
            }
        }

        System.out.println(sum);
    }
}