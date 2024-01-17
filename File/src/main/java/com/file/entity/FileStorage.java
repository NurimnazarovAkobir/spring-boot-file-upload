package com.file.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class FileStorage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String extension;
    private Long fileSize;
    private String hashId;
    private String contentType;
    private String filePath;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Enumerated(EnumType.STRING)
    private FileStorageStatus fileStorageStatus;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public String getHashId() {
        return hashId;
    }

    public String getContentType() {
        return contentType;
    }


    public FileStorageStatus getFileStorageStatus() {
        return fileStorageStatus;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public void setHashId(String hashId) {
        this.hashId = hashId;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }


    public void setFileStorageStatus(FileStorageStatus fileStorageStatus) {
        this.fileStorageStatus = fileStorageStatus;
    }
}
