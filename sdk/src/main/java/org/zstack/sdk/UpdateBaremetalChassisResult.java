package org.zstack.sdk;

import org.zstack.sdk.BaremetalChassisInventory;

public class UpdateBaremetalChassisResult {
    public BaremetalChassisInventory inventory;
    public void setInventory(BaremetalChassisInventory inventory) {
        this.inventory = inventory;
    }
    public BaremetalChassisInventory getInventory() {
        return this.inventory;
    }

}
