package org.eclipse.digitaltwin.basyx.databridge.bacnet.configuration;

import org.eclipse.digitaltwin.basyx.databridge.core.configuration.entity.DataSourceConfiguration;

public class BACnetConsumerConfiguration extends DataSourceConfiguration {
    private String ipAddress;
    private int deviceId;
    private int objectType;
    private int instanceNr;
    private int propertyId;


    public BACnetConsumerConfiguration() {}

    public BACnetConsumerConfiguration(String uniqueId, String serverUrl, int serverPort, String ipAddress,
                                      int deviceId, int objectType, int instanceNr, int propertyId) {
        super(uniqueId, serverUrl, serverPort);
        this.ipAddress = ipAddress;
        this.deviceId = deviceId;
        this.objectType = objectType;
        this.instanceNr = instanceNr;
        this.propertyId = propertyId;
    }


    @Override
    public String getConnectionURI() {
        return "bacnet://" + getIpAddress()
                + "/" + getObjectType()
                + "/" + getInstanceNr()
                + "/" + getPropertyId();
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public int getObjectType() {
        return objectType;
    }

    public void setObjectType(int objectType) {
        this.objectType = objectType;
    }

    public int getInstanceNr() {
        return instanceNr;
    }

    public void setInstanceNr(int instanceNr) {
        this.instanceNr = instanceNr;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }
}
