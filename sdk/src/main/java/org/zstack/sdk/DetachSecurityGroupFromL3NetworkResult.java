package org.zstack.sdk;

import org.zstack.sdk.SecurityGroupInventory;

public class DetachSecurityGroupFromL3NetworkResult {
    public SecurityGroupInventory inventory;
    public void setInventory(SecurityGroupInventory inventory) {
        this.inventory = inventory;
    }
    public SecurityGroupInventory getInventory() {
        return this.inventory;
    }

}
