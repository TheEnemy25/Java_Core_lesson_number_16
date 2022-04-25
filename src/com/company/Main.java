package com.company;

import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException {

        Class stud = Students.class;

        String studToString = stud.toString();
        System.out.println(studToString);

        System.out.println();

        String studGetName = stud.getName();
        System.out.println(studGetName);

        System.out.println();

        String toGenericString = stud.toGenericString();
        System.out.println(toGenericString);

        System.out.println();
        System.out.println("Замість інтових значень виводить типи методів:");
        Method[] methods = stud.getDeclaredMethods();
        for (Method method: methods){
            System.out.println(Modifier.toString(method.getModifiers()));
        }
        System.out.println();
        System.out.println("Замість інтових значень виводить типи полів:");
        Field[] fields = stud.getDeclaredFields();
        for(Field field: fields){
            System.out.println(Modifier.toString(field.getModifiers()));
        }
        System.out.println();
        Constructor<Students> constructor = stud.getConstructor(String.class,int.class);
        Students studentsConstructor = constructor.newInstance("Andrian",3);
        System.out.println(studentsConstructor);

        System.out.println();
        System.out.println("3 Завдання");
        Constructor [] methods1 = stud.getDeclaredConstructors();
        for (Constructor method:methods1){
            System.out.println("Назва конструктора: "+method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter:parameters){
                System.out.println("Параметри конструктора: "+parameter.getType());
            }
        }
    }
}
