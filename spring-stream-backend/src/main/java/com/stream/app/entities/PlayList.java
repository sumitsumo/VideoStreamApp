package com.stream.app.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "playlists")
public class PlayList {

    @Id
    private  String id;

    private  String title;

//    @OneToMany(mappedBy = "course")
//    private List<Video> list=new ArrayList<>();
}
