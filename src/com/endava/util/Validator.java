package com.endava.util;

import com.endava.service.Numbers;
import com.endava.service.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Validator {

    private BufferedReader reader;
    private String string;

    public Validator(){
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String convertToString(){

        for (int i = 0; i < 3; i++) {
            try {
                this.string = reader.readLine();
                i = checkStringError(i);
            } catch (IOException e) {
                Text.ERROR_STRING.getText();
            }
        }

        return string;
    }

    private int checkStringError(int i){
        if (string.length() == Numbers.ZERO.getNumber()){
            Text.EMPTY_STRING.getText();
            i++;
        } else {
            i = Numbers.FIVE.getNumber();
        }
        return i;
    }

    public int convertToNumber(){

        for (int j = 0; j < 3; j++) {
            String numS = convertToString();
            if (checkNumberFormat(numS)) {
                j = Numbers.FIVE.getNumber();
                string = numS;
            }
        }

        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException e){
            return 6;
        }
    }

    private boolean checkNumberFormat(String numS){
        for (int i = 0; i < numS.length(); i++) {
            if (!Character.isDigit(numS.charAt(i))){
                Text.WRONG_NUMBER.getText();
                return false;
            }
        }
        return true;
    }
}

