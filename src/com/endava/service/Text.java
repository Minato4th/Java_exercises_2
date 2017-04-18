package com.endava.service;

public enum Text {
    BASE("Please chose what to do :\n"
            + "1. Next Enum from position \n"
            + "2. Previous Enum from position \n"
            + "3. Print all Enums \"Hello from Thread\" \n"
            + "4. Print generated Array \n"
            + "5. Regenerate Array \n"
            + "6. Check of existences of number 1 and 4 \n"
            + "7. Check special condition \n"
            + "8. Count Even in array \n"
            + "9. Exit"),

    FIRST_POSITION("Zero is the first in Enum"),
    WRONG_LENGTH("Wrong length of array"),
    POSITION("From position :"),
    BYE("Good Bye!"),
    INCORRECT("Incorrect command, try again!"),
    EMPTY_STRING("Empty String, please insert data again"),
    ERROR_STRING("Error String format, try again"),
    WRONG_NUMBER("Wrong number format, please try again");

    private String text;

    Text(String text) {
        this.text = text;
    }

    public void getText() {
        System.out.println(text);
    }

}