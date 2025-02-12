package com.bptn.course._18_java_junit.__junit_books;

public class Textbook extends Book {
	
	private int edition;

	public Textbook(String title, double price, int editiion) {
		super(title, price);
		this.edition = editiion;
		
	}

	public int getEdition() {
		return edition;
	}
	
	
	@Override
	public String getBookInfo() {
		return super.getBookInfo()+ "-" + this.edition;
	}
	
	
	public boolean canSubstituteFor(Textbook other) {
		
		return this.edition >= other.getEdition() && this.getTitle().equals(other.getTitle());
		
	}

}
