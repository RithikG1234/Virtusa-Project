package com.virtusa.service;

import com.virtusa.model.File;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class FileRepository {
    public static List<File> fileList=new ArrayList<>();

    public File save(File f) {
        fileList.add(f);
        return f;
    }

    public Optional<File> findById(String id) {
        return fileList.stream().filter((file)->file.getId().equals(id)).findFirst();
    }
    public List<File> findAll(){
        return fileList;
    }
}
