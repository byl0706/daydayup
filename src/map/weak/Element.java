package map.weak;

import java.util.WeakHashMap;

/**
 * @author baiyunlong
 * @title Element
 * @description TODO
 * @date 2020/7/28 16:39
 */
public class Element {
    private String ident;

    public Element(String id) {
        this.ident = id;
    }

    @Override
    public String toString() {
        return ident;
    }

    @Override
    public int hashCode() {
        return ident.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Element && ident.equals(((Element) obj).ident);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize:" + getClass().getSimpleName() + " " + ident);;
    }

}
