package com.example;

import org.graalvm.nativeimage.hosted.Feature;

/** Configures Native Image settings for the grpc-netty-shaded dependency. */
final class MyNativeImageFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {
        String version = System.getProperty("java.vendor.version");
        if (version.contains("GraalVM") && version.contains("22.3")){
            System.out.println("*********Using GraalVM 22.3!***************");
            System.out.println(MyNativeImageFeature.class.getClassLoader().getResource("graalvm22_3.properties"));
            System.setProperty("NATIVE_IMAGE_CONFIG_FILE",
                    MyNativeImageFeature.class.getClassLoader().getResource("graalvm22_3.properties").getPath());
//            System.getenv().replace("NATIVE_IMAGE_CONFIG_FILE",MyNativeImageFeature.class.getClassLoader().getResource("graalvm22_3.properties").getPath());
            System.out.println(System.getenv("NATIVE_IMAGE_CONFIG_FILE"));
        }
    }

}