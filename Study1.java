package Java;
//遇到7过
//分析：个位7 十位7 7的倍数
//打印1——100的数字 开始1 结束100
public class Study1 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%10==7||i/10%10==7||i%7==0){
                System.out.println("Guo");
                continue;
            }
            System.out.println(i);
        }
    }
}