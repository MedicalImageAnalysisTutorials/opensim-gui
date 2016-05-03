/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Units {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Units(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Units obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_Units(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Units() {
    this(opensimModelCommonJNI.new_Units__SWIG_0(), true);
  }

  public Units(Units aUnits) {
    this(opensimModelCommonJNI.new_Units__SWIG_1(Units.getCPtr(aUnits), aUnits), true);
  }

  public Units(String aString) {
    this(opensimModelCommonJNI.new_Units__SWIG_2(aString), true);
  }

  public Units(Units.UnitType aType) {
    this(opensimModelCommonJNI.new_Units__SWIG_3(aType.swigValue()), true);
  }

  public double convertTo(Units.UnitType aType, double aValue) {
    return opensimModelCommonJNI.Units_convertTo__SWIG_0(swigCPtr, this, aType.swigValue(), aValue);
  }

  public double convertTo(Units.UnitType aType) {
    return opensimModelCommonJNI.Units_convertTo__SWIG_1(swigCPtr, this, aType.swigValue());
  }

  public double convertTo(Units aUnit) {
    return opensimModelCommonJNI.Units_convertTo__SWIG_2(swigCPtr, this, Units.getCPtr(aUnit), aUnit);
  }

  public Units.UnitType getType() {
    return Units.UnitType.swigToEnum(opensimModelCommonJNI.Units_getType(swigCPtr, this));
  }

  public String getLabel() {
    return opensimModelCommonJNI.Units_getLabel(swigCPtr, this);
  }

  public String getAbbreviation() {
    return opensimModelCommonJNI.Units_getAbbreviation(swigCPtr, this);
  }

  public final static class UnitType {
    public final static Units.UnitType UnknownUnits = new Units.UnitType("UnknownUnits", opensimModelCommonJNI.Units_UnknownUnits_get());
    public final static Units.UnitType Radians = new Units.UnitType("Radians");
    public final static Units.UnitType Degrees = new Units.UnitType("Degrees");
    public final static Units.UnitType Millimeters = new Units.UnitType("Millimeters");
    public final static Units.UnitType Centimeters = new Units.UnitType("Centimeters");
    public final static Units.UnitType Meters = new Units.UnitType("Meters");
    public final static Units.UnitType Seconds = new Units.UnitType("Seconds");
    public final static Units.UnitType Milliseconds = new Units.UnitType("Milliseconds");
    public final static Units.UnitType Newtons = new Units.UnitType("Newtons");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static UnitType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + UnitType.class + " with value " + swigValue);
    }

    private UnitType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private UnitType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private UnitType(String swigName, UnitType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static UnitType[] swigValues = { UnknownUnits, Radians, Degrees, Millimeters, Centimeters, Meters, Seconds, Milliseconds, Newtons };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
