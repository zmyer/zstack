package org.zstack.sdk;

import org.zstack.sdk.SNSApplicationPlatformInventory;

public class ChangeSNSApplicationPlatformStateResult {
    public SNSApplicationPlatformInventory inventory;
    public void setInventory(SNSApplicationPlatformInventory inventory) {
        this.inventory = inventory;
    }
    public SNSApplicationPlatformInventory getInventory() {
        return this.inventory;
    }

}
