/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class VectorBaseVec3 extends MatrixBaseVec3 {
  private transient long swigCPtr;

  protected VectorBaseVec3(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.VectorBaseVec3_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VectorBaseVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_VectorBaseVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public VectorBaseVec3(int m) {
    this(opensimSimbodyJNI.new_VectorBaseVec3__SWIG_0(m), true);
  }

  public VectorBaseVec3() {
    this(opensimSimbodyJNI.new_VectorBaseVec3__SWIG_1(), true);
  }

  public VectorBaseVec3(VectorBaseVec3 source) {
    this(opensimSimbodyJNI.new_VectorBaseVec3__SWIG_2(VectorBaseVec3.getCPtr(source), source), true);
  }

  public int size() {
    return opensimSimbodyJNI.VectorBaseVec3_size(swigCPtr, this);
  }

  public int nrow() {
    return opensimSimbodyJNI.VectorBaseVec3_nrow(swigCPtr, this);
  }

  public int ncol() {
    return opensimSimbodyJNI.VectorBaseVec3_ncol(swigCPtr, this);
  }

  public VectorBaseVec3 resize(int m) {
    return new VectorBaseVec3(opensimSimbodyJNI.VectorBaseVec3_resize(swigCPtr, this, m), false);
  }

  public VectorBaseVec3 resizeKeep(int m) {
    return new VectorBaseVec3(opensimSimbodyJNI.VectorBaseVec3_resizeKeep(swigCPtr, this, m), false);
  }

  public void clear() {
    opensimSimbodyJNI.VectorBaseVec3_clear(swigCPtr, this);
  }

  public Vec3 sum() {
    return new Vec3(opensimSimbodyJNI.VectorBaseVec3_sum(swigCPtr, this), true);
  }

  public Vec3 __getitem__(long i) {
    return new Vec3(opensimSimbodyJNI.VectorBaseVec3___getitem__(swigCPtr, this, i), true);
  }

  public void __setitem__(long i, Vec3 value) {
    opensimSimbodyJNI.VectorBaseVec3___setitem__(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

}
