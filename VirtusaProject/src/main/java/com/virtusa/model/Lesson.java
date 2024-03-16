package com.virtusa.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Lesson {
    private int id;
    private String title;
    private String imageUrl;
    private String video;

    public Lesson(int id,String title, String imageUrl, String video) {
        this.id=id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.video = video;
    }
}
