package hello.java.world.homework;

import hello.java.world.homework.dawn.method.DawnMethod;
import hello.java.world.homework.task.method.TaskMethod;

public class HelloJavaWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        DawnMethod obj1 = new DawnMethod();
        obj1.risingMethod();
        TaskMethod obj2 = new TaskMethod();
        obj2.sinkingMethod();
    }
}
