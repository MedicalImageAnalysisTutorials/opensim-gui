/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ExternalLoads extends ModelComponentSetExternalForces {
  private long swigCPtr;

  public ExternalLoads(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ExternalLoads_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ExternalLoads obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ExternalLoads(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ExternalLoads() {
    this(opensimModelJNI.new_ExternalLoads__SWIG_0(), true);
  }

  public ExternalLoads(Model model) {
    this(opensimModelJNI.new_ExternalLoads__SWIG_1(Model.getCPtr(model), model), true);
  }

  public ExternalLoads(Model model, String aFileName, boolean aUpdateFromXMLNode) throws java.io.IOException {
    this(opensimModelJNI.new_ExternalLoads__SWIG_2(Model.getCPtr(model), model, aFileName, aUpdateFromXMLNode), true);
  }

  public ExternalLoads(Model model, String aFileName) throws java.io.IOException {
    this(opensimModelJNI.new_ExternalLoads__SWIG_3(Model.getCPtr(model), model, aFileName), true);
  }

  public ExternalLoads(ExternalLoads aExternalLoads) {
    this(opensimModelJNI.new_ExternalLoads__SWIG_4(ExternalLoads.getCPtr(aExternalLoads), aExternalLoads), true);
  }

  public OpenSimObject copy() {
    long cPtr = opensimModelJNI.ExternalLoads_copy(swigCPtr, this);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public void copyData(ExternalLoads otherExternalLoads) {
    opensimModelJNI.ExternalLoads_copyData(swigCPtr, this, ExternalLoads.getCPtr(otherExternalLoads), otherExternalLoads);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode, int versionNumber) {
    opensimModelJNI.ExternalLoads_updateFromXMLNode__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode), versionNumber);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode) {
    opensimModelJNI.ExternalLoads_updateFromXMLNode__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode));
  }

  public void setup(Model aModel) {
    opensimModelJNI.ExternalLoads_setup(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public Model getModel() {
    return new Model(opensimModelJNI.ExternalLoads_getModel(swigCPtr, this), false);
  }

  public String getDataFileName() {
    return opensimModelJNI.ExternalLoads_getDataFileName(swigCPtr, this);
  }

  public void setDataFileName(String aNewFile) {
    opensimModelJNI.ExternalLoads_setDataFileName(swigCPtr, this, aNewFile);
  }

  public String getExternalLoadsModelKinematicsFileName() {
    return opensimModelJNI.ExternalLoads_getExternalLoadsModelKinematicsFileName(swigCPtr, this);
  }

  public void setExternalLoadsModelKinematicsFileName(String aFileName) {
    opensimModelJNI.ExternalLoads_setExternalLoadsModelKinematicsFileName(swigCPtr, this, aFileName);
  }

  public double getLowpassCutoffFrequencyForLoadKinematics() {
    return opensimModelJNI.ExternalLoads_getLowpassCutoffFrequencyForLoadKinematics(swigCPtr, this);
  }

  public void setLowpassCutoffFrequencyForLoadKinematics(double aLowpassCutoffFrequency) {
    opensimModelJNI.ExternalLoads_setLowpassCutoffFrequencyForLoadKinematics(swigCPtr, this, aLowpassCutoffFrequency);
  }

  public void transformPointsExpressedInGroundToAppliedBodies(Storage kinematics, double startTime, double endTime) {
    opensimModelJNI.ExternalLoads_transformPointsExpressedInGroundToAppliedBodies__SWIG_0(swigCPtr, this, Storage.getCPtr(kinematics), kinematics, startTime, endTime);
  }

  public void transformPointsExpressedInGroundToAppliedBodies(Storage kinematics, double startTime) {
    opensimModelJNI.ExternalLoads_transformPointsExpressedInGroundToAppliedBodies__SWIG_1(swigCPtr, this, Storage.getCPtr(kinematics), kinematics, startTime);
  }

  public void transformPointsExpressedInGroundToAppliedBodies(Storage kinematics) {
    opensimModelJNI.ExternalLoads_transformPointsExpressedInGroundToAppliedBodies__SWIG_2(swigCPtr, this, Storage.getCPtr(kinematics), kinematics);
  }

  public ExternalForce transformPointExpressedInGroundToAppliedBody(ExternalForce exForce, Storage kinematics, double startTime, double endTime) {
    long cPtr = opensimModelJNI.ExternalLoads_transformPointExpressedInGroundToAppliedBody(swigCPtr, this, ExternalForce.getCPtr(exForce), exForce, Storage.getCPtr(kinematics), kinematics, startTime, endTime);
    return (cPtr == 0) ? null : new ExternalForce(cPtr, false);
  }

}