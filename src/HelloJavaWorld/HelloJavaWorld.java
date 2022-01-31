package HelloJavaWorld;

import HelloJavaWorld.dawn.dawn;
import HelloJavaWorld.task.task;

public class HelloJavaWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        dawn obj1 = new dawn();
        obj1.risingMethod();
        task obj2 = new task();
        obj2.sinkingMethod();
    }
}
