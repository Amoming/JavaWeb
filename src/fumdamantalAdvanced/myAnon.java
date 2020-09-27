package fumdamantalAdvanced;

public @interface myAnon {
    int show1();
    String show2() default "zhangsan";
    //enum
    Person per();

    String[] strs();
}
