package com.designpattern.prototype;

/**
 * @author lin
 * @date 2024/1/16 2:55
 **/
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume();
        resume.setName("tom");
        resume.setAge(29);
        WorkExperience workExperience = new WorkExperience();
        workExperience.setYear(2020);
        workExperience.setCompany("google");
        resume.setWorkExperience(workExperience);
        System.out.println(resume);

        Resume cloneResume = (Resume) resume.clone();
        //此处实现了深拷贝,如果是浅拷贝,以下语句会影响原有对象
        resume.setName("jack");
        workExperience.setCompany("oracle");
        System.out.println("再次设置值时原对象:" + resume);

        System.out.println(cloneResume);
    }
}
