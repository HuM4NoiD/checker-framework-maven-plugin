package org.checkerframework.maven.plugin;

import org.apache.maven.plugins.annotations.Mojo;

import java.util.ArrayList;
import java.util.List;


public class CreateManifestTask {

    private final static String manifestDirectoryName = "checkerframework/META-INF/services/";
    private final static String manifestFileName = "javax.annotation.processing.Processor";

    List<String> checkers = new ArrayList<String>();
}
