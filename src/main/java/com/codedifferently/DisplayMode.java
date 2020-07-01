package com.codedifferently;

enum DisplayEnum {
    BINARY, OCTAL, DECIMAL, HEXADECIMAL

}

public class DisplayMode {

    private DisplayEnum displayMode;

    public DisplayMode() {
        super();
        this.displayMode = DisplayEnum.BINARY;
    }

    public void switchDisplayMode() {
        if (this.displayMode == DisplayEnum.BINARY) {
            this.displayMode = DisplayEnum.OCTAL;
        } else if (this.displayMode == DisplayEnum.OCTAL) {
            this.displayMode = DisplayEnum.DECIMAL;
        } else if (this.displayMode == DisplayEnum.DECIMAL) {
            this.displayMode = DisplayEnum.HEXADECIMAL;
        } else if (this.displayMode == DisplayEnum.HEXADECIMAL) {
            this.displayMode = DisplayEnum.BINARY;
        }

    }

    public void switchDisplayMode(String whichMode) {
        if (whichMode.equalsIgnoreCase("binary")) {
            this.displayMode = DisplayEnum.BINARY;
        } else if (whichMode.equalsIgnoreCase("octal")) {
            this.displayMode = DisplayEnum.OCTAL;
        } else if (whichMode.equalsIgnoreCase("decimal")) {
            this.displayMode = DisplayEnum.DECIMAL;
        } else if (whichMode.equalsIgnoreCase("hexadecimal")) {
            this.displayMode = DisplayEnum.HEXADECIMAL;
        }

    }

    public DisplayEnum getMode() {
        return this.displayMode;
    }

}