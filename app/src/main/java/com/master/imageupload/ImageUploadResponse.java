package com.master.imageupload;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageUploadResponse {
    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("mime")
    @Expose
    private String  mine;

    @SerializedName("id")
    @Expose
    private int id;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMine() {
        return mine;
    }

    public void setMine(String mine) {
        this.mine = mine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

