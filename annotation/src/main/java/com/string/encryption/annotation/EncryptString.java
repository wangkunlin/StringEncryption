package com.string.encryption.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * On 2021-07-13
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)
public @interface EncryptString {

    /**
     * @return 需要加密的字符串
     */
    String value();

    /**
     * @return 是否 不解密
     */
    boolean noDecrypt() default false;

    /**
     * @return 单独指定密码，如果为空则使用 顶级密码
     */
    String passwd() default "";
}
