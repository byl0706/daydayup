package design.command;

/**
 * @author baiyunlong
 * @title Event
 * @description 命令设计模式-事件
 * @date 2020/6/28 10:36
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime) {
        this.delayTime = delayTime;

    }

    public void start() {
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean read() {
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
}
