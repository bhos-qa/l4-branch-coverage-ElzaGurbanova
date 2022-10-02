package org.Lab4;
import java.io.FileReader;
enum favouriteSubject{
    MATH, PHYSICS, INFORMATICS
}

public class Classroom {
    public String name;
    public String sname;
    public int classNumber;
    public String email;
    public favouriteSubject subject;

    public String setName(String newName){
        this.name = newName;
        return this.name;
    }
    public String setSname(String newSname){
        this.sname = newSname;
        return this.sname;
    }
    public int setClassNumber(int newClassNumber){
        this.classNumber = newClassNumber;
        return this.classNumber;
    }

    public String setEmail(String newEmail){
        this.email = newEmail;
        return this.email;
    }
    public favouriteSubject setFavSubject (favouriteSubject newSub){
        this.subject = newSub;
        return this.subject;
    }
    public String getName(){
        return this.name;
    }
    public String getSname(){
        return this.sname;
    }
    public String getEmail(){
        return this.email;
    }
    public int getClassNumber(){
        return this.classNumber;
    }

    public String getFavSubject(){
        return switch (this.subject) {
            case MATH -> "MATH";
            case PHYSICS -> "PHYSICS";
            case INFORMATICS -> "INFORMATICS";
        };
    }
    public static void main(String args[])throws Exception{
        FileReader fr=new FileReader("D:\\testout.txt");
        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
    }
}

