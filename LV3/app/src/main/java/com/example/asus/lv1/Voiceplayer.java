package com.example.asus.lv1;

/**
 * Created by asus on 2015/12/11.
 */
public class Voiceplayer {
    private String[] chr;
    private String name,Name,sex;
    private int imageId;
    public  Voiceplayer(String name,int imageId,String sex,String[] chr)
    {
        this.sex=sex;
        this.chr=chr;
        this.name=name;
        this.imageId=imageId;
    }
    public  String getName()
    {
        return name;
    }
    public  int getImageId()
    {
        return imageId;
    }
    public String getSex()
    {
        return sex;
    }
    public String[] getChr()
    {
        return chr;
    }
}

