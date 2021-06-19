package com.dtrband.dtrbackend01.models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;


@Entity
@Table(name="shows")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String location;
    private Date dateOf;
    private Date datePosted;
    private String imgUrl;
    private String eventLink;
    private String description;


    public Show() {
    }

    public Date getDatePosted() { return datePosted; }

    public void setDatePosted(Date datePosted) { this.datePosted = datePosted; }

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDateOf() {
        return dateOf;
    }

    public void setDateOf(Date dateOf) {
        this.dateOf = dateOf;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getEventLink() {
        return eventLink;
    }

    public void setEventLink(String eventLink) {
        this.eventLink = eventLink;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Show show = (Show) o;
        return Objects.equals(id, show.id) && Objects.equals(title, show.title) && Objects.equals(location, show.location) && Objects.equals(dateOf, show.dateOf) && Objects.equals(datePosted, show.datePosted) && Objects.equals(imgUrl, show.imgUrl) && Objects.equals(eventLink, show.eventLink) && Objects.equals(description, show.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, location, dateOf, datePosted, imgUrl, eventLink, description);
    }

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", dateOf=" + dateOf +
                ", datePosted=" + datePosted +
                ", imgUrl='" + imgUrl + '\'' +
                ", eventLink='" + eventLink + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
