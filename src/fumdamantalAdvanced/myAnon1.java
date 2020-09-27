package fumdamantalAdvanced;

import javax.xml.transform.Source;
import java.lang.annotation.*;

@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})//表示只能作用于类上 Method方法 Field成员变量上
@Retention(RetentionPolicy.RUNTIME)//一般取这个值
@Documented
@Inherited//会被子类继承
public @interface myAnon1 {
}
