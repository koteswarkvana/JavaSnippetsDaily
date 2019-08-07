package com.kvana.javasnippets;

public enum EnumColorSelect {
    // Enum select color With name value
    RED("Red Color"), BLUE("Blue Color"), ORANGE("Orange Color");
    private String colorName;

    EnumColorSelect(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }

    // Overriding the toString() ==> For required way.
    @Override
    public String toString() {
        return "The selected color value is : "+colorName;
    }

    // Here enum only color value with out its name.
    enum EnumOtherColorSelect {
        GREEN, YELLOW, BLACK;
    }
}
