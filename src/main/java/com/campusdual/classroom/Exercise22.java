package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("GKFFD");
        arrayList.add("TNANA");
        arrayList.add("MPMSL");
        arrayList.add("PSWME");
        arrayList.add("LZMLF");
        arrayList.add("JYEBV");
        arrayList.add("YELNT");
        arrayList.add("JSNKR");
        arrayList.add("JFESF");
        arrayList.add("TMJLL");
        return arrayList;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++) {
            System.out.println(customList.get(i));
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        boolean resultado = customList.add(element);
        return resultado;
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<String>(createArrayList());
        boolean resultado = addElementToList(arrayList, "AAAAA");
        printElementsAndIndex(arrayList);
    }


}
