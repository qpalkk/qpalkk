package 作业;

import java.util.Scanner;

public class Yunxing {
    public static void main(String[] args) {
        System.out.println("欢迎使用小罗航天快递");
        Scanner scanner = new Scanner(System.in);

        Locker l = new Locker();
        String Company;
        int Danhao;
        String Numbers;

        main:while (true){
            System.out.println("客户您好 请根据提示，选择服务序号：\n\t1.快递录入\n\t2.查看快递\n\t3.快递取出\n\t4.退出程序");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("请输入您选择的快递公司：");
                    Company = scanner.next();


                    System.out.println("请输入您的快递单号：");
                    Danhao = scanner.nextInt();

                    System.out.println("请输入收件人的手机号：");
                    Numbers = scanner.next();

                   Bao parcel = new Bao(Company,Danhao,Numbers, getCode());//根据输入的信息和取件码，构造对象
                    l.saveBao(parcel);//将存包裹存到快递柜里
                    break;
                case 2:
                    System.out.println("请输入您的快递单号查询：");
                    System.out.println(l.query(scanner.nextInt()));
                    break;
                case 3:
                    boolean bring = false;
                    while ( ! bring) {
                        System.out.println("请输入您的六位数字取件码：");
                        String BaoCode = scanner.next();
                        if (BaoCode.equals("0")) {
                            break;
                        }
                        if (BaoCode.length() == 6) {
                            Bao b = l.takeBao(BaoCode);
                            if (b != null) {
                                System.out.println(b.getCode() + "您的包裹已取出");
                                bring = true;
                            } else {
                                System.out.println("包裹不存在，请输入取件码：（0退出）");
                            }
                        } else {
                            System.out.println("取件码错误！请输入正确的取件码：（0退出）");
                        }
                    }
                    break;
                case 4:
                    break main;
            }
        }
    }

    private static String getCode(){
        Integer randNum = (int)(Math.random()* (999999)+1);//产生6位数的随机数
        String code = String.format("%06d",randNum);//进行六位数的补全
        return code;
    }
}