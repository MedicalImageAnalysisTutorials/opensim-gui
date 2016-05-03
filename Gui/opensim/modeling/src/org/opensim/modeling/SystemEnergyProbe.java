/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SystemEnergyProbe extends Probe {
  private transient long swigCPtr;

  public SystemEnergyProbe(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.SystemEnergyProbe_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SystemEnergyProbe obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_SystemEnergyProbe(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SystemEnergyProbe safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.SystemEnergyProbe_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SystemEnergyProbe(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.SystemEnergyProbe_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.SystemEnergyProbe_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.SystemEnergyProbe_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SystemEnergyProbe(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.SystemEnergyProbe_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_compute_kinetic_energy(SystemEnergyProbe source) {
    opensimModelSimulationJNI.SystemEnergyProbe_copyProperty_compute_kinetic_energy(swigCPtr, this, SystemEnergyProbe.getCPtr(source), source);
  }

  public boolean get_compute_kinetic_energy(int i) {
    return opensimModelSimulationJNI.SystemEnergyProbe_get_compute_kinetic_energy__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_compute_kinetic_energy(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.SystemEnergyProbe_upd_compute_kinetic_energy__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_compute_kinetic_energy(int i, boolean value) {
    opensimModelSimulationJNI.SystemEnergyProbe_set_compute_kinetic_energy__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_compute_kinetic_energy(boolean value) {
    return opensimModelSimulationJNI.SystemEnergyProbe_append_compute_kinetic_energy(swigCPtr, this, value);
  }

  public void constructProperty_compute_kinetic_energy(boolean initValue) {
    opensimModelSimulationJNI.SystemEnergyProbe_constructProperty_compute_kinetic_energy(swigCPtr, this, initValue);
  }

  public boolean get_compute_kinetic_energy() {
    return opensimModelSimulationJNI.SystemEnergyProbe_get_compute_kinetic_energy__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_compute_kinetic_energy() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.SystemEnergyProbe_upd_compute_kinetic_energy__SWIG_1(swigCPtr, this), false);
  }

  public void set_compute_kinetic_energy(boolean value) {
    opensimModelSimulationJNI.SystemEnergyProbe_set_compute_kinetic_energy__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_compute_potential_energy(SystemEnergyProbe source) {
    opensimModelSimulationJNI.SystemEnergyProbe_copyProperty_compute_potential_energy(swigCPtr, this, SystemEnergyProbe.getCPtr(source), source);
  }

  public boolean get_compute_potential_energy(int i) {
    return opensimModelSimulationJNI.SystemEnergyProbe_get_compute_potential_energy__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_compute_potential_energy(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.SystemEnergyProbe_upd_compute_potential_energy__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_compute_potential_energy(int i, boolean value) {
    opensimModelSimulationJNI.SystemEnergyProbe_set_compute_potential_energy__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_compute_potential_energy(boolean value) {
    return opensimModelSimulationJNI.SystemEnergyProbe_append_compute_potential_energy(swigCPtr, this, value);
  }

  public void constructProperty_compute_potential_energy(boolean initValue) {
    opensimModelSimulationJNI.SystemEnergyProbe_constructProperty_compute_potential_energy(swigCPtr, this, initValue);
  }

  public boolean get_compute_potential_energy() {
    return opensimModelSimulationJNI.SystemEnergyProbe_get_compute_potential_energy__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_compute_potential_energy() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.SystemEnergyProbe_upd_compute_potential_energy__SWIG_1(swigCPtr, this), false);
  }

  public void set_compute_potential_energy(boolean value) {
    opensimModelSimulationJNI.SystemEnergyProbe_set_compute_potential_energy__SWIG_1(swigCPtr, this, value);
  }

  public SystemEnergyProbe() {
    this(opensimModelSimulationJNI.new_SystemEnergyProbe__SWIG_0(), true);
  }

  public SystemEnergyProbe(boolean computeKE, boolean computePE) {
    this(opensimModelSimulationJNI.new_SystemEnergyProbe__SWIG_1(computeKE, computePE), true);
  }

  public boolean getComputeKineticEnergy() {
    return opensimModelSimulationJNI.SystemEnergyProbe_getComputeKineticEnergy(swigCPtr, this);
  }

  public boolean getComputePotentialEnergy() {
    return opensimModelSimulationJNI.SystemEnergyProbe_getComputePotentialEnergy(swigCPtr, this);
  }

  public void setComputeKineticEnergy(boolean c) {
    opensimModelSimulationJNI.SystemEnergyProbe_setComputeKineticEnergy(swigCPtr, this, c);
  }

  public void setComputePotentialEnergy(boolean c) {
    opensimModelSimulationJNI.SystemEnergyProbe_setComputePotentialEnergy(swigCPtr, this, c);
  }

  public Vector computeProbeInputs(State state) {
    return new Vector(opensimModelSimulationJNI.SystemEnergyProbe_computeProbeInputs(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public int getNumProbeInputs() {
    return opensimModelSimulationJNI.SystemEnergyProbe_getNumProbeInputs(swigCPtr, this);
  }

  public ArrayStr getProbeOutputLabels() {
    return new ArrayStr(opensimModelSimulationJNI.SystemEnergyProbe_getProbeOutputLabels(swigCPtr, this), true);
  }

}
