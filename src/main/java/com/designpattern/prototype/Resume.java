package com.designpattern.prototype;

/**
 * @author lin
 * @date 2024/1/16 2:31
 **/
public class Resume implements Cloneable{

    private String name;

    private int age;

    private WorkExperience workExperience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", workExperience=" + workExperience +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume resume =  (Resume) super.clone();
        resume.setWorkExperience((WorkExperience) this.workExperience.clone());
        return resume;
    }
}
