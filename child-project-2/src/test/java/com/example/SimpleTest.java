package com.example;

import static com.google.common.truth.Truth.assertThat;

import com.google.cloud.storage.StorageOptions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SimpleTest {

  private static MyOptions myOptions;

  @Before
  public void setUp(){
    MyStorageHelper gcsHelper = MyStorageHelper.create();
  }

  @Test
  public void testMessage(){
    MySampleFileSystemProvider mySampleFileSystemProvider = new MySampleFileSystemProvider();
    mySampleFileSystemProvider.doInitStorage();
    CloudStorageConfiguration config =
        CloudStorageConfiguration.builder()
            .autoDetectRequesterPays(true)
            .build();
    MyStorageHelper gcsHelper = MyStorageHelper.create();
    MySampleFileSystem.forBucket("bucket",config, null);
    assertThat("hello1").isEqualTo("hello1");
  }
}