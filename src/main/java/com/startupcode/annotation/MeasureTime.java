package com.startupcode.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//  이 어노테이션은 런타임에도 유지됩니다.
//  이는 JVM이 런타임에 어노테이션을 읽을 수 있음을 의미합니다.
//  이를 통해 런타임에 어노테이션 정보를 처리하는 코드를 작성할 수 있습니다.
@Retention(RetentionPolicy.RUNTIME)

// 이 어노테이션은 메소드에만 적용될 수 있습니다.
// 이는 MeasureTime 어노테이션을 메소드 선언부에만 붙일 수 있음을 의미합니다.
@Target(ElementType.METHOD)
public @interface MeasureTime {
}
