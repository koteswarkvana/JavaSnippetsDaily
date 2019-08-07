package com.kvana.javasnippets;

public class UsingEnumRealtime {
    public static void main(String[] args) {

        EnumColorSelect enumColorSelect = EnumColorSelect.BLUE;
        System.out.println();
        // Print overrided toString()
        System.out.println("The actual selected color value is >> "+ EnumColorSelect.BLUE.toString());
        System.out.println("Get enum selected color name is >> " + EnumColorSelect.BLUE.getColorName());
        switch (enumColorSelect) {
            case RED:
                System.out.println("Selected color is >> Red");
                break;
            case BLUE:
                System.out.println("Selected color is >> Blue");
                break;
            case ORANGE:
                System.out.println("Selected color is >> Orange");
                break;
        }
        // Inner class part
        EnumColorSelect.EnumOtherColorSelect enumOtherColorSelect = EnumColorSelect.EnumOtherColorSelect.GREEN;
        System.out.println();
        // using instanceof keyword
        System.out.println(EnumColorSelect.EnumOtherColorSelect.YELLOW instanceof EnumColorSelect.EnumOtherColorSelect);
        System.out.println("Get enum selected color name is >> " + EnumColorSelect.EnumOtherColorSelect.GREEN);
        switch (enumOtherColorSelect) {
            case GREEN:
                System.out.println("Selected color is >> GREEN");
                break;
            case YELLOW:
                System.out.println("Selected color is >> YELLOW");
                break;
            case BLACK:
                System.out.println("Selected color is >> BLACK");
                break;
        }
    }
}
