package com.example.patterns.behavioral.memento;

import java.time.LocalDateTime;

public class Project {

    private String version;
    private String author;
    private LocalDateTime creationDate;
    private String content;

    public Project(String version,
                   String author,
                   String content) {
        this.version = version;
        this.author = author;
        this.content = content;
        this.creationDate = LocalDateTime.now();
    }

    public ProjectMemento snapshot() {
        return new ProjectMemento(version, author, creationDate, content);
    }

    public void load(ProjectMemento projectMemento) {
        this.author = projectMemento.getAuthor();
        this.content = projectMemento.getContent();
        this.creationDate = projectMemento.getCreationDate();
        this.version = projectMemento.getVersion();
    }

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", author='" + author + '\'' +
                ", creationDate=" + creationDate +
                ", content='" + content + '\'' +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public String getContent() {
        return content;
    }

    public String getVersion() {
        return version;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
