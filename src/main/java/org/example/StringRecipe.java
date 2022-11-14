package org.example;

import java.util.List;

public class StringRecipe {
    private List<StringTransformer> lst;
    public StringRecipe(List<StringTransformer> lst1) {lst = lst1;}

    public void mix(StringDrink drink1){
        int size = lst.size();
        int i = 0;
        while(i < size){
            StringTransformer method = lst.get(i);
            method.execute(drink1);
            i++;

        }
        drink1.setText(drink1.getText());
    }
}
