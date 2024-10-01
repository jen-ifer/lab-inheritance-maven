package edu.grinnell.csc207.util;

public class BasicCounter implements Counter {
  protected int count; //field count
  protected int start; // field start

 public BasicCounter (int value){
  count = value;
  start = value;
 } // constructor basiccounter
  

 public void increment() throws Exception{
  int countPreAdd = this.count;
  this.count +=1;
  if( this.count < countPreAdd){
    throw new Exception ("Count grew too large");
  }
 }
public void reset(){
  this.count = this.start;
}
public String toString(){
  String valuestr = String.valueOf(this.count);
  return "[" +valuestr + "]";
}

public int get(){
  return this.count;
}
}
