package org.fundatec.ti19.vinilemess.cassandraconnectionpoc.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table
public class Student {
    @PrimaryKey
    private UUID id;
    private String fullName;
    private String schoolClass;
    private String schoolName;

    public Student(UUID id, String fullName, String schoolClass, String schoolName) {
        this.id = id;
        this.fullName = fullName;
        this.schoolClass = schoolClass;
        this.schoolName = schoolName;
    }

    public UUID getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return "\nid : " + id + "\n" +
                "fullname : " + fullName + "\n" +
                "schoolClass : " + schoolClass + "\n" +
                "schoolName : " + schoolName;
    }
}
