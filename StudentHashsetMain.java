package com.collection;

import java.util.HashSet;

public class StudentHashsetMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashSet<StudentHashset > hs=new HashSet<>();
    hs.add(new StudentHashset(1,"aaaa",50,68));
    hs.add(new StudentHashset(1,"aaaa",50,68));
    hs.add(new StudentHashset(2,"abcd",60,87)); 
    for(StudentHashset obj1:hs)
    System.out.println(obj1);
	}

}
