/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class STOFileAdapter {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public STOFileAdapter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(STOFileAdapter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_STOFileAdapter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public STOFileAdapter() {
    this(opensimModelCommonJNI.new_STOFileAdapter__SWIG_0(), true);
  }

  public STOFileAdapter(STOFileAdapter arg0) {
    this(opensimModelCommonJNI.new_STOFileAdapter__SWIG_1(STOFileAdapter.getCPtr(arg0), arg0), true);
  }

  public STOFileAdapter clone() {
    long cPtr = opensimModelCommonJNI.STOFileAdapter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new STOFileAdapter(cPtr, true);
  }

  public static TimeSeriesTable read(String fileName) {
    return new TimeSeriesTable(opensimModelCommonJNI.STOFileAdapter_read(fileName), true);
  }

  public static void write(TimeSeriesTable table, String fileName) {
    opensimModelCommonJNI.STOFileAdapter_write(TimeSeriesTable.getCPtr(table), table, fileName);
  }

}
