package com.cao.nang.labnodejs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tinh {
    @SerializedName("soa")
             int soa;
    @SerializedName("sob")
            int sob;

    public Tinh(int soa, int sob) {
        this.soa = soa;
        this.sob = sob;
    }

    public int getSoa() {
        return soa;
    }

    public void setSoa(int soa) {
        this.soa = soa;
    }

    public int getSob() {
        return sob;
    }

    public void setSob(int sob) {
        this.sob = sob;
    }
}

