package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
       Map<String, String> languages = new HashMap<>();
       languages.put("Java","a compiled high level, object-oriented, platform independent language");
       languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
       languages.put("Algol","an algorithmic language");
       languages.put("BASIC","Beginners All Purposes Symbolic Instruction Code");
       languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));
        languages.put("Java","this course is about java");
        System.out.println(languages.get("Java"));
        if (languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }else{
            languages.put("Java","This course is about java");
        }
//        languages.remove("Lisp");
        if (languages.remove("Algol","A family of algorithmic ")){
            System.out.println("Algol removed");
        }else{
            System.out.println("Algol not removed, key/value not found");
        }
        if(languages.replace("Lisp", "This will not work" ,"a functional programming language with imperative features")){
            System.out.println("Lisp replaced");
        }else{
            System.out.println("Lisp was not replaced");
        }
        //System.out.println(languages.replace("Scala", "this will not be added"));
        for (String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
