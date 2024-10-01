package edu.grinnell.csc207.util;

/**
 * Counters that you can decrement.
 */
public class DecrementableCounter extends BasicCounter {
  /**
   * Create a new decrementable counter.
   *
   * @param start
   *   The initial value of the counter.
   */
  public DecrementableCounter(int start) {
    super(start);
    
  } // DecrementableCounter(int)

  public void decrement() throws Exception{
    int countPreSub = this.count;
    this.count -=1;
    if( this.count > countPreSub){
      throw new Exception ("Count grew too small");
    }
   }
} // class DecrementableCounter
