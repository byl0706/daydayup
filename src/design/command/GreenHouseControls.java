package design.command;

/**
 * @author baiyunlong
 * @title GreenHouseControls
 * @description 命令设计模式-绿色住宅的控制中心
 * @date 2020/6/28 10:48
 */
public class GreenHouseControls extends Controller {
    /** 灯光开关标识 */
    private boolean light = false;

    /**
     * @title LightOn
     * @description 开灯
     * @author baiyunlong
     * @date 2020/6/28 10:53
     **/
    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "Light is on";
        }
    }

    /**
     * @title LightOff
     * @description 关灯
     * @author baiyunlong
     * @date 2020/6/28 10:53
     **/
    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "Light is off";
        }
    }

    private boolean water = false;

    /**
     * @title WaterOn
     * @description 开始操作
     * @author baiyunlong
     * @date 2020/6/28 11:03
     **/
    public class WaterOn extends  Event {
        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "Water is on";
        }
    }

    /**
     * @title WaterOff
     * @description 关水操作
     * @author baiyunlong
     * @date 2020/6/28 11:03
     **/
    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;
        }

        @Override
        public String toString() {
            return "Water if off";
        }
    }

    private String thermostat = "Day";

    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Night";
        }

        @Override
        public String toString() {
            return "Thermostat on night setting";
        }
    }

    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Day";
        }

        @Override
        public String toString() {
            return "Thermostat on Day setting";
        }
    }

    public class Bell extends Event {
        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "Bing";
        }
    }

    public class Restart extends Event {
        private Event[] eventList;

        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event event : eventList) {
                addEvent(event);
            }
        }

        @Override
        public void action() {
            for (Event e : eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        @Override
        public String toString() {
            return "Restarting System";
        }
    }

    public static class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Terminate";
        }
    }
}
