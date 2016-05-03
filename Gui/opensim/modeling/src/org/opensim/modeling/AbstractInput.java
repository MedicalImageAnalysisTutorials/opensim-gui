/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class AbstractInput extends AbstractConnector {
  private transient long swigCPtr;

  public AbstractInput(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.AbstractInput_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(AbstractInput obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_AbstractInput(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static AbstractInput safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelCommonJNI.AbstractInput_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new AbstractInput(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelCommonJNI.AbstractInput_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelCommonJNI.AbstractInput_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelCommonJNI.AbstractInput_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new AbstractInput(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelCommonJNI.AbstractInput_getConcreteClassName(swigCPtr, this);
  }

  public void connect(OpenSimObject object) {
    opensimModelCommonJNI.AbstractInput_connect__SWIG_0(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public void connect(AbstractOutput output, String annotation) {
    opensimModelCommonJNI.AbstractInput_connect__SWIG_1(swigCPtr, this, AbstractOutput.getCPtr(output), output, annotation);
  }

  public void connect(AbstractOutput output) {
    opensimModelCommonJNI.AbstractInput_connect__SWIG_2(swigCPtr, this, AbstractOutput.getCPtr(output), output);
  }

  public void connect(AbstractChannel channel, String annotation) {
    opensimModelCommonJNI.AbstractInput_connect__SWIG_3(swigCPtr, this, AbstractChannel.getCPtr(channel), channel, annotation);
  }

  public void connect(AbstractChannel channel) {
    opensimModelCommonJNI.AbstractInput_connect__SWIG_4(swigCPtr, this, AbstractChannel.getCPtr(channel), channel);
  }

  public String getAnnotation() {
    return opensimModelCommonJNI.AbstractInput_getAnnotation__SWIG_0(swigCPtr, this);
  }

  public String getAnnotation(long index) {
    return opensimModelCommonJNI.AbstractInput_getAnnotation__SWIG_1(swigCPtr, this, index);
  }

  public static boolean parseConnecteeName(String connecteeName, SWIGTYPE_p_std__string outputPath, SWIGTYPE_p_std__string channelName, SWIGTYPE_p_std__string annotation) {
    return opensimModelCommonJNI.AbstractInput_parseConnecteeName(connecteeName, SWIGTYPE_p_std__string.getCPtr(outputPath), SWIGTYPE_p_std__string.getCPtr(channelName), SWIGTYPE_p_std__string.getCPtr(annotation));
  }

}
