package fumdamantalAdvanced;

@AnonTest(className = "fumdamantalAdvanced.demo1",methodName = "show")
public class fanshetest2 {
    public static void main(String[] args) {
        Class<fanshetest2> fanshetest2Class = fanshetest2.class;

        AnonTest an = fanshetest2Class.getAnnotation(AnonTest.class);//获取注解对象

        String className= an.className();


    }
}
