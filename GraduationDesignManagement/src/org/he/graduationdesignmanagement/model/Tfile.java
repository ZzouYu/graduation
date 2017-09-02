package org.he.graduationdesignmanagement.model;

import java.util.Arrays;

public class Tfile {
  private String fileId; 
  private String fileName; 
  private byte[] fileContent;
  private String remark;
  

public Tfile(String fileId, String fileName, byte[] fileContent, String remark) {
	super();
	this.fileId = fileId;
	this.fileName = fileName;
	this.fileContent = fileContent;
	this.remark = remark;
}
public String getFileId() {
	return fileId;
}
public void setFileId(String fileId) {
	this.fileId = fileId;
}
public String getFileName() {
	return fileName;
}
public void setFileName(String fileName) {
	this.fileName = fileName;
}
public byte[] getFileContent() {
	return fileContent;
}
public void setFileContent(byte[] fileContent) {
	this.fileContent = fileContent;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
} 
  
}
