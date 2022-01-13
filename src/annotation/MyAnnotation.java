package annotation;

import java.lang.annotation.*;

/**
 * 自定义注解
 */
public @interface MyAnnotation {
    // 属性
    String name();
    int value();
    boolean answer () default true;
}

@interface MyAnnotatio2 {
    // 属性
    String value();
}

// 数组
@interface MyAnnotatio3 {
    String[] email();
}

// 只可以标注类和方法
@Target({ElementType.TYPE, ElementType.METHOD})
// 这个注解可以被反射
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation4 {
    String username();
    String password();
}