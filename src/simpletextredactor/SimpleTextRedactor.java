package simpletextredactor;

import ann.Article;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class SimpleTextRedactor {
    
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InterruptedException {
        TextHandler mTextObj = new TextHandler ("Some;text;in;the;line");
        Class<?> mClass = mTextObj.getClass();
        Method[] mMethods = mClass.getMethods();
        System.out.print("the path of annotation': ");
        Scanner scanner = new Scanner(System.in, "Cp1251"); // ann.Article
        String mAnnotationPath = scanner.nextLine();
        
        for (Method method : mMethods){
            Class classPath = Class.forName(mAnnotationPath);
            if(method.isAnnotationPresent(classPath)){
                Annotation annotation = method.getAnnotation(classPath);
                if( annotation instanceof ann.Article){
                    ann.Article articleAnnotation = (Article) annotation;
                    Thread.sleep(articleAnnotation.deley());
                    System.out.println("deley: " + articleAnnotation.deley());
                }
                method.invoke(mTextObj);
                
                
            }
            
        }
    }
    
}
