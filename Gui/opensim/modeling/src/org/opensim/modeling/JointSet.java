/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class JointSet extends ModelComponentSetJoints {
  private transient long swigCPtr;

  public JointSet(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.JointSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(JointSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_JointSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static JointSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.JointSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new JointSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.JointSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.JointSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.JointSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new JointSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.JointSet_getConcreteClassName(swigCPtr, this);
  }

  public JointSet() {
    this(opensimModelSimulationJNI.new_JointSet__SWIG_0(), true);
  }

  public JointSet(Model model) {
    this(opensimModelSimulationJNI.new_JointSet__SWIG_1(Model.getCPtr(model), model), true);
  }

  public JointSet(JointSet aJointSet) {
    this(opensimModelSimulationJNI.new_JointSet__SWIG_2(JointSet.getCPtr(aJointSet), aJointSet), true);
  }

  public JointSet(Model model, String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimModelSimulationJNI.new_JointSet__SWIG_3(Model.getCPtr(model), model, aFileName, aUpdateFromXMLNode), true);
  }

  public JointSet(Model model, String aFileName) {
    this(opensimModelSimulationJNI.new_JointSet__SWIG_4(Model.getCPtr(model), model, aFileName), true);
  }

  public void scale(ScaleSet aScaleSet) {
    opensimModelSimulationJNI.JointSet_scale(swigCPtr, this, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

}
