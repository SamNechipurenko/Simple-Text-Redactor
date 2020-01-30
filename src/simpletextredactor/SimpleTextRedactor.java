package simpletextredactor;

import ann.Article;
import ann.Book;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class SimpleTextRedactor {
    
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InterruptedException {
        
        TextHandler mTextObj = new TextHandler ("Some text in the line");
        Class<?> mClass = mTextObj.getClass();
        Method[] mMethods = mClass.getMethods();
        System.out.print("the path of annotation': ");
        Scanner scanner = new Scanner(System.in, "Cp1251"); // ann.Article
        String mAnnotationPath = scanner.nextLine();
        Class classPath = Class.forName(mAnnotationPath);
        
        for (Method method : mMethods){
            if(method.isAnnotationPresent(classPath)){
                Annotation annotation = method.getAnnotation(classPath);
                switch (mAnnotationPath) {
                    case "ann.Book":
                        Book bookAnnotation = (Book) annotation;
                        Thread.sleep(bookAnnotation.deley());
                        System.out.println("deley: " + bookAnnotation.deley());
                        break;
                    case "ann.Article":
                        Article articleAnnotation = (Article) annotation;
                        Thread.sleep(articleAnnotation.deley());
                        System.out.println("deley: " + articleAnnotation.deley());
                        break;
                    default:
                        break;
                }
                method.invoke(mTextObj);
            }
        }
    }
}
