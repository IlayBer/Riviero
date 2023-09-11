package org.example;

public class River {
    private String name;
    private int lengthKM;
    private int lengthML;
    private int drainage;

    public River(String name, int lengthhKM, int lengthhML, int drainage){
        this.name = name;
        this.lengthKM = lengthhKM;
        this.lengthML = lengthhML;
        this.drainage = drainage;
    }

    public String getName() {
        return name;
    }

    public int getLengthKM() {
        return lengthKM;
    }

    public int getLengthhML() {
        return lengthML;
    }

    public int getDrainage() {
        return drainage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLengthKM(int lengthKM) {
        this.lengthKM = lengthKM;
    }

    public void setLengthhML(int lengthhML) {
        this.lengthML = lengthhML;
    }

    public void setDrainage(int drainage) {
        this.drainage = drainage;
    }
    public String toString(){
        return "name: "+this.name +", length(km): "+this.lengthKM+", length(miles): "+this.lengthML+", drainage area(km^2): "+this.drainage;
    }
}
