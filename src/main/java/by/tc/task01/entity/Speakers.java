package by.tc.task01.entity;

import java.io.Serializable;

public class Speakers extends Appliance implements Serializable{
	// you may add your own code here
    private double powerConsumption;
    private double numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;

    public Speakers(){}

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(double numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    public boolean equals(Object obj) {
        if(this == obj) {return true;}
        if(null == obj) {return false;}
        if(getClass() != obj.getClass()) {return false;}

        Speakers speakers = (Speakers)obj;
        if(powerConsumption != speakers.powerConsumption) {return false;}
        if(numberOfSpeakers != speakers.numberOfSpeakers) {return false;}
        if(frequencyRange != speakers.frequencyRange) {return false;}
        if(cordLength != speakers.cordLength) {return false;}
        if (null == frequencyRange) {
            return (frequencyRange == speakers.frequencyRange);
        } else {
            if (!frequencyRange.equals(speakers.frequencyRange)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (int)(31*powerConsumption + 31*numberOfSpeakers+ 31*cordLength + ((null == frequencyRange) ? 0 : frequencyRange.hashCode()));
    }

    public String toString() {
        String object = "Объект: " + this.getClass().getSimpleName();
        String objectInfo = "powerConsumption = " + this.powerConsumption + "\n" +
                "numberOfSpeakers = " + this.numberOfSpeakers + "\n" +
                "frequencyRange = " + this.frequencyRange + "\n" +
                "cordLength = " + this.cordLength;
        return object + "\n" + objectInfo;
    }
}
