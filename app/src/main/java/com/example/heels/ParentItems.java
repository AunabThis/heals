package com.example.heels;

import java.util.List;

public class ParentItems {

    private String text;
   List<ChildItems>childItemsList;

    public ParentItems(String text, List<ChildItems> childItemsList) {
        this.text = text;
        this.childItemsList = childItemsList;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<ChildItems> getChildItemsList() {
        return childItemsList;
    }

    public void setChildItemsList(List<ChildItems> childItemsList) {
        this.childItemsList = childItemsList;
    }
}
