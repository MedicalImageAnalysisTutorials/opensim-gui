/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class VectorViewVec3 extends VectorBaseVec3 {
  private transient long swigCPtr;

  public VectorViewVec3(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.VectorViewVec3_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(VectorViewVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_VectorViewVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public VectorViewVec3(VectorViewVec3 v) {
    this(opensimModelJNI.new_VectorViewVec3(VectorViewVec3.getCPtr(v), v), true);
  }

}