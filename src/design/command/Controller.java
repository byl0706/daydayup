package design.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baiyunlong
 * @title Controller
 * @description 命令设计模式-控制类
 * @date 2020/6/28 10:41
 */
public class Controller {
    private List<Event> eventList = new ArrayList<>();
    public void addEvent(Event event) {eventList.add(event);}
    public void run() {
        while(eventList.size() > 0) {
            for (Event event : new ArrayList<>(eventList)) {
                if (event.read()) {
                    System.out.println(event);
                    // 执行
                    event.action();
                    // 执行完之后删除事件
                    eventList.remove(event);
                }
            }
        }
    }
}
