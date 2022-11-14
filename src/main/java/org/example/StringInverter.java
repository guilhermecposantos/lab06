package org.example;


public class StringInverter implements StringTransformer {


    public void execute(StringDrink drink) {
        StringBuilder str = new StringBuilder(drink.getText());

        StringBuilder reverseStr = str.reverse();

        String newtext = reverseStr.toString();
        drink.setText(newtext);

    }
    public void undo(StringDrink drink1){

        StringBuilder str = new StringBuilder(drink1.getText());

        StringBuilder reverseStr = str.reverse();

        String newtext = reverseStr.toString();
        drink1.setText(newtext);
    }

}
