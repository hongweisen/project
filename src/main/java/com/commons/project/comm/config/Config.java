package com.commons.project.comm.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 配置文件信息
 */
@Component
public class Config {

    @Value("${project.file.save.path}")
    private String fileSavePath;

    @Value("${project.file.access.url}")
    private String fileAccessPath;

    public String getFileSavePath() {
        return fileSavePath;
    }

    public String getFileAccessPath() {
        return fileAccessPath;
    }
}
