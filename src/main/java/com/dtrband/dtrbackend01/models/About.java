package com.dtrband.dtrbackend01.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="about")
public class About {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String bandMemberName;
    private String description;
    private String imgUrl;

    public About() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBandMemberName() {
        return bandMemberName;
    }

    public void setBandMemberName(String bandMemberName) {
        this.bandMemberName = bandMemberName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        About about = (About) o;
        return Objects.equals(id, about.id) && Objects.equals(bandMemberName, about.bandMemberName) && Objects.equals(description, about.description) && Objects.equals(imgUrl, about.imgUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bandMemberName, description, imgUrl);
    }

    @Override
    public String toString() {
        return "About{" +
                "id=" + id +
                ", bandMemberName='" + bandMemberName + '\'' +
                ", description='" + description + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
