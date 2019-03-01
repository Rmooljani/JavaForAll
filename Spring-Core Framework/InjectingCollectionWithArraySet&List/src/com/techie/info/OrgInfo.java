package com.techie.info;

import java.util.List;
import java.util.Set;

public class OrgInfo {
	
	private String[] namesArr = new String[2];
	private Set<Integer> empNameSet;
	
	public String[] getNamesArr() {
		return namesArr;
	}
	public void setNamesArr(String[] namesArr) {
		this.namesArr = namesArr;
	}
	public Set<Integer> getEmpNameSet() {
		return empNameSet;
	}
	public void setEmpNameSet(Set<Integer> empNameSet) {
		this.empNameSet = empNameSet;
	}
	public List<String> getEmpNameList() {
		return empNameList;
	}
	public void setEmpNameList(List<String> empNameList) {
		this.empNameList = empNameList;
	}
	private List<String> empNameList;
	

}
