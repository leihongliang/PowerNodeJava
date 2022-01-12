package annotation;

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