/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class UnexpectedColumnLabel extends IOError {
  private transient long swigCPtr;

  public UnexpectedColumnLabel(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.UnexpectedColumnLabel_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(UnexpectedColumnLabel obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_UnexpectedColumnLabel(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public UnexpectedColumnLabel(String file, long line, String func, String filename, String expected, String received) {
    this(opensimModelCommonJNI.new_UnexpectedColumnLabel(file, line, func, filename, expected, received), true);
  }

}
