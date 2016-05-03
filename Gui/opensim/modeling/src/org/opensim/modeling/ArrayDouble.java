/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ArrayDouble {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArrayDouble(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArrayDouble obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_ArrayDouble(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

	public void fromString(String string) {
      // Remove open and close parenth if any
      String workString= new String(string);
      int liveStart = workString.indexOf("(");
      int liveEnd = workString.indexOf(")");
      if (liveStart!=-1 && liveEnd!=-1){
          workString = workString.substring(liveStart+1, liveEnd);
      }
      else if (liveStart!=liveEnd){
          // throw new ParseException("Illegal format: Expect space separated" +
          //                          " values, optionally between matched " +
          //                          "parentheses", liveEnd);
          return;
      }
      String[] splits = workString.split(" ");
      double[] values = new double[splits.length];
      for(int i=0; i<splits.length; i++){
           values[i]=Double.parseDouble(splits[i]);
       }
       this.setValues(values, splits.length);
	}

  public ArrayDouble(double aDefaultValue, int aSize, int aCapacity) {
    this(opensimModelCommonJNI.new_ArrayDouble__SWIG_0(aDefaultValue, aSize, aCapacity), true);
  }

  public ArrayDouble(double aDefaultValue, int aSize) {
    this(opensimModelCommonJNI.new_ArrayDouble__SWIG_1(aDefaultValue, aSize), true);
  }

  public ArrayDouble(double aDefaultValue) {
    this(opensimModelCommonJNI.new_ArrayDouble__SWIG_2(aDefaultValue), true);
  }

  public ArrayDouble() {
    this(opensimModelCommonJNI.new_ArrayDouble__SWIG_3(), true);
  }

  public ArrayDouble(ArrayDouble aArray) {
    this(opensimModelCommonJNI.new_ArrayDouble__SWIG_4(ArrayDouble.getCPtr(aArray), aArray), true);
  }

  public boolean arrayEquals(ArrayDouble aArray) {
    return opensimModelCommonJNI.ArrayDouble_arrayEquals(swigCPtr, this, ArrayDouble.getCPtr(aArray), aArray);
  }

  public void trim() {
    opensimModelCommonJNI.ArrayDouble_trim(swigCPtr, this);
  }

  public boolean setSize(int aSize) {
    return opensimModelCommonJNI.ArrayDouble_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelCommonJNI.ArrayDouble_getSize(swigCPtr, this);
  }

  public int size() {
    return opensimModelCommonJNI.ArrayDouble_size(swigCPtr, this);
  }

  public int append(double aValue) {
    return opensimModelCommonJNI.ArrayDouble_append__SWIG_0(swigCPtr, this, aValue);
  }

  public int append(ArrayDouble aArray) {
    return opensimModelCommonJNI.ArrayDouble_append__SWIG_1(swigCPtr, this, ArrayDouble.getCPtr(aArray), aArray);
  }

  public int insert(int aIndex, double aValue) {
    return opensimModelCommonJNI.ArrayDouble_insert(swigCPtr, this, aIndex, aValue);
  }

  public int remove(int aIndex) {
    return opensimModelCommonJNI.ArrayDouble_remove(swigCPtr, this, aIndex);
  }

  public void set(int aIndex, double aValue) {
    opensimModelCommonJNI.ArrayDouble_set(swigCPtr, this, aIndex, aValue);
  }

  public double get(int aIndex) {
    return opensimModelCommonJNI.ArrayDouble_get(swigCPtr, this, aIndex);
  }

  public double getitem(int index) {
    return opensimModelCommonJNI.ArrayDouble_getitem(swigCPtr, this, index);
  }

  public void setitem(int index, double val) {
    opensimModelCommonJNI.ArrayDouble_setitem(swigCPtr, this, index, val);
  }

  public double getLast() {
    return opensimModelCommonJNI.ArrayDouble_getLast(swigCPtr, this);
  }

  public int findIndex(double aValue) {
    return opensimModelCommonJNI.ArrayDouble_findIndex(swigCPtr, this, aValue);
  }

  public int rfindIndex(double aValue) {
    return opensimModelCommonJNI.ArrayDouble_rfindIndex(swigCPtr, this, aValue);
  }

  public int searchBinary(double aValue, boolean aFindFirst, int aLo, int aHi) {
    return opensimModelCommonJNI.ArrayDouble_searchBinary__SWIG_0(swigCPtr, this, aValue, aFindFirst, aLo, aHi);
  }

  public int searchBinary(double aValue, boolean aFindFirst, int aLo) {
    return opensimModelCommonJNI.ArrayDouble_searchBinary__SWIG_1(swigCPtr, this, aValue, aFindFirst, aLo);
  }

  public int searchBinary(double aValue, boolean aFindFirst) {
    return opensimModelCommonJNI.ArrayDouble_searchBinary__SWIG_2(swigCPtr, this, aValue, aFindFirst);
  }

  public int searchBinary(double aValue) {
    return opensimModelCommonJNI.ArrayDouble_searchBinary__SWIG_3(swigCPtr, this, aValue);
  }

  public void setValues(double[] dValues, int size) {
    opensimModelCommonJNI.ArrayDouble_setValues(swigCPtr, this, dValues, size);
  }

  public Vec3 getAsVec3() {
    return new Vec3(opensimModelCommonJNI.ArrayDouble_getAsVec3(swigCPtr, this), true);
  }

  public static Vec3 createVec3(double e1, double e2, double e3) {
    return new Vec3(opensimModelCommonJNI.ArrayDouble_createVec3__SWIG_0(e1, e2, e3), true);
  }

  public static Vec3 createVec3(double e1) {
    return new Vec3(opensimModelCommonJNI.ArrayDouble_createVec3__SWIG_1(e1), true);
  }

  public static Vec3 createVec3(double[] es) {
    return new Vec3(opensimModelCommonJNI.ArrayDouble_createVec3__SWIG_2(es), true);
  }

  public Vector getAsVector() {
    return new Vector(opensimModelCommonJNI.ArrayDouble_getAsVector(swigCPtr, this), true);
  }

  public void populateFromVector(Vector aVector) {
    opensimModelCommonJNI.ArrayDouble_populateFromVector(swigCPtr, this, Vector.getCPtr(aVector), aVector);
  }

  public static ArrayDouble getValuesFromVec3(Vec3 vec3) {
    return new ArrayDouble(opensimModelCommonJNI.ArrayDouble_getValuesFromVec3(Vec3.getCPtr(vec3), vec3), true);
  }

  public String toString() {
    return opensimModelCommonJNI.ArrayDouble_toString(swigCPtr, this);
  }

}
