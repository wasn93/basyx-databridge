package org.eclipse.digitaltwin.basyx.databridge.bacnet.factory;

import org.eclipse.digitaltwin.basyx.databridge.bacnet.BACnetConsumerConfiguration;
import org.eclipse.digitaltwin.basyx.databridge.core.configuration.factory.DataSourceConfigurationFactory;

public class BACnetDefaultConfigurationFactory extends DataSourceConfigurationFactory {
    public static final String DEFAULT_FILE_PATH = "bacnetconsumer.json";

    public BACnetDefaultConfigurationFactory(ClassLoader loader) {
        super(DEFAULT_FILE_PATH, loader, BACnetConsumerConfiguration.class);
    }

    public BACnetDefaultConfigurationFactory(String filePath, ClassLoader loader) {
        super(filePath, loader, BACnetConsumerConfiguration.class);
    }
}