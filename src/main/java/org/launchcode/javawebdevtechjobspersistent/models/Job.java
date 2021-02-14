package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Entity
public class Job extends AbstractEntity {

//    @NotNull(message="Employer required")
    @ManyToOne
    private Employer employer;

    @ManyToMany
//    @NotNull
    private List<Skill> skills = new ArrayList<>();

    public Job(String name, Employer anEmployer, List<Skill> someSkills) {
        super(name);
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    public Job() {}


    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

//    public void addSkill(Skill skill) {
//        this.skills.add(skill);
//    }
}
