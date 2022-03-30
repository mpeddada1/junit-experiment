package com.example;

import com.google.cloud.storage.testing.RemoteStorageHelper.StorageHelperException;
import java.util.logging.Logger;

public class MyStorageHelper {
    static {
        System.out.println("*****MY STORAGE HELPER*****");
    }
    private static final Logger log = Logger.getLogger(MyStorageHelper.class.getName());
    private static final String BUCKET_NAME_PREFIX = "gcloud-test-bucket-temp-";

    private final MyOptions options;

    private MyStorageHelper(MyOptions options) {
        this.options = options;
    }
    public static MyStorageHelper create() throws StorageHelperException {
        MyOptions myOptions = new MyOptions();
        return new MyStorageHelper(myOptions);
    }
}
