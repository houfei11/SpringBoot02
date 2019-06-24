package Test;

import java.util.Scanner;

/**
 * 加减乘除计算器
 */
public class practiceTest {

    public static int Clac(int a, int b, String operator) throws Exception {
        if (operator.equals("+")){
            return a + b;
        }
        if (operator.equals("-")){
            return a - b;
        }
        if (operator.equals("*")){
            return a * b;
        }
        if (operator.equals("/")){
            return a / b;
        }
        throw new Exception("wrong operator");
    }

    public static void main(String[] args) throws Exception {

        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入数字");
            int a = scanner.nextInt();
            System.out.println("请输入数字");
            int b = scanner.nextInt();
            System.out.println("请输入运算符");
            String operator = scanner.next();
            int clac = Clac(a, b, operator);
            System.out.println("计算结果为：" + clac);
            System.out.println("是否退出？yes/no");
            String over = scanner.next();
            if (over.equals("yes")){
                break;
            }
            if (over.equals("no")){
                continue;
            }else {
                throw new Exception("wrong");
            }
        }
    }
}
