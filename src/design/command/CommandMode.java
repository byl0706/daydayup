package design.command;

/**
 * @author baiyunlong
 * @title CommandMode
 * @description 命令设计模式
 * @date 2020/6/28 10:35
 */
public class CommandMode {
    public static void main(String[] args) {
        GreenHouseControls gc = new GreenHouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1) {
            gc.addEvent(new GreenHouseControls.Terminate(new Integer(args[0])));
        }
        gc.run();
    }
}
