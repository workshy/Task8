package ua.epam.Annotation;

/**
 * Created by Viktoriia_Marynchak on 9/23/2016.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Target(value= ElementType.FIELD)
@Retention(value= RetentionPolicy.RUNTIME)
public @interface Author {
    String name() default "In this annotation indicates the name of the current reader of the book";
}
