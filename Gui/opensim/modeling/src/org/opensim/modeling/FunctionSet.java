/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class FunctionSet extends SetFunctions {
  private transient long swigCPtr;

  public FunctionSet(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.FunctionSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(FunctionSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_FunctionSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean adoptAndAppend(Function aFunction) {
	aFunction.markAdopted();
    return super.adoptAndAppend(aFunction);
  }

  public static FunctionSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelCommonJNI.FunctionSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new FunctionSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelCommonJNI.FunctionSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelCommonJNI.FunctionSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelCommonJNI.FunctionSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new FunctionSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelCommonJNI.FunctionSet_getConcreteClassName(swigCPtr, this);
  }

  public FunctionSet() {
    this(opensimModelCommonJNI.new_FunctionSet__SWIG_0(), true);
  }

  public FunctionSet(String aFileName) {
    this(opensimModelCommonJNI.new_FunctionSet__SWIG_1(aFileName), true);
  }

  public double evaluate(int aIndex, int aDerivOrder, double aX) {
    return opensimModelCommonJNI.FunctionSet_evaluate__SWIG_0(swigCPtr, this, aIndex, aDerivOrder, aX);
  }

  public double evaluate(int aIndex, int aDerivOrder) {
    return opensimModelCommonJNI.FunctionSet_evaluate__SWIG_1(swigCPtr, this, aIndex, aDerivOrder);
  }

  public void evaluate(ArrayDouble rValues, int aDerivOrder, double aX) {
    opensimModelCommonJNI.FunctionSet_evaluate__SWIG_2(swigCPtr, this, ArrayDouble.getCPtr(rValues), rValues, aDerivOrder, aX);
  }

  public void evaluate(ArrayDouble rValues, int aDerivOrder) {
    opensimModelCommonJNI.FunctionSet_evaluate__SWIG_3(swigCPtr, this, ArrayDouble.getCPtr(rValues), rValues, aDerivOrder);
  }

}
