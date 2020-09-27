package fumdamantalAdvanced;

import fumdamantalAdvanced.person.person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class fansheConstructor {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class personClass = person.class;
        Constructor constructor = personClass.getConstructor(String.class);
        System.out.println(constructor);

        Object person = constructor.newInstance("z");

        Object o = personClass.newInstance();
        System.out.println(o);
        constructor.setAccessible(true);
    }
}
