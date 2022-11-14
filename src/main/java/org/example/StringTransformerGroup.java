package org.example;

import java.util.List;

public class StringTransformerGroup implements StringTransformer {
    private List<StringTransformer> lst1;
    public StringTransformerGroup(List<StringTransformer> transformers){
        lst1 = transformers;
    }
    public void execute(StringDrink d){
        int size = lst1.size();
        int i = 0;
        while(i < size){
            StringTransformer method = lst1.get(i);
            method.execute(d);
            i++;

        }
        d.setText(d.getText());
    }


    public void undo(StringDrink drink1) {

    }
}
