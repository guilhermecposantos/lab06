package org.example;

public class StringReplacer implements StringTransformer {
    private char char1;
    private char char2;

    public StringReplacer(char a,char b){
        char1 = a;
        char2 = b;
    }

    public void execute(StringDrink drink) {
        String str = drink.getText();
        String str1 = "";
        for (int i = 0; i< str.length(); i++){
            if(char1 == str.charAt(i)) str1 += char2;
            else str1 += str.charAt(i);
        }
        drink.setText(str1);
    }

    public void undo(StringDrink drink1) {
        String str = drink1.getText();
        String str1 = "";
        for (int i = 0; i< str.length(); i++){
            if(char2 == str.charAt(i)) str1 += char1;
            else str1 += str.charAt(i);
        }
        drink1.setText(str1);
    }
}
