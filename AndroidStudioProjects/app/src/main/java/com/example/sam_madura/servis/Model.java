package com.example.sam_madura.servis;

public class Model {
    String title;
    String desc;
    int icon;
    String nama;
    Integer imgid;

    public Model(String nama, Integer imgid) {
        this.nama= nama;
        this.imgid=imgid;
    }

    //constructor
    public Model(String title, String desc, int icon) {
        this.title = title;
        this.desc = desc;
        this.icon = icon;
    }



    //getters
    public String getNama() {
        return this.nama;
    }

    public int getimgid() {
        return this.imgid;
    }


    public String getTitle() {
        return this.title;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getIcon() {
        return this.icon;
    }
}
