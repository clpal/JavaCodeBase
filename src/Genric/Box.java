package Genric;

import java.util.Objects;

public class Box <K> {
    private  K content;

    public  Box(K content){
        this.content=content;
    }
    public K getContent() {
        return content;
    }

 public  void setContent(K content) {

        this.content = content;
    }

    public void displayContent() {
        System.out.println("Content type: " + content.getClass().getName());
        System.out.println("Content value: " + content);
    }


}
