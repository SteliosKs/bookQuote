package nl.utwente.di.bookQuote;

import java.util.*;

public class Quoter {

    private HashMap<String, Double> bookMap = new HashMap<>();

    public Quoter(){
        bookMap.put("1", 10.0);
        bookMap.put("2", 45.0);
        bookMap.put("3", 20.0);
        bookMap.put("4", 35.0);
        bookMap.put("5", 50.0);
    }

    public Double getBookPrice(String isbn) {
        if(bookMap.keySet().contains(isbn))
            return bookMap.get(isbn);
        else return 0.0;
    }

}
