package com.example.heels;

public class ChildItems {
    private  int ImageId;
    private String Text;

    public ChildItems(int imageId, String text) {
        ImageId = imageId;
        Text = text;
    }
    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }
    public String getText() {
        return Text;
    }
    public void setText(String text) {
        Text = text;
    }
}
