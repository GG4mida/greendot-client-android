package com.greendot.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kangt on 2017/11/8.
 */

public class Result {

    @SerializedName("code")
    private int code;

    @SerializedName("content")
    public String content;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
