package com.job.management.main.model;

import java.io.Serializable;
import java.util.Objects;

public class ReadingFileModel implements Serializable {
    private static final long serialVersionUID = 5318841472077477120L;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReadingFileModel that = (ReadingFileModel) o;
        return Objects.equals(line, that.line);
    }

    @Override
    public int hashCode() {
        return Objects.hash(line);
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    private String line;

}
