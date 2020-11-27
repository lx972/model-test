package cn.lx.abserver.v3;

/**
 * cn.lx.abserver.v3
 *
 * @Author Administrator
 * @date 17:27
 */
public class WakeupEvent {

    long timestamp;
    String loc;

    public WakeupEvent() {
    }

    public WakeupEvent(long timestamp, String loc) {
        this.timestamp = timestamp;
        this.loc = loc;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
