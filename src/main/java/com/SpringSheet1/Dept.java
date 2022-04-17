package com.SpringSheet1;

public class Dept {
    private String dName;
    private int dId;

    public Dept() {
    }

    public Dept(String dName, int dId) {
        this.dName = dName;
        this.dId = dId;
    }

    @Override
    public String toString() {
        return dName + "," + dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }
}
