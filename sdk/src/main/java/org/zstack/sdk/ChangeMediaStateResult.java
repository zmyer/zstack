package org.zstack.sdk;

import org.zstack.sdk.MediaInventory;

public class ChangeMediaStateResult {
    public MediaInventory inventory;
    public void setInventory(MediaInventory inventory) {
        this.inventory = inventory;
    }
    public MediaInventory getInventory() {
        return this.inventory;
    }

}
