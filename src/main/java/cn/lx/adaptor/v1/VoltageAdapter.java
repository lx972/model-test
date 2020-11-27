package cn.lx.adaptor.v1;

/**
 * cn.lx.adaptor
 *
 * @Author Administrator
 * @date 12:10
 */
public class VoltageAdapter implements Input5v {

    private Voltage220v voltage220v;

    public VoltageAdapter(Voltage220v voltage220v) {
        this.voltage220v = voltage220v;
    }

    public int input5v() {
        int original = voltage220v.output220v();
        System.out.println("原电压为："+original+"v");
        int current = original / 44;
        System.out.println("转换后的电压为："+current+"v");
        return current;
    }
}
