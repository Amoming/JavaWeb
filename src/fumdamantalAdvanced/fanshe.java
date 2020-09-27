package fumdamantalAdvanced;

import fumdamantalAdvanced.person.person;

public class fanshe {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls1 = Class.forName("fumdamantalAdvanced.person.person");
        System.out.println(cls1);

        Class cls2 = person.class;
        System.out.println(cls2);

        person p =new person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

    }


}
