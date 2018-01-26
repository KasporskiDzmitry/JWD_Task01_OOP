package by.tc.task01.entity;

import java.io.Serializable;

public class VacuumCleaner extends Appliance implements Serializable{
    private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner(){}

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    public boolean equals(Object obj) {
        if(this == obj) {return true;}
        if(null == obj) {return false;}
        if(getClass() != obj.getClass()) {return false;}

        VacuumCleaner vacuumCleaner = (VacuumCleaner) obj;
        if(powerConsumption != vacuumCleaner.powerConsumption) {return false;}
        if(motorSpeedRegulation != vacuumCleaner.motorSpeedRegulation) {return false;}
        if(cleaningWidth != vacuumCleaner.cleaningWidth) {return false;}
        if (null == filterType) {
            return (filterType == vacuumCleaner.filterType);
        } else {
            if (!filterType.equals(vacuumCleaner.filterType)) {
                return false;
            }
        }
        if (null == bagType) {
            return (bagType == vacuumCleaner.bagType);
        } else {
            if (!bagType.equals(vacuumCleaner.bagType)) {
                return false;
            }
        }
        if (null == wandType) {
            return (wandType == vacuumCleaner.wandType);
        } else {
            if (!wandType.equals(vacuumCleaner.wandType)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (int)(31*powerConsumption + 31*motorSpeedRegulation + 31*cleaningWidth +
                ((null == filterType) ? 0 : filterType.hashCode()) +
                ((null == bagType) ? 0 : bagType.hashCode()) +
                ((null == wandType) ? 0 : wandType.hashCode()));
    }

    public String toString() {
        return
                "VacuumCleaner" + "\n" +
                "powerConsumption = " + this.powerConsumption + "\n" +
                "motorSpeedRegulation = " + this.motorSpeedRegulation + "\n" +
                "cleaningWidth = " + this.cleaningWidth + "\n" +
                "filterType = " + this.filterType + "\n" +
                "bagType = " + this.bagType + "\n" +
                "wandType = " + this.wandType;
    }
}
