package by.tc.task01.entity;

import javax.sql.rowset.serial.SerialArray;
import java.io.Serializable;

public class TabletPC extends Appliance implements Serializable{
    private double batteryCapacity;
    private double displayInches;
    private double memoryRom;
    private double flashMemoryCapacity;
    private String color;

    public TabletPC(){}

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean equals(Object obj) {
        if(this == obj) {return true;}
        if(null == obj) {return false;}
        if(getClass() != obj.getClass()) {return false;}

        TabletPC tabletPC = (TabletPC)obj;
        if(batteryCapacity != tabletPC.batteryCapacity) {return false;}
        if(displayInches != tabletPC.displayInches) {return false;}
        if(memoryRom != tabletPC.memoryRom) {return false;}
        if(flashMemoryCapacity != tabletPC.flashMemoryCapacity) {return false;}
        if (null == color) {
            return (color == tabletPC.color);
        } else {
            if (!color.equals(tabletPC.color)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (int)(31*batteryCapacity + 31*displayInches + 31*memoryRom + 31*flashMemoryCapacity +
                ((null == color) ? 0 : color.hashCode()));
    }

    public String toString() {
        String object = "Объект: " + this.getClass().getSimpleName();
        String objectInfo = "batteryCapacity = " + this.batteryCapacity + "\n" +
                "displayInches = " + this.displayInches + "\n" +
                "memoryRom = " + this.memoryRom + "\n" +
                "flashMemoryCapacity = " + this.flashMemoryCapacity + "\n" +
                "color = " + this.color;
        return object + "\n" + objectInfo;
    }
}
