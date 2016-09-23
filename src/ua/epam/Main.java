package ua.epam;

import ua.epam.Annotation.Author;
import ua.epam.Class.Book;
import ua.epam.Class.LibraryBook;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Book book = new Book();
        LibraryBook libraryBook = new LibraryBook();

        Class c = libraryBook.getClass();
        String className = libraryBook.getClass().getSimpleName();
        System.out.println("The name of class is " + className);
        System.out.println();

        c =  LibraryBook.class;
        Class[] interfaces = c.getInterfaces();

        System.out.println("The list of implemented interfaces");
        for(Class cInterface : interfaces) {
            System.out.println( cInterface.getName() );
        }
        System.out.println();

        System.out.println("List of parameters");
        c = libraryBook.getClass();
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            Class fieldType = field.getType();

            System.out.print("Name: "+ field.getName()+ "  Type: " + fieldType.getSimpleName() + '\n');
            if(field.isAnnotationPresent(Author.class)) {
                Author annot = field.getAnnotation(Author.class);
                System.out.print("Annotation: " + annot.name());
            }
        }
        System.out.println();
        System.out.println();

        c = libraryBook.getClass();
        Method method = c.getMethod("print");
        method.invoke(libraryBook);
    }
}
