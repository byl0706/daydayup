package design.example;

import design.example.WaveForm;

/**
 * @author baiyunlong
 * @title Filter
 * @description 事例类-波形图过滤类
 * @date 2020/6/23 14:27
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public WaveForm process(WaveForm input) {
        return input;
    }
}
