/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ArrayIndexInt {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ArrayIndexInt(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ArrayIndexInt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_ArrayIndexInt(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static int max_size() {
    return opensimSimbodyJNI.ArrayIndexInt_max_size();
  }

  public ArrayIndexInt() {
    this(opensimSimbodyJNI.new_ArrayIndexInt(), true);
  }

}
