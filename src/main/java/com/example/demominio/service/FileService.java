package com.example.demominio.service;

import com.example.demominio.model.FileMetadata;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

public interface FileService {

    FileMetadata uploadFile(MultipartFile file);



    InputStream getFileByFileName(String fileName);
}
