package com.example.mark.publishproguard.content;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Mark on 2015/10/18.
 */
public class People implements Parcelable{
    private String name;
    private boolean isDead;
    private int age;
    private float height;

    public People(){
    }

    protected People(Parcel in) {
        name = in.readString();
        isDead = in.readByte() != 0;
        age = in.readInt();
        height = in.readFloat();
    }

    public static final Creator<People> CREATOR = new Creator<People>() {
        @Override
        public People createFromParcel(Parcel in) {
            return new People(in);
        }

        @Override
        public People[] newArray(int size) {
            return new People[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeByte((byte) (isDead ? 1 : 0));
        dest.writeInt(age);
        dest.writeFloat(height);
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", isDead=" + isDead +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
