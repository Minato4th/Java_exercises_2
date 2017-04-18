package com.endava.service;

import com.endava.enums.Cars;
import com.endava.util.ArrayProcessor;
import com.endava.util.Validator;

public class Menu {

    Validator validator;
    ArrayProcessor arrayProcessor;

    public Menu() {
        validator = new Validator();
        arrayProcessor = new ArrayProcessor();
    }

    public void mainMenu() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Text.BASE.getText();
            i = menuChoice(validator.convertToNumber(), i);
        }

        Text.BYE.getText();
    }

    private int menuChoice(int choice, int i) throws InterruptedException {
        if (choice == Numbers.ONE.getNumber()) {
            Text.POSITION.getText();
            Cars.getNext(validator.convertToNumber());
            i--;
        } else if (choice == Numbers.TWO.getNumber()) {
            Cars.getPrevious(validator.convertToNumber());
            i--;
        } else if (choice == Numbers.THREE.getNumber()) {
            Cars.getAll();
            i--;
        } else if (choice == Numbers.FOUR.getNumber()) {
            arrayProcessor.showArrayNumbers();
            i--;
        } else if (choice == Numbers.FIVE.getNumber()) {
            arrayProcessor.generateNewArrayNumbers();
            i--;
        } else if (choice == Numbers.SIX.getNumber()) {
            arrayProcessor.checkNumbers();
            i--;
        } else if (choice == Numbers.SEVEN.getNumber()) {
            System.out.println(arrayProcessor.checkCondition());
            i--;
        } else if (choice == Numbers.EIGHTH.getNumber()) {
            arrayProcessor.countEven();
            i--;
        } else if (choice == Numbers.NINE.getNumber()) {
            i = 5;
        } else if (choice > Numbers.NINE.getNumber()) {
            Text.INCORRECT.getText();
            i++;
        }

        System.out.println();

        return i;
    }

}

