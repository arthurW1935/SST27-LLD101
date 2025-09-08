package com.example.report;

import java.nio.file.*;
import java.util.*;

public class ReportBundleFacade {
    private final JsonWriter jsonWriter = new JsonWriter();
    private final Zipper zipper = new Zipper();
    private final AuditLog log = new AuditLog();

    public Path export(java.util.Map<String,Object> data, java.nio.file.Path outDir, String baseName) {
        Objects.requireNonNull(data, "data");
        Objects.requireNonNull(outDir, "outDir");
        Objects.requireNonNull(baseName, "baseName");

        Path json = jsonWriter.write(data, outDir, baseName);
        Path zip = zipper.zip(json, outDir.resolve(baseName + ".zip"));
        log.log("exported " + zip);

        return zip;
    }
}
