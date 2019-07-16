package com.kvana.javasnippets;

//https://www.javatpoint.com/difference-between-stringbuffer-and-stringbuilder
public class StringBufferStringBuilder {
    public static void main(String[] args) {
        // String immutable.
        String str = "hello java";
        // Changing the object
        str += " welcome";
        System.out.println("str >> " + str + " ok "); // Here adding ot to string not adding or concatinating to original object
        System.out.println("str >> " + str);
        // StringBuffer & StringBuilder Muttable
        // StringBuffer is synchronized i.e. Thread safe. It means two threads can't call methods StringBuffer simultaneously.
        StringBuffer stringBuffer = new StringBuffer("hello");
        stringBuffer.append(" java");

        // Changing the State. The append, insert, delete ... can change in System.out.println() it can change state, but in string doesnot.
        // Similarly in StringBuilder
        stringBuffer.append(" ok");
        System.out.println("stringBuffer >> " + stringBuffer.append(" welcome")); // Here adding welcome to string buffer appending to original object
        System.out.println("stringBuffer >> " + stringBuffer);
        // Replace
        stringBuffer.replace(0,5,"core");
        System.out.println("stringBuffer replace >> " + stringBuffer);
        // Insert
        stringBuffer.insert(9, " adding");
        System.out.println("stringBuffer insert >> " + stringBuffer);
        // Delete
        stringBuffer.delete(10, 12);
        System.out.println("stringBuffer delete >> " + stringBuffer);
        System.out.println("stringBuffer >> " + stringBuffer);

        // StringBuilder is non-synchronized i.e. Not Thread safe. It means two threads can call methods StringBuilder simultaneously.
        StringBuilder stringBuilder = new StringBuilder("hello");
        stringBuilder.append(" java");
        System.out.println("stringBuilder >> " + stringBuilder.append(" welcome")); // Here adding welcome to string buffer appending to original object
        System.out.println("stringBuilder >> " + stringBuilder);
    }
}
