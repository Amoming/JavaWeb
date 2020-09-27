package fumdamantalAdvanced;

import fumdamantalAdvanced.person.person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class fansheMethid {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class personClass = person.class;

        Method eat = personClass.getMethod("eat");
        person p = new person();
        eat.invoke(p);

        Method eat1 = personClass.getMethod("eat", int.class);
        eat1.invoke(p,1);

        Method[] methods = personClass.getMethods();

    }
}
