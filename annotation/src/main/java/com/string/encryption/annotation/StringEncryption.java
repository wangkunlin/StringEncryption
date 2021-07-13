package com.string.encryption.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * On 2021-07-13
 */

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface StringEncryption {

    /**
     * @return 指定密码, 如果未指定, 则使用随机密码
     */
    String passwd() default "";

    /**
     * @return 随机密码时，密码的长度最小为6，如果小于6，则在 6-12 中随机一个长度。
     */
    int length() default -1;
}
