package com.bptn.course.big_coding_2.stock_class;

public class Stock {
	
	
	// Create instance variables 
	private String tickerSymbol;
	private String companyName;
	private int price;
	private double percentChange;
	private int totalShares;
	private long marketCap;
	
	
    // Constructor 
	Stock(String tickerSymbol, String companyName, int price, int totalShares) {
		this.tickerSymbol = tickerSymbol;
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;
		
		this.percentChange = 0;
		this.marketCap =  totalShares * price;
				
	}

	
	
    
    // Create the methods 
	
	public void adjustPrice(int change) {
		this.price = this.price + change;
		this.percentChange = ((double)change/this.price)*100;
		this.marketCap= this.totalShares*this.price;
		}
	
	@Override
	public String toString() {
		return "Ticker Symbol: " + this.tickerSymbol.toUpperCase() + "\nCompany: " + this.companyName + " \nCurrent Price: $" + this.price + " (" + this.percentChange + "%)"  + "\nMarket Cap: $" + this.marketCap;
	}
	
	
	
    
    // Don't modify the code below:


	public static void main(String[] args) {
		
		Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);

	}


	
}
