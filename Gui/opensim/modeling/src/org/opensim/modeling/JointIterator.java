/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class JointIterator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public JointIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(JointIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_JointIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(JointIterator other) {
    return opensimSimulationJNI.JointIterator_equals(swigCPtr, this, JointIterator.getCPtr(other), other);
  }

  public Joint __ref__() {
    return new Joint(opensimSimulationJNI.JointIterator___ref__(swigCPtr, this), false);
  }

  public Joint __deref__() {
    long cPtr = opensimSimulationJNI.JointIterator___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new Joint(cPtr, false);
  }

  public JointIterator next() {
    return new JointIterator(opensimSimulationJNI.JointIterator_next(swigCPtr, this), false);
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.JointIterator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Joint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.JointIterator_getConcreteClassName(swigCPtr, this);
  }

  public Coordinate get_coordinates(int i) {
    return new Coordinate(opensimSimulationJNI.JointIterator_get_coordinates(swigCPtr, this, i), false);
  }

  public PhysicalOffsetFrame get_frames(int i) {
    return new PhysicalOffsetFrame(opensimSimulationJNI.JointIterator_get_frames(swigCPtr, this, i), false);
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_socket_parent_frame_connectee_name() {
    return new SWIGTYPE_p_PropertyIndex(opensimSimulationJNI.JointIterator_PropertyIndex_socket_parent_frame_connectee_name_get(swigCPtr, this), true);
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_socket_child_frame_connectee_name() {
    return new SWIGTYPE_p_PropertyIndex(opensimSimulationJNI.JointIterator_PropertyIndex_socket_child_frame_connectee_name_get(swigCPtr, this), true);
  }

  public boolean get_has_output_power() {
    return opensimSimulationJNI.JointIterator__has_output_power_get(swigCPtr, this);
  }

  public boolean get_has_output_reaction_on_parent() {
    return opensimSimulationJNI.JointIterator__has_output_reaction_on_parent_get(swigCPtr, this);
  }

  public boolean get_has_output_reaction_on_child() {
    return opensimSimulationJNI.JointIterator__has_output_reaction_on_child_get(swigCPtr, this);
  }

  public PhysicalFrame getChildFrame() {
    return new PhysicalFrame(opensimSimulationJNI.JointIterator_getChildFrame(swigCPtr, this), false);
  }

  public PhysicalFrame getParentFrame() {
    return new PhysicalFrame(opensimSimulationJNI.JointIterator_getParentFrame(swigCPtr, this), false);
  }

  public Coordinate getCoordinate() {
    return new Coordinate(opensimSimulationJNI.JointIterator_getCoordinate(swigCPtr, this), false);
  }

  public int numCoordinates() {
    return opensimSimulationJNI.JointIterator_numCoordinates(swigCPtr, this);
  }

  public boolean isCoordinateUsed(Coordinate aCoordinate) {
    return opensimSimulationJNI.JointIterator_isCoordinateUsed(swigCPtr, this, Coordinate.getCPtr(aCoordinate), aCoordinate);
  }

  public SpatialVec calcEquivalentSpatialForce(State state, Vector mobilityForces) {
    return new SpatialVec(opensimSimulationJNI.JointIterator_calcEquivalentSpatialForce(swigCPtr, this, State.getCPtr(state), state, Vector.getCPtr(mobilityForces), mobilityForces), true);
  }

  public SpatialVec calcReactionOnParentExpressedInGround(State state) {
    return new SpatialVec(opensimSimulationJNI.JointIterator_calcReactionOnParentExpressedInGround(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public SpatialVec calcReactionOnChildExpressedInGround(State state) {
    return new SpatialVec(opensimSimulationJNI.JointIterator_calcReactionOnChildExpressedInGround(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public double calcPower(State s) {
    return opensimSimulationJNI.JointIterator_calcPower(swigCPtr, this, State.getCPtr(s), s);
  }

  public Model getModel() {
    return new Model(opensimSimulationJNI.JointIterator_getModel(swigCPtr, this), false);
  }

  public void addToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimSimulationJNI.JointIterator_addToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void initStateFromProperties(State state) {
    opensimSimulationJNI.JointIterator_initStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimSimulationJNI.JointIterator_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem getSystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimSimulationJNI.JointIterator_getSystem(swigCPtr, this), false);
  }

  public boolean hasSystem() {
    return opensimSimulationJNI.JointIterator_hasSystem(swigCPtr, this);
  }

  public String getAbsolutePathString() {
    return opensimSimulationJNI.JointIterator_getAbsolutePathString(swigCPtr, this);
  }

  public SWIGTYPE_p_ComponentPath getAbsolutePath() {
    return new SWIGTYPE_p_ComponentPath(opensimSimulationJNI.JointIterator_getAbsolutePath(swigCPtr, this), true);
  }

  public String getRelativePathName(Component wrt) {
    return opensimSimulationJNI.JointIterator_getRelativePathName(swigCPtr, this, Component.getCPtr(wrt), wrt);
  }

  public boolean hasComponent(String pathname) {
    return opensimSimulationJNI.JointIterator_hasComponent(swigCPtr, this, pathname);
  }

  public Component getComponent(String pathname) {
    return new Component(opensimSimulationJNI.JointIterator_getComponent(swigCPtr, this, pathname), false);
  }

  public long printComponentsMatching(String substring) {
    return opensimSimulationJNI.JointIterator_printComponentsMatching(swigCPtr, this, substring);
  }

  public int getNumStateVariables() {
    return opensimSimulationJNI.JointIterator_getNumStateVariables(swigCPtr, this);
  }

  public ArrayStr getStateVariableNames() {
    return new ArrayStr(opensimSimulationJNI.JointIterator_getStateVariableNames(swigCPtr, this), true);
  }

  public int getNumSockets() {
    return opensimSimulationJNI.JointIterator_getNumSockets(swigCPtr, this);
  }

  public OpenSimObject getConnectee(String name) {
    return new OpenSimObject(opensimSimulationJNI.JointIterator_getConnectee(swigCPtr, this, name), false);
  }

  public AbstractSocket getSocket(String name) {
    return new AbstractSocket(opensimSimulationJNI.JointIterator_getSocket(swigCPtr, this, name), false);
  }

  public int getNumInputs() {
    return opensimSimulationJNI.JointIterator_getNumInputs(swigCPtr, this);
  }

  public int getNumOutputs() {
    return opensimSimulationJNI.JointIterator_getNumOutputs(swigCPtr, this);
  }

  public StdVectorString getInputNames() {
    return new StdVectorString(opensimSimulationJNI.JointIterator_getInputNames(swigCPtr, this), true);
  }

  public StdVectorString getOutputNames() {
    return new StdVectorString(opensimSimulationJNI.JointIterator_getOutputNames(swigCPtr, this), true);
  }

  public AbstractInput getInput(String name) {
    return new AbstractInput(opensimSimulationJNI.JointIterator_getInput(swigCPtr, this, name), false);
  }

  public AbstractOutput getOutput(String name) {
    return new AbstractOutput(opensimSimulationJNI.JointIterator_getOutput(swigCPtr, this, name), false);
  }

  public int getModelingOption(State state, String name) {
    return opensimSimulationJNI.JointIterator_getModelingOption(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setModelingOption(State state, String name, int flag) {
    opensimSimulationJNI.JointIterator_setModelingOption(swigCPtr, this, State.getCPtr(state), state, name, flag);
  }

  public double getStateVariableValue(State state, String name) {
    return opensimSimulationJNI.JointIterator_getStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setStateVariableValue(State state, String name, double value) {
    opensimSimulationJNI.JointIterator_setStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public Vector getStateVariableValues(State state) {
    return new Vector(opensimSimulationJNI.JointIterator_getStateVariableValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public void setStateVariableValues(State state, Vector values) {
    opensimSimulationJNI.JointIterator_setStateVariableValues(swigCPtr, this, State.getCPtr(state), state, Vector.getCPtr(values), values);
  }

  public double getStateVariableDerivativeValue(State state, String name) {
    return opensimSimulationJNI.JointIterator_getStateVariableDerivativeValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public double getDiscreteVariableValue(State state, String name) {
    return opensimSimulationJNI.JointIterator_getDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setDiscreteVariableValue(State state, String name, double value) {
    opensimSimulationJNI.JointIterator_setDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public void markCacheVariableValid(State state, String name) {
    opensimSimulationJNI.JointIterator_markCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void markCacheVariableInvalid(State state, String name) {
    opensimSimulationJNI.JointIterator_markCacheVariableInvalid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public boolean isCacheVariableValid(State state, String name) {
    return opensimSimulationJNI.JointIterator_isCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void printSubcomponentInfo() {
    opensimSimulationJNI.JointIterator_printSubcomponentInfo(swigCPtr, this);
  }

  public void printSocketInfo() {
    opensimSimulationJNI.JointIterator_printSocketInfo(swigCPtr, this);
  }

  public void printInputInfo() {
    opensimSimulationJNI.JointIterator_printInputInfo(swigCPtr, this);
  }

  public void printOutputInfo(boolean includeDescendants) {
    opensimSimulationJNI.JointIterator_printOutputInfo__SWIG_0(swigCPtr, this, includeDescendants);
  }

  public void printOutputInfo() {
    opensimSimulationJNI.JointIterator_printOutputInfo__SWIG_1(swigCPtr, this);
  }

  public Component getOwner() {
    return new Component(opensimSimulationJNI.JointIterator_getOwner(swigCPtr, this), false);
  }

  public boolean hasOwner() {
    return opensimSimulationJNI.JointIterator_hasOwner(swigCPtr, this);
  }

  public ComponentsList getComponentsList() {
    return new ComponentsList(opensimSimulationJNI.JointIterator_getComponentsList(swigCPtr, this), true);
  }

  public boolean isEqualTo(OpenSimObject aObject) {
    return opensimSimulationJNI.JointIterator_isEqualTo(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public String getName() {
    return opensimSimulationJNI.JointIterator_getName(swigCPtr, this);
  }

  public String getDescription() {
    return opensimSimulationJNI.JointIterator_getDescription(swigCPtr, this);
  }

  public String getAuthors() {
    return opensimSimulationJNI.JointIterator_getAuthors(swigCPtr, this);
  }

  public String getReferences() {
    return opensimSimulationJNI.JointIterator_getReferences(swigCPtr, this);
  }

  public int getNumProperties() {
    return opensimSimulationJNI.JointIterator_getNumProperties(swigCPtr, this);
  }

  public AbstractProperty getPropertyByIndex(int propertyIndex) {
    return new AbstractProperty(opensimSimulationJNI.JointIterator_getPropertyByIndex(swigCPtr, this, propertyIndex), false);
  }

  public boolean hasProperty(String name) {
    return opensimSimulationJNI.JointIterator_hasProperty(swigCPtr, this, name);
  }

  public AbstractProperty getPropertyByName(String name) {
    return new AbstractProperty(opensimSimulationJNI.JointIterator_getPropertyByName(swigCPtr, this, name), false);
  }

  public boolean isObjectUpToDateWithProperties() {
    return opensimSimulationJNI.JointIterator_isObjectUpToDateWithProperties(swigCPtr, this);
  }

  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent) {
    opensimSimulationJNI.JointIterator_updateXMLNode(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent));
  }

  public boolean getInlined() {
    return opensimSimulationJNI.JointIterator_getInlined(swigCPtr, this);
  }

  public String getDocumentFileName() {
    return opensimSimulationJNI.JointIterator_getDocumentFileName(swigCPtr, this);
  }

  public boolean print(String fileName) {
    return opensimSimulationJNI.JointIterator_print(swigCPtr, this, fileName);
  }

  public boolean isA(String type) {
    return opensimSimulationJNI.JointIterator_isA(swigCPtr, this, type);
  }

  public String toString() {
    return opensimSimulationJNI.JointIterator_toString(swigCPtr, this);
  }

}
