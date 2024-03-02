/*
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.err.println("i-->" + i);
        }
        System.out.println("Hello world!");
    }
}*/

/**
 * 快捷键
 * 格式化代码 ctrl+alt+l
 * 全局搜索 ctrl+shift+r
 * 新建文件 alt+ins
 *
 * 数据类型
 * byte short int long float double char boolean
 * Byte Short Integer Long Float Double varchar Boolean
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("???????????Java");
        System.err.println("???????????Java");
        Student zhang = new Student();
        zhang.speak();

    }
}

class Student {
    void speak() {
        System.out.println("We are student");
    }
}