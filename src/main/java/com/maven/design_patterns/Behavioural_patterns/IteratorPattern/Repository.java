package com.maven.design_patterns.Behavioural_patterns.IteratorPattern;

public class Repository implements Container{
	public String names[] = {"Prashanthi" , "Sreeja" ,"Laya" , "vanaja"};

	   public Iterator getIterator() {
	      return new NameIterator();
	   }

	   private class NameIterator implements Iterator {

	      int index;
	      public boolean hasNext() {
	      
	         if(index < names.length){
	            return true;
	         }
	         return false;
	      }

	     
	      public Object next() {
	      
	         if(this.hasNext()){
	            return names[index++];
	         }
	         return null;
	      }		
	   }

}
