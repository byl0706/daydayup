package design.example;

/**
 * @author baiyunlong
 * @title WaveForm
 * @description 事例类-波形图
 * @date 2020/6/23 14:26
 */
public class WaveForm {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "WaveForm" + id;
    }
}
