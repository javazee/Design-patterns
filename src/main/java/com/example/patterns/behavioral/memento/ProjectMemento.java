package com.example.patterns.behavioral.memento;

import java.time.LocalDateTime;

public class ProjectMemento {
    private final String version;
    private final String author;
    private final LocalDateTime creationDate;
    private final String content;

    public ProjectMemento(String version, String author, LocalDateTime creationDate, String content) {
        this.version = version;
        this.author = author;
        this.creationDate = creationDate;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getVersion() {
        return version;
    }
}
