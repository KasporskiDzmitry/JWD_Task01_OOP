package by.tc.task01.entity;

import java.io.Serializable;

public class Oven extends Appliance implements Serializable{
    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public Oven(){}

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public boolean equals(Object obj) {
        if(this == obj) {return true;}
        if(null == obj) {return false;}
        if(getClass() != obj.getClass()) {return false;}

        Oven oven = (Oven)obj;
        if(powerConsumption != oven.powerConsumption) {return false;}
        if(weight != oven.weight) {return false;}
        if(capacity != oven.capacity) {return false;}
        if(depth != oven.depth) {return false;}
        if(height != oven.height) {return false;}
        if(width != oven.width) {return false;}
        return true;
    }

    public int hashCode() {
        return (int)(31*powerConsumption + 31*weight + 31*capacity + 31*depth + 31*height + 31*width);
    }
    public String toString() {
        String object = "Объект: " + this.getClass().getSimpleName();
        String objectInfo = "powerConsumption = " + this.powerConsumption + "\n" +
                "weight = " + this.weight + "\n" +
                "capacity = " + this.capacity + "\n" +
                "depth = " + this.depth + "\n" +
                "height = " + this.height + "\n" +
                "width = " + this.width;
        return object + "\n" + objectInfo;
    }
}
