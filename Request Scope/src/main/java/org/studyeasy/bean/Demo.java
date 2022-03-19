package org.studyeasy.bean;

public class Demo {

	private String firstWord;
	private String lastWord;
	public Demo() {
		firstWord= "sivaranjni";
		lastWord= "nandhini";
	
	}
	public Demo(String firstWord, String lastWord) {
		super();
		this.firstWord = firstWord;
		this.lastWord = lastWord;
	}
	public String getFirstWord() {
		return firstWord;
	}
	public void setFirstWord(String firstWord) {
		this.firstWord = firstWord;
	}
	public String getLastWord() {
		return lastWord;
	}
	public void setLastWord(String lastWord) {
		this.lastWord = lastWord;
	}
		
}
