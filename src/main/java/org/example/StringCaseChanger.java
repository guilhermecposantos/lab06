package org.example;

import java.lang.reflect.Field;

public class StringCaseChanger implements StringTransformer{

    public void execute(StringDrink drink) {
        String str = drink.getText();
        String str1 = "";

        for (int i = 0; i< str.length();i++){
            if (Character.isLowerCase(str.charAt(i))==true){
                str1 += Character.toUpperCase(str.charAt(i));
            }
            else str1 += Character.toLowerCase(str.charAt(i));
        }
        drink.setText(str1);
    }


    public void undo(StringDrink drink1) {
        String str = drink1.getText();
        String str1 = "";

        for ( int i = 0; i< str.length();i++){
            if (Character.isLowerCase(str.charAt(i))==true){
                str1 += Character.toUpperCase(str.charAt(i));
            }
            else str1 += Character.toLowerCase(str.charAt(i));
        }
        drink1.setText(str1);
    }
}
