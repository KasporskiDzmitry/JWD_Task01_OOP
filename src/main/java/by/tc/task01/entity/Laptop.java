package by.tc.task01.entity;

import java.io.Serializable;

public class Laptop extends Appliance implements Serializable{
    private double batteryCapacity;
    private String os;
    private double memoryRom;
    private double cpu;
    private double displayInchs;

    public Laptop() {}

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(double displayInchs) {
        this.displayInchs = displayInchs;
    }

    public boolean equals(Object obj) {
        if(this == obj) {return true;}
        if(null == obj) {return false;}
        if(getClass() != obj.getClass()) {return false;}

        Laptop laptop = (Laptop)obj;
        if(batteryCapacity != laptop.batteryCapacity) {return false;}
        if(memoryRom != laptop.memoryRom) {return false;}
        if(cpu != laptop.cpu) {return false;}
        if(displayInchs != laptop.displayInchs) {return false;}
        if (null == os) {
            return (os == laptop.os);
        } else {
            if (!os.equals(laptop.os)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (int)(31*batteryCapacity + 31*displayInchs + 31*cpu + 31*memoryRom + ((null == os) ? 0 : os.hashCode()));
    }

    public String toString() {
        String object = "Объект: " + this.getClass().getSimpleName();
        String objectInfo = "batteryCapacity = " + this.batteryCapacity + "\n" +
                "displayInchs = " + this.displayInchs + "\n" +
                "cpu = " + this.cpu + "\n" +
                "memoryRom = " + this.memoryRom + "\n" +
                "os = " + this.os;
        return object + "\n" + objectInfo;
    }
}
