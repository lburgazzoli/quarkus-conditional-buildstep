package com.github.lburgazzoli.quarkus.playground;

import io.quarkus.runtime.annotations.Recorder;

@Recorder
public class MyRecorder {
    public void saySomething(String something) {
        System.out.println(">>>>>> " + something);
    }
}
