package container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author baiyunlong
 * @title ContainerRelated
 * @description 容器相关
 * @date 2020/6/28 19:44
 */
public class ContainerRelated {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Power(), new Crusty(), new Slush());
        // Won't compile -----  java8中该问题已被修复 snow4
        //List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
        // found : java.util.List<Power>
        // required : java.util.List<Snow>
        // 显示类型参数说明------------ 以下
        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3, new Light(), new Heavy());
        List<Snow> snow4 = Arrays.asList(new Light(), new Heavy());
    }
}

class Snow {}
class Power extends Snow {}
class Light extends Power {}
class Heavy extends Power {}
class Crusty extends Snow {}
class Slush extends Snow {}