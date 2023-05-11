package com.example;

import org.graalvm.nativeimage.hosted.Feature;
final class GraalVM22Feature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {
        System.out.println("*** Invoked GraalVM 22 Feature***");
    }
}
