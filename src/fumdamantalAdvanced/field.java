package fumdamantalAdvanced;

import fumdamantalAdvanced.person.person;

import java.lang.reflect.Field;

public class field {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class cls = person.class;

        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Field field = cls.getField("a");
        person p = new person();
        Object o = field.get(p);
        System.out.println(o);
        field.set(p,"z");

//获取所有的成员变量
        Field[] declaredFields = cls.getDeclaredFields();
        System.out.println(declaredFields);


        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);//暴力反射
        Object o1 = name.get(p);
        System.out.println(o1);
    }
}
