package fumdamantalAdvanced;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Properties;

public class fanshetest {
    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
        ClassLoader classLoader = fanshetest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        Class cls = Class.forName(className);
        Constructor constructor = cls.getConstructor();
        Object o = constructor.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);
    }

}
