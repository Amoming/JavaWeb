package fumdamantalAdvanced;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class testCheck {
    public static void main(String[] args) throws IOException {
        Calculat c = new Calculat();
        Class cClass = c.getClass();

        Method[] methods = cClass.getMethods();

        int num = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));

        for (Method method : methods) {
            if(method.isAnnotationPresent(check.class)){
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    num ++;
                    bw.write(method.getName()+"异常了");
                    bw.newLine();
                    bw.write("异常的名称"+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因"+e.getCause().getMessage());
                }
            }
        }

        bw.write("总共出现"+num+"异常");
        bw.close();
    }
}
