package com.dtrband.dtrbackend01.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="about")
public class About {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private String imgurl;

    public About() {
    }

    public About(String title, String description, String imgUrl) {
        this.title = title;
        this.description = description;
        this.imgurl = imgUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgurl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgurl = imgUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        About about = (About) o;
        return Objects.equals(id, about.id) && Objects.equals(title, about.title) && Objects.equals(description, about.description) && Objects.equals(imgurl, about.imgurl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, imgurl);
    }

    @Override
    public String toString() {
        return "About{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", imgUrl='" + imgurl + '\'' +
                '}';
    }
}
