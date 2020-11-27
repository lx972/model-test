package cn.lx.adaptor.v1;

/**
 * cn.lx.adaptor
 *
 * @Author Administrator
 * @date 12:16
 */
public class Main {
    public static void main(String[] args) {
        phone phone = new phone();
        //适配器将220v转化为5v
        VoltageAdapter voltageAdapter = new VoltageAdapter(new Voltage220v());
        phone.charge(voltageAdapter);
    }
}
