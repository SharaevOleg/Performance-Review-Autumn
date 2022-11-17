package annotation;

import javax.persistence.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class FieldUtils {

     public static boolean isRequiredField(Field f) {
        return ((f.isAnnotationPresent(Column.class)
                && !f.getAnnotation(Column.class).nullable())
                || (f.isAnnotationPresent(JoinColumn.class)
                && !f.getAnnotation(JoinColumn.class).nullable())
                || (f.isAnnotationPresent(Basic.class) && !f.getAnnotation(Basic.class).optional()));
    }

    public static boolean isReadOnlyField(Field f) {
        f.getAnnotation(GeneratedValue.class);
        return ((f.isAnnotationPresent(Id.class) && f.isAnnotationPresent(GeneratedValue.class)));

    }

    public static String FirstLetterCapital(String string) {
        String result = string;
        result = string.toUpperCase().substring(0, 1).concat(string.substring(1));
        return result;

    }

    public static boolean isfieldlibelle(Field f) {
        return (f.isAnnotationPresent((Class<? extends Annotation>) FieldUtils.class)
                || f.getName().startsWith("libelle")
                || f.getName().equalsIgnoreCase("designation")
                || f.getName().equalsIgnoreCase("nom")
                || f.getName().equalsIgnoreCase("reference"));

    }
}
