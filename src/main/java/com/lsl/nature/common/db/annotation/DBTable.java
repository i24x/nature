package com.lsl.nature.common.db.annotation;

import java.lang.annotation.*;

/**
 * 用于标注数据库表的注解
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DBTable {

    /**
     * 数据表名称注解，默认值为类名称
     * @return
     */
    String value() default "";
}