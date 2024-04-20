package org.bits.fsad.quiz.util;

public class CollectionNameHolder {
    private static final ThreadLocal<String> collectionNameThreadLocal = new ThreadLocal<>();

    public static String get(){
        String collectionName = collectionNameThreadLocal.get();
        if(collectionName == null){
            collectionName = "defaultCollection"; // Default collection name
            collectionNameThreadLocal.set(collectionName);
        }
        return collectionName;
    }

    public static void set(String collectionName){
        collectionNameThreadLocal.set(collectionName);
    }

    public static void reset(){
        collectionNameThreadLocal.remove();
    }
}