/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Umberger2010MuscleMetabolicsProbe extends Probe {
  private transient long swigCPtr;

  public Umberger2010MuscleMetabolicsProbe(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Umberger2010MuscleMetabolicsProbe obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_Umberger2010MuscleMetabolicsProbe(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Umberger2010MuscleMetabolicsProbe safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Umberger2010MuscleMetabolicsProbe(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Umberger2010MuscleMetabolicsProbe(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_activation_maintenance_rate_on(Umberger2010MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_copyProperty_activation_maintenance_rate_on(swigCPtr, this, Umberger2010MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public boolean get_activation_maintenance_rate_on(int i) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_activation_maintenance_rate_on__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_activation_maintenance_rate_on(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_activation_maintenance_rate_on__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_activation_maintenance_rate_on(int i, boolean value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_activation_maintenance_rate_on__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_activation_maintenance_rate_on(boolean value) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_append_activation_maintenance_rate_on(swigCPtr, this, value);
  }

  public void constructProperty_activation_maintenance_rate_on(boolean initValue) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_constructProperty_activation_maintenance_rate_on(swigCPtr, this, initValue);
  }

  public boolean get_activation_maintenance_rate_on() {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_activation_maintenance_rate_on__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_activation_maintenance_rate_on() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_activation_maintenance_rate_on__SWIG_1(swigCPtr, this), false);
  }

  public void set_activation_maintenance_rate_on(boolean value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_activation_maintenance_rate_on__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_shortening_rate_on(Umberger2010MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_copyProperty_shortening_rate_on(swigCPtr, this, Umberger2010MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public boolean get_shortening_rate_on(int i) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_shortening_rate_on__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_shortening_rate_on(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_shortening_rate_on__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_shortening_rate_on(int i, boolean value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_shortening_rate_on__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_shortening_rate_on(boolean value) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_append_shortening_rate_on(swigCPtr, this, value);
  }

  public void constructProperty_shortening_rate_on(boolean initValue) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_constructProperty_shortening_rate_on(swigCPtr, this, initValue);
  }

  public boolean get_shortening_rate_on() {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_shortening_rate_on__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_shortening_rate_on() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_shortening_rate_on__SWIG_1(swigCPtr, this), false);
  }

  public void set_shortening_rate_on(boolean value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_shortening_rate_on__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_basal_rate_on(Umberger2010MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_copyProperty_basal_rate_on(swigCPtr, this, Umberger2010MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public boolean get_basal_rate_on(int i) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_basal_rate_on__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_basal_rate_on(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_basal_rate_on__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_basal_rate_on(int i, boolean value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_basal_rate_on__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_basal_rate_on(boolean value) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_append_basal_rate_on(swigCPtr, this, value);
  }

  public void constructProperty_basal_rate_on(boolean initValue) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_constructProperty_basal_rate_on(swigCPtr, this, initValue);
  }

  public boolean get_basal_rate_on() {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_basal_rate_on__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_basal_rate_on() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_basal_rate_on__SWIG_1(swigCPtr, this), false);
  }

  public void set_basal_rate_on(boolean value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_basal_rate_on__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_mechanical_work_rate_on(Umberger2010MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_copyProperty_mechanical_work_rate_on(swigCPtr, this, Umberger2010MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public boolean get_mechanical_work_rate_on(int i) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_mechanical_work_rate_on__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_mechanical_work_rate_on(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_mechanical_work_rate_on__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_mechanical_work_rate_on(int i, boolean value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_mechanical_work_rate_on__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_mechanical_work_rate_on(boolean value) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_append_mechanical_work_rate_on(swigCPtr, this, value);
  }

  public void constructProperty_mechanical_work_rate_on(boolean initValue) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_constructProperty_mechanical_work_rate_on(swigCPtr, this, initValue);
  }

  public boolean get_mechanical_work_rate_on() {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_mechanical_work_rate_on__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_mechanical_work_rate_on() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_mechanical_work_rate_on__SWIG_1(swigCPtr, this), false);
  }

  public void set_mechanical_work_rate_on(boolean value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_mechanical_work_rate_on__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_enforce_minimum_heat_rate_per_muscle(Umberger2010MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_copyProperty_enforce_minimum_heat_rate_per_muscle(swigCPtr, this, Umberger2010MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public boolean get_enforce_minimum_heat_rate_per_muscle(int i) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_enforce_minimum_heat_rate_per_muscle__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_enforce_minimum_heat_rate_per_muscle(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_enforce_minimum_heat_rate_per_muscle__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_enforce_minimum_heat_rate_per_muscle(int i, boolean value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_enforce_minimum_heat_rate_per_muscle__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_enforce_minimum_heat_rate_per_muscle(boolean value) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_append_enforce_minimum_heat_rate_per_muscle(swigCPtr, this, value);
  }

  public void constructProperty_enforce_minimum_heat_rate_per_muscle(boolean initValue) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_constructProperty_enforce_minimum_heat_rate_per_muscle(swigCPtr, this, initValue);
  }

  public boolean get_enforce_minimum_heat_rate_per_muscle() {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_enforce_minimum_heat_rate_per_muscle__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_enforce_minimum_heat_rate_per_muscle() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_enforce_minimum_heat_rate_per_muscle__SWIG_1(swigCPtr, this), false);
  }

  public void set_enforce_minimum_heat_rate_per_muscle(boolean value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_enforce_minimum_heat_rate_per_muscle__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_aerobic_factor(Umberger2010MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_copyProperty_aerobic_factor(swigCPtr, this, Umberger2010MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public double get_aerobic_factor(int i) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_aerobic_factor__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_aerobic_factor(int i) {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_aerobic_factor__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_aerobic_factor(int i, double value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_aerobic_factor__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_aerobic_factor(double value) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_append_aerobic_factor(swigCPtr, this, value);
  }

  public void constructProperty_aerobic_factor(double initValue) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_constructProperty_aerobic_factor(swigCPtr, this, initValue);
  }

  public double get_aerobic_factor() {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_aerobic_factor__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_aerobic_factor() {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_aerobic_factor__SWIG_1(swigCPtr, this), false);
  }

  public void set_aerobic_factor(double value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_aerobic_factor__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_basal_coefficient(Umberger2010MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_copyProperty_basal_coefficient(swigCPtr, this, Umberger2010MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public double get_basal_coefficient(int i) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_basal_coefficient__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_basal_coefficient(int i) {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_basal_coefficient__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_basal_coefficient(int i, double value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_basal_coefficient__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_basal_coefficient(double value) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_append_basal_coefficient(swigCPtr, this, value);
  }

  public void constructProperty_basal_coefficient(double initValue) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_constructProperty_basal_coefficient(swigCPtr, this, initValue);
  }

  public double get_basal_coefficient() {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_basal_coefficient__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_basal_coefficient() {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_basal_coefficient__SWIG_1(swigCPtr, this), false);
  }

  public void set_basal_coefficient(double value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_basal_coefficient__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_basal_exponent(Umberger2010MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_copyProperty_basal_exponent(swigCPtr, this, Umberger2010MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public double get_basal_exponent(int i) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_basal_exponent__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_basal_exponent(int i) {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_basal_exponent__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_basal_exponent(int i, double value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_basal_exponent__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_basal_exponent(double value) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_append_basal_exponent(swigCPtr, this, value);
  }

  public void constructProperty_basal_exponent(double initValue) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_constructProperty_basal_exponent(swigCPtr, this, initValue);
  }

  public double get_basal_exponent() {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_basal_exponent__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_basal_exponent() {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_basal_exponent__SWIG_1(swigCPtr, this), false);
  }

  public void set_basal_exponent(double value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_basal_exponent__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_muscle_effort_scaling_factor(Umberger2010MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_copyProperty_muscle_effort_scaling_factor(swigCPtr, this, Umberger2010MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public double get_muscle_effort_scaling_factor(int i) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_muscle_effort_scaling_factor__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_muscle_effort_scaling_factor(int i) {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_muscle_effort_scaling_factor__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_muscle_effort_scaling_factor(int i, double value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_muscle_effort_scaling_factor__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_muscle_effort_scaling_factor(double value) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_append_muscle_effort_scaling_factor(swigCPtr, this, value);
  }

  public void constructProperty_muscle_effort_scaling_factor(double initValue) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_constructProperty_muscle_effort_scaling_factor(swigCPtr, this, initValue);
  }

  public double get_muscle_effort_scaling_factor() {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_muscle_effort_scaling_factor__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_muscle_effort_scaling_factor() {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_muscle_effort_scaling_factor__SWIG_1(swigCPtr, this), false);
  }

  public void set_muscle_effort_scaling_factor(double value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_muscle_effort_scaling_factor__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_use_Bhargava_recruitment_model(Umberger2010MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_copyProperty_use_Bhargava_recruitment_model(swigCPtr, this, Umberger2010MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public boolean get_use_Bhargava_recruitment_model(int i) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_use_Bhargava_recruitment_model__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_use_Bhargava_recruitment_model(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_use_Bhargava_recruitment_model__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_use_Bhargava_recruitment_model(int i, boolean value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_use_Bhargava_recruitment_model__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_use_Bhargava_recruitment_model(boolean value) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_append_use_Bhargava_recruitment_model(swigCPtr, this, value);
  }

  public void constructProperty_use_Bhargava_recruitment_model(boolean initValue) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_constructProperty_use_Bhargava_recruitment_model(swigCPtr, this, initValue);
  }

  public boolean get_use_Bhargava_recruitment_model() {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_use_Bhargava_recruitment_model__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_use_Bhargava_recruitment_model() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_use_Bhargava_recruitment_model__SWIG_1(swigCPtr, this), false);
  }

  public void set_use_Bhargava_recruitment_model(boolean value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_use_Bhargava_recruitment_model__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_include_negative_mechanical_work(Umberger2010MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_copyProperty_include_negative_mechanical_work(swigCPtr, this, Umberger2010MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public boolean get_include_negative_mechanical_work(int i) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_include_negative_mechanical_work__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_include_negative_mechanical_work(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_include_negative_mechanical_work__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_include_negative_mechanical_work(int i, boolean value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_include_negative_mechanical_work__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_include_negative_mechanical_work(boolean value) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_append_include_negative_mechanical_work(swigCPtr, this, value);
  }

  public void constructProperty_include_negative_mechanical_work(boolean initValue) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_constructProperty_include_negative_mechanical_work(swigCPtr, this, initValue);
  }

  public boolean get_include_negative_mechanical_work() {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_include_negative_mechanical_work__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_include_negative_mechanical_work() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_include_negative_mechanical_work__SWIG_1(swigCPtr, this), false);
  }

  public void set_include_negative_mechanical_work(boolean value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_include_negative_mechanical_work__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_forbid_negative_total_power(Umberger2010MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_copyProperty_forbid_negative_total_power(swigCPtr, this, Umberger2010MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public boolean get_forbid_negative_total_power(int i) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_forbid_negative_total_power__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_forbid_negative_total_power(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_forbid_negative_total_power__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_forbid_negative_total_power(int i, boolean value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_forbid_negative_total_power__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_forbid_negative_total_power(boolean value) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_append_forbid_negative_total_power(swigCPtr, this, value);
  }

  public void constructProperty_forbid_negative_total_power(boolean initValue) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_constructProperty_forbid_negative_total_power(swigCPtr, this, initValue);
  }

  public boolean get_forbid_negative_total_power() {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_forbid_negative_total_power__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_forbid_negative_total_power() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_forbid_negative_total_power__SWIG_1(swigCPtr, this), false);
  }

  public void set_forbid_negative_total_power(boolean value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_forbid_negative_total_power__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_report_total_metabolics_only(Umberger2010MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_copyProperty_report_total_metabolics_only(swigCPtr, this, Umberger2010MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public boolean get_report_total_metabolics_only(int i) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_report_total_metabolics_only__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_report_total_metabolics_only(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_report_total_metabolics_only__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_report_total_metabolics_only(int i, boolean value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_report_total_metabolics_only__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_report_total_metabolics_only(boolean value) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_append_report_total_metabolics_only(swigCPtr, this, value);
  }

  public void constructProperty_report_total_metabolics_only(boolean initValue) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_constructProperty_report_total_metabolics_only(swigCPtr, this, initValue);
  }

  public boolean get_report_total_metabolics_only() {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_report_total_metabolics_only__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_report_total_metabolics_only() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_report_total_metabolics_only__SWIG_1(swigCPtr, this), false);
  }

  public void set_report_total_metabolics_only(boolean value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_report_total_metabolics_only__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet(Umberger2010MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_copyProperty_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet(swigCPtr, this, Umberger2010MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet get_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet(int i) {
    return new Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet__SWIG_0(swigCPtr, this, i), false);
  }

  public Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet upd_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet(int i) {
    return new Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet(int i, Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet__SWIG_0(swigCPtr, this, i, Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet.getCPtr(value), value);
  }

  public int append_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet(Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet value) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_append_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet(swigCPtr, this, Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet.getCPtr(value), value);
  }

  public void constructProperty_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet(Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet initValue) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_constructProperty_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet(swigCPtr, this, Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet.getCPtr(initValue), initValue);
  }

  public Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet get_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet() {
    return new Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_get_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet__SWIG_1(swigCPtr, this), false);
  }

  public Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet upd_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet() {
    return new Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_upd_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet__SWIG_1(swigCPtr, this), false);
  }

  public void set_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet(Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet value) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_set_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet__SWIG_1(swigCPtr, this, Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameterSet.getCPtr(value), value);
  }

  public Umberger2010MuscleMetabolicsProbe() {
    this(opensimModelSimulationJNI.new_Umberger2010MuscleMetabolicsProbe__SWIG_0(), true);
  }

  public Umberger2010MuscleMetabolicsProbe(boolean activation_maintenance_rate_on, boolean shortening_rate_on, boolean basal_rate_on, boolean work_rate_on) {
    this(opensimModelSimulationJNI.new_Umberger2010MuscleMetabolicsProbe__SWIG_1(activation_maintenance_rate_on, shortening_rate_on, basal_rate_on, work_rate_on), true);
  }

  public Vector computeProbeInputs(State state) {
    return new Vector(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_computeProbeInputs(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public int getNumProbeInputs() {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_getNumProbeInputs(swigCPtr, this);
  }

  public ArrayStr getProbeOutputLabels() {
    return new ArrayStr(opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_getProbeOutputLabels(swigCPtr, this), true);
  }

  public int getNumMetabolicMuscles() {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_getNumMetabolicMuscles(swigCPtr, this);
  }

  public void addMuscle(String muscleName, double ratio_slow_twitch_fibers) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_addMuscle__SWIG_0(swigCPtr, this, muscleName, ratio_slow_twitch_fibers);
  }

  public void addMuscle(String muscleName, double ratio_slow_twitch_fibers, double muscle_mass) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_addMuscle__SWIG_1(swigCPtr, this, muscleName, ratio_slow_twitch_fibers, muscle_mass);
  }

  public void removeMuscle(String muscleName) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_removeMuscle(swigCPtr, this, muscleName);
  }

  public void useProvidedMass(String muscleName, double providedMass) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_useProvidedMass(swigCPtr, this, muscleName, providedMass);
  }

  public void useCalculatedMass(String muscleName) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_useCalculatedMass(swigCPtr, this, muscleName);
  }

  public boolean isUsingProvidedMass(String muscleName) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_isUsingProvidedMass(swigCPtr, this, muscleName);
  }

  public double getMuscleMass(String muscleName) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_getMuscleMass(swigCPtr, this, muscleName);
  }

  public double getRatioSlowTwitchFibers(String muscleName) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_getRatioSlowTwitchFibers(swigCPtr, this, muscleName);
  }

  public void setRatioSlowTwitchFibers(String muscleName, double ratio) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_setRatioSlowTwitchFibers(swigCPtr, this, muscleName, ratio);
  }

  public double getDensity(String muscleName) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_getDensity(swigCPtr, this, muscleName);
  }

  public void setDensity(String muscleName, double density) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_setDensity(swigCPtr, this, muscleName, density);
  }

  public double getSpecificTension(String muscleName) {
    return opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_getSpecificTension(swigCPtr, this, muscleName);
  }

  public void setSpecificTension(String muscleName, double specificTension) {
    opensimModelSimulationJNI.Umberger2010MuscleMetabolicsProbe_setSpecificTension(swigCPtr, this, muscleName, specificTension);
  }

}
