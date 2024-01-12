 package com.collection;

import java.util.Objects;

public class StudentHashset {
	private int stdId;
	private String stdName;
	int mksMath;
	int mksJava;
	public StudentHashset() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentHashset(int stdId, String stdName, int mksMath, int mksJava) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.mksMath = mksMath;
		this.mksJava = mksJava;
	}
	@Override
	public String toString() {
		return "StudentHashset [stdId=" + stdId + ", stdName=" + stdName + ", mksMath=" + mksMath + ", mksJava="
				+ mksJava + "]";
	}
	
	@Override
	public int hashCode() {
		return stdId+1;
	}
	@Override
	public boolean equals(Object obj) {
    if((obj instanceof StudentHashset) && (((StudentHashset)obj).stdId)==this.stdId)
	 return true;
     return false;
	//	StudentHashset h=(StudentHashset)obj;
		//return(stdId==h.stdId);   
	}
	
	int totStudent() {
    	return(mksMath+mksJava);
    }
	int perStudent() {
		int tot=totStudent();
		return(tot/2); 
	}
	

}
