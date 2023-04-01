package 作业;

import java.util.ArrayList;
import java.util.Objects;

public class Locker {  //设置快递柜
    ArrayList<Bao> kds = new ArrayList<>();
    public void saveBao(Bao kd){   //存入快递
        if (kds.size()>0) {
            for (int i = 0; i < kds.size(); i++) {
                if (kds.get(i).getDanhao() == kd.getDanhao()) {
                    System.out.println(kd.getDanhao() + "已存在，请重新输入单号");
                    return;
                }
            }
        }
        kds.add(kd);
        System.out.println("快递录入成功，取件码：" + kd.getCode());
    }

    public String query(int courier_number){
        String info = "未查询到快递";
        Bao b = null;
        if (kds.size()>0) {
            for (int i = 0; i < kds.size(); i++) {    //查询失败
                if (kds.get(i).getDanhao() == courier_number) {
                    b = kds.get(i);
                }
            }
        }
        if (b != null) {
            info = " 您要查询的包裹信息：\n" + b.getCompany() + "，单号：" + b.getDanhao() + ",手机号：" + b.getNumbers();
        }
        return info;
    }

    public Bao takeBao(String delivery_code){ //取出快递
        Bao b = null;
        if (kds.size()>0) {
            for (int i = 0; i < kds.size(); i++) {
                if (Objects.equals(kds.get(i).getCode(), delivery_code)) {
                    b = kds.get(i);
                    kds.remove(i);
                    break;
                }
            }
        }
        return b;
    }
}
