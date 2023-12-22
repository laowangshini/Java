package Java;

import java.util.Scanner;

//键盘录入一个大于等于2的整数x 并计算并返回x的平方根 结果保留整数部分
//分析：从1开始循环 拿着数字的平方根原来的数字作比较
//如果小于继续往后判断
//如果等于就正好为次数的平方根
//如果大于的 那么前一个数字就是平方根的整数部分
public class Study2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number =sc.nextInt();
    for (int i = 1; i<=number; i++) {
        //
        if(i*i==number){
            System.out.println(i+"就是"+number+"平方根");
            //一但找到了，循环就可以停止了，后面的数字就不需要再找了
            break;
        }else if(i*i>number){
            System.out.println((i-1)+"就是"+number+"平方根的整数部分 ");
            break;  
        }
    }
    }
}