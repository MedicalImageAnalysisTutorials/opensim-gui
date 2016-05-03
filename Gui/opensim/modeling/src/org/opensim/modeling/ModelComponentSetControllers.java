/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentSetControllers extends SetControllers {
  private transient long swigCPtr;

  public ModelComponentSetControllers(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.ModelComponentSetControllers_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentSetControllers obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_ModelComponentSetControllers(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelComponentSetControllers safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.ModelComponentSetControllers_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelComponentSetControllers(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.ModelComponentSetControllers_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.ModelComponentSetControllers_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.ModelComponentSetControllers_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponentSetControllers(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.ModelComponentSetControllers_getConcreteClassName(swigCPtr, this);
  }

  public ModelComponentSetControllers() {
    this(opensimModelSimulationJNI.new_ModelComponentSetControllers__SWIG_0(), true);
  }

  public ModelComponentSetControllers(Model model) {
    this(opensimModelSimulationJNI.new_ModelComponentSetControllers__SWIG_1(Model.getCPtr(model), model), true);
  }

  public ModelComponentSetControllers(Model model, String fileName, boolean aUpdateFromXMLNode) {
    this(opensimModelSimulationJNI.new_ModelComponentSetControllers__SWIG_2(Model.getCPtr(model), model, fileName, aUpdateFromXMLNode), true);
  }

  public ModelComponentSetControllers(Model model, String fileName) {
    this(opensimModelSimulationJNI.new_ModelComponentSetControllers__SWIG_3(Model.getCPtr(model), model, fileName), true);
  }

  public ModelComponentSetControllers(ModelComponentSetControllers source) {
    this(opensimModelSimulationJNI.new_ModelComponentSetControllers__SWIG_4(ModelComponentSetControllers.getCPtr(source), source), true);
  }

  public boolean insert(int aIndex, Controller aObject) {
    return opensimModelSimulationJNI.ModelComponentSetControllers_insert(swigCPtr, this, aIndex, Controller.getCPtr(aObject), aObject);
  }

  public boolean set(int aIndex, Controller aObject, boolean preserveGroups) {
    return opensimModelSimulationJNI.ModelComponentSetControllers_set__SWIG_0(swigCPtr, this, aIndex, Controller.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Controller aObject) {
    return opensimModelSimulationJNI.ModelComponentSetControllers_set__SWIG_1(swigCPtr, this, aIndex, Controller.getCPtr(aObject), aObject);
  }

  public void invokeConnectToModel(Model model) {
    opensimModelSimulationJNI.ModelComponentSetControllers_invokeConnectToModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  public void invokeInitStateFromProperties(State state) {
    opensimModelSimulationJNI.ModelComponentSetControllers_invokeInitStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void invokeSetPropertiesFromState(State state) {
    opensimModelSimulationJNI.ModelComponentSetControllers_invokeSetPropertiesFromState(swigCPtr, this, State.getCPtr(state), state);
  }

  public void invokeGenerateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelSimulationJNI.ModelComponentSetControllers_invokeGenerateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

}
