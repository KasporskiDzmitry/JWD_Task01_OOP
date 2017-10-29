package by.tc.task01.entity;

import java.io.Serializable;

public class Refrigerator extends Appliance implements Serializable{
	// you may add your own code here
    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public Refrigerator(){}

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

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
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

        Refrigerator refrigerator = (Refrigerator)obj;
        if(powerConsumption != refrigerator.powerConsumption) {return false;}
        if(weight != refrigerator.weight) {return false;}
        if(freezerCapacity != refrigerator.freezerCapacity) {return false;}
        if(overallCapacity != refrigerator.overallCapacity) {return false;}
        if(height != refrigerator.height) {return false;}
        if(width != refrigerator.width) {return false;}
        return true;
    }

    public int hashCode() {
        return (int)(31*powerConsumption + 31*weight + 31*freezerCapacity + 31*overallCapacity + 31*height + 31*width);
    }

    public String toString() {
        String object = "Объект: " + this.getClass().getSimpleName();
        String objectInfo = "powerConsumption = " + this.powerConsumption + "\n" +
                "weight = " + this.weight + "\n" +
                "freezerCapacity = " + this.freezerCapacity + "\n" +
                "overallCapacity = " + this.overallCapacity + "\n" +
                "height = " + this.height + "\n" +
                "width = " + this.width;
        return object + "\n" + objectInfo;
    }
}
