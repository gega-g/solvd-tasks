package second_task.university.infrastructure;

import java.math.BigDecimal;

public class Laboratory extends Building {
    private String equipmentType;
    private BigDecimal safetyBudget;

    public Laboratory(String name, String equipment, BigDecimal budget) {
        super(name);
        this.equipmentType = equipment;
        this.safetyBudget = budget;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public BigDecimal getSafetyBudget() {
        return safetyBudget;
    }

    public void setSafetyBudget(BigDecimal safetyBudget) {
        this.safetyBudget = safetyBudget;
    }
}