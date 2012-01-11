/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Model extends ModelComponent {
  private long swigCPtr;

  public Model(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Model_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Model obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Model(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  private String originalModelPath = null;
  // Important that we only refer to originalModelPath if the model's getInputFileName() is not set
  public void setOriginalModelPathFromModel(Model model) {
    originalModelPath = null;
    if(model.getInputFileName()!=null && !model.getInputFileName().equals(""))
      originalModelPath = (new java.io.File(model.getInputFileName())).getParent();
	 else if(model.originalModelPath!=null && !model.originalModelPath.equals(""))
      originalModelPath = model.originalModelPath;
  }
  public String getFilePath() {
    if(getInputFileName()!=null && !getInputFileName().equals("") && (new java.io.File(getInputFileName())).getParent()!=null)
      return (new java.io.File(getInputFileName())).getParent() + java.io.File.separator;
    else if(originalModelPath!=null && !originalModelPath.equals(""))
      return originalModelPath + java.io.File.separator;
    else return "";
  }

  public Model() {
    this(opensimModelJNI.new_Model__SWIG_0(), true);
  }

  public Model(String aFileName) throws java.io.IOException {
    this(opensimModelJNI.new_Model__SWIG_1(aFileName), true);
  }

  public Model(Model aModel) {
    this(opensimModelJNI.new_Model__SWIG_2(Model.getCPtr(aModel), aModel), true);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode, int versionNumber) {
    opensimModelJNI.Model_updateFromXMLNode__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode), versionNumber);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode) {
    opensimModelJNI.Model_updateFromXMLNode__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode));
  }

  public OpenSimObject copy() {
    long cPtr = opensimModelJNI.Model_copy(swigCPtr, this);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public void copyData(Model aModel) {
    opensimModelJNI.Model_copyData(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public void setupProperties() {
    opensimModelJNI.Model_setupProperties(swigCPtr, this);
  }

  public Model clone() {
    long cPtr = opensimModelJNI.Model_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Model(cPtr, false);
  }

  public void setup() throws java.io.IOException {
    opensimModelJNI.Model_setup(swigCPtr, this);
  }

  public void cleanup() {
    opensimModelJNI.Model_cleanup(swigCPtr, this);
  }

  public SWIGTYPE_p_SimTK__State initSystem() throws java.io.IOException {
    return new SWIGTYPE_p_SimTK__State(opensimModelJNI.Model_initSystem(swigCPtr, this), false);
  }

  public void setDefaultsFromState(SWIGTYPE_p_SimTK__State state) {
    opensimModelJNI.Model_setDefaultsFromState(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(state));
  }

  public void initStateWithoutRecreatingSystem(SWIGTYPE_p_SimTK__State state) {
    opensimModelJNI.Model_initStateWithoutRecreatingSystem(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(state));
  }

  public void invalidateSystem() {
    opensimModelJNI.Model_invalidateSystem(swigCPtr, this);
  }

  public boolean isValidSystem() {
    return opensimModelJNI.Model_isValidSystem(swigCPtr, this);
  }

  public void formStateStorage(Storage originalStorage, Storage statesStorage) {
    opensimModelJNI.Model_formStateStorage(swigCPtr, this, Storage.getCPtr(originalStorage), originalStorage, Storage.getCPtr(statesStorage), statesStorage);
  }

  public void formQStorage(Storage originalStorage, Storage qStorage) {
    opensimModelJNI.Model_formQStorage(swigCPtr, this, Storage.getCPtr(originalStorage), originalStorage, Storage.getCPtr(qStorage), qStorage);
  }

  public void updateAssemblyConditions(SWIGTYPE_p_SimTK__State s) {
    opensimModelJNI.Model_updateAssemblyConditions(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public void assemble(SWIGTYPE_p_SimTK__State state, Coordinate coord, double weight) {
    opensimModelJNI.Model_assemble__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(state), Coordinate.getCPtr(coord), coord, weight);
  }

  public void assemble(SWIGTYPE_p_SimTK__State state, Coordinate coord) {
    opensimModelJNI.Model_assemble__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(state), Coordinate.getCPtr(coord), coord);
  }

  public void assemble(SWIGTYPE_p_SimTK__State state) {
    opensimModelJNI.Model_assemble__SWIG_2(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(state));
  }

  public void equilibrateMuscles(SWIGTYPE_p_SimTK__State state) {
    opensimModelJNI.Model_equilibrateMuscles(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(state));
  }

  public SWIGTYPE_p_SimTK__SimbodyMatterSubsystem getMatterSubsystem() {
    return new SWIGTYPE_p_SimTK__SimbodyMatterSubsystem(opensimModelJNI.Model_getMatterSubsystem(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__SimbodyMatterSubsystem updMatterSubsystem() {
    return new SWIGTYPE_p_SimTK__SimbodyMatterSubsystem(opensimModelJNI.Model_updMatterSubsystem(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Force__Gravity getGravityForce() {
    return new SWIGTYPE_p_SimTK__Force__Gravity(opensimModelJNI.Model_getGravityForce(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Force__Gravity updGravityForce() {
    return new SWIGTYPE_p_SimTK__Force__Gravity(opensimModelJNI.Model_updGravityForce(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__GeneralForceSubsystem getForceSubsystem() {
    return new SWIGTYPE_p_SimTK__GeneralForceSubsystem(opensimModelJNI.Model_getForceSubsystem(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__GeneralForceSubsystem updForceSubsystem() {
    return new SWIGTYPE_p_SimTK__GeneralForceSubsystem(opensimModelJNI.Model_updForceSubsystem(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__DecorationSubsystem getDecorationSubsystem() {
    return new SWIGTYPE_p_SimTK__DecorationSubsystem(opensimModelJNI.Model_getDecorationSubsystem(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__DecorationSubsystem updDecorationSubsystem() {
    return new SWIGTYPE_p_SimTK__DecorationSubsystem(opensimModelJNI.Model_updDecorationSubsystem(swigCPtr, this), false);
  }

  public int getNumStateVariables() {
    return opensimModelJNI.Model_getNumStateVariables(swigCPtr, this);
  }

  public void addComponent(ModelComponent aComponent) {
    opensimModelJNI.Model_addComponent(swigCPtr, this, ModelComponent.getCPtr(aComponent), aComponent);
  }

  public void addBody(Body aBody) {
    opensimModelJNI.Model_addBody(swigCPtr, this, Body.getCPtr(aBody), aBody);
  }

  public void addConstraint(Constraint aConstraint) {
    opensimModelJNI.Model_addConstraint(swigCPtr, this, Constraint.getCPtr(aConstraint), aConstraint);
  }

  public void addForce(Force aForce) {
    opensimModelJNI.Model_addForce(swigCPtr, this, Force.getCPtr(aForce), aForce);
  }

  public void addContactGeometry(ContactGeometry aContactGeometry) {
    opensimModelJNI.Model_addContactGeometry(swigCPtr, this, ContactGeometry.getCPtr(aContactGeometry), aContactGeometry);
  }

  public String getInputFileName() {
    return opensimModelJNI.Model_getInputFileName(swigCPtr, this);
  }

  public void setInputFileName(String fileName) {
    opensimModelJNI.Model_setInputFileName(swigCPtr, this, fileName);
  }

  public String getCredits() {
    return opensimModelJNI.Model_getCredits(swigCPtr, this);
  }

  public void setAuthors(String aCredits) {
    opensimModelJNI.Model_setAuthors(swigCPtr, this, aCredits);
  }

  public String getPublications() {
    return opensimModelJNI.Model_getPublications(swigCPtr, this);
  }

  public void setPublications(String aPublications) {
    opensimModelJNI.Model_setPublications(swigCPtr, this, aPublications);
  }

  public Units getLengthUnits() {
    return new Units(opensimModelJNI.Model_getLengthUnits(swigCPtr, this), false);
  }

  public Units getForceUnits() {
    return new Units(opensimModelJNI.Model_getForceUnits(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem getMultibodySystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimModelJNI.Model_getMultibodySystem(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem updMultibodySystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimModelJNI.Model_updMultibodySystem(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 getGravity() {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.Model_getGravity(swigCPtr, this), true);
  }

  public boolean setGravity(SWIGTYPE_p_SimTK__Vec3 aGrav) {
    return opensimModelJNI.Model_setGravity(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(aGrav));
  }

  public int getNumMarkers() {
    return opensimModelJNI.Model_getNumMarkers(swigCPtr, this);
  }

  public int getNumContactGeometries() {
    return opensimModelJNI.Model_getNumContactGeometries(swigCPtr, this);
  }

  public int getNumBodies() {
    return opensimModelJNI.Model_getNumBodies(swigCPtr, this);
  }

  public int getNumJoints() {
    return opensimModelJNI.Model_getNumJoints(swigCPtr, this);
  }

  public int getNumCoordinates() {
    return opensimModelJNI.Model_getNumCoordinates(swigCPtr, this);
  }

  public int getNumSpeeds() {
    return opensimModelJNI.Model_getNumSpeeds(swigCPtr, this);
  }

  public SetActuators getActuators() {
    return new SetActuators(opensimModelJNI.Model_getActuators(swigCPtr, this), false);
  }

  public SetActuators updActuators() {
    return new SetActuators(opensimModelJNI.Model_updActuators(swigCPtr, this), false);
  }

  public SetMuscles getMuscles() {
    return new SetMuscles(opensimModelJNI.Model_getMuscles(swigCPtr, this), false);
  }

  public SetMuscles updMuscles() {
    return new SetMuscles(opensimModelJNI.Model_updMuscles(swigCPtr, this), false);
  }

  public ForceSet getForceSet() {
    return new ForceSet(opensimModelJNI.Model_getForceSet(swigCPtr, this), false);
  }

  public ForceSet updForceSet() {
    return new ForceSet(opensimModelJNI.Model_updForceSet(swigCPtr, this), false);
  }

  public int getNumAnalyses() {
    return opensimModelJNI.Model_getNumAnalyses(swigCPtr, this);
  }

  public int getNumControls() {
    return opensimModelJNI.Model_getNumControls(swigCPtr, this);
  }

  public SWIGTYPE_p_SimTK__Vector updDefaultControls() {
    return new SWIGTYPE_p_SimTK__Vector(opensimModelJNI.Model_updDefaultControls(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Vector getDefaultControls() {
    return new SWIGTYPE_p_SimTK__Vector(opensimModelJNI.Model_getDefaultControls(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Vector updControls(SWIGTYPE_p_SimTK__State s) {
    return new SWIGTYPE_p_SimTK__Vector(opensimModelJNI.Model_updControls(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s)), false);
  }

  public SWIGTYPE_p_SimTK__Vector getControls(SWIGTYPE_p_SimTK__State s) {
    return new SWIGTYPE_p_SimTK__Vector(opensimModelJNI.Model_getControls(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s)), false);
  }

  public void computeControls(SWIGTYPE_p_SimTK__State s, SWIGTYPE_p_SimTK__Vector controls) {
    opensimModelJNI.Model_computeControls(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), SWIGTYPE_p_SimTK__Vector.getCPtr(controls));
  }

  public boolean isControlled() {
    return opensimModelJNI.Model_isControlled(swigCPtr, this);
  }

  public void storeControls(SWIGTYPE_p_SimTK__State s, int step) {
    opensimModelJNI.Model_storeControls(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), step);
  }

  public void printControlStorage(String fileName) {
    opensimModelJNI.Model_printControlStorage(swigCPtr, this, fileName);
  }

  public ControllerSet getControllerSet() {
    return new ControllerSet(opensimModelJNI.Model_getControllerSet(swigCPtr, this), false);
  }

  public ControllerSet updControllerSet() {
    return new ControllerSet(opensimModelJNI.Model_updControllerSet(swigCPtr, this), false);
  }

  public boolean getAllControllersEnabled() {
    return opensimModelJNI.Model_getAllControllersEnabled(swigCPtr, this);
  }

  public void setAllControllersEnabled(boolean enabled) {
    opensimModelJNI.Model_setAllControllersEnabled(swigCPtr, this, enabled);
  }

  public void applyDefaultConfiguration(SWIGTYPE_p_SimTK__State s) {
    opensimModelJNI.Model_applyDefaultConfiguration(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public SimbodyEngine getSimbodyEngine() {
    return new SimbodyEngine(opensimModelJNI.Model_getSimbodyEngine(swigCPtr, this), false);
  }

  public SimbodyEngine updSimbodyEngine() {
    return new SimbodyEngine(opensimModelJNI.Model_updSimbodyEngine(swigCPtr, this), false);
  }

  public ArrayStr getStateVariableNames() {
    return new ArrayStr(opensimModelJNI.Model_getStateVariableNames(swigCPtr, this), true);
  }

  public double getStateVariable(SWIGTYPE_p_SimTK__State state, String name) {
    return opensimModelJNI.Model_getStateVariable(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(state), name);
  }

  public void getStateValues(SWIGTYPE_p_SimTK__State s, ArrayDouble rStateValues) {
    opensimModelJNI.Model_getStateValues(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), ArrayDouble.getCPtr(rStateValues), rStateValues);
  }

  public void setStateValues(SWIGTYPE_p_SimTK__State s, SWIGTYPE_p_double aStateValues) {
    opensimModelJNI.Model_setStateValues(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), SWIGTYPE_p_double.getCPtr(aStateValues));
  }

  public int getNumMuscleStates() {
    return opensimModelJNI.Model_getNumMuscleStates(swigCPtr, this);
  }

  public void setInitialTime(double ti) {
    opensimModelJNI.Model_setInitialTime(swigCPtr, this, ti);
  }

  public CoordinateSet updCoordinateSet() {
    return new CoordinateSet(opensimModelJNI.Model_updCoordinateSet(swigCPtr, this), false);
  }

  public CoordinateSet getCoordinateSet() {
    return new CoordinateSet(opensimModelJNI.Model_getCoordinateSet(swigCPtr, this), false);
  }

  public BodySet updBodySet() {
    return new BodySet(opensimModelJNI.Model_updBodySet(swigCPtr, this), false);
  }

  public BodySet getBodySet() {
    return new BodySet(opensimModelJNI.Model_getBodySet(swigCPtr, this), false);
  }

  public JointSet updJointSet() {
    return new JointSet(opensimModelJNI.Model_updJointSet(swigCPtr, this), false);
  }

  public JointSet getJointSet() {
    return new JointSet(opensimModelJNI.Model_getJointSet(swigCPtr, this), false);
  }

  public AnalysisSet updAnalysisSet() {
    return new AnalysisSet(opensimModelJNI.Model_updAnalysisSet(swigCPtr, this), false);
  }

  public AnalysisSet getAnalysisSet() {
    return new AnalysisSet(opensimModelJNI.Model_getAnalysisSet(swigCPtr, this), false);
  }

  public ContactGeometrySet updContactGeometrySet() {
    return new ContactGeometrySet(opensimModelJNI.Model_updContactGeometrySet(swigCPtr, this), false);
  }

  public ContactGeometrySet getContactGeometrySet() {
    return new ContactGeometrySet(opensimModelJNI.Model_getContactGeometrySet(swigCPtr, this), false);
  }

  public Body getGroundBody() {
    return new Body(opensimModelJNI.Model_getGroundBody(swigCPtr, this), false);
  }

  public ConstraintSet updConstraintSet() {
    return new ConstraintSet(opensimModelJNI.Model_updConstraintSet(swigCPtr, this), false);
  }

  public ConstraintSet getConstraintSet() {
    return new ConstraintSet(opensimModelJNI.Model_getConstraintSet(swigCPtr, this), false);
  }

  public MarkerSet updMarkerSet() {
    return new MarkerSet(opensimModelJNI.Model_updMarkerSet(swigCPtr, this), false);
  }

  public MarkerSet getMarkerSet() {
    return new MarkerSet(opensimModelJNI.Model_getMarkerSet(swigCPtr, this), false);
  }

  public int replaceMarkerSet(SWIGTYPE_p_SimTK__State s, MarkerSet aMarkerSet) {
    return opensimModelJNI.Model_replaceMarkerSet(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), MarkerSet.getCPtr(aMarkerSet), aMarkerSet);
  }

  public void writeMarkerFile(String aFileName) {
    opensimModelJNI.Model_writeMarkerFile(swigCPtr, this, aFileName);
  }

  public void updateMarkerSet(MarkerSet aMarkerSet) {
    opensimModelJNI.Model_updateMarkerSet(swigCPtr, this, MarkerSet.getCPtr(aMarkerSet), aMarkerSet);
  }

  public int deleteUnusedMarkers(ArrayStr aMarkerNames) {
    return opensimModelJNI.Model_deleteUnusedMarkers(swigCPtr, this, ArrayStr.getCPtr(aMarkerNames), aMarkerNames);
  }

  public void addAnalysis(Analysis aAnalysis) {
    opensimModelJNI.Model_addAnalysis(swigCPtr, this, Analysis.getCPtr(aAnalysis), aAnalysis);
  }

  public void addController(Controller aController) {
    opensimModelJNI.Model_addController(swigCPtr, this, Controller.getCPtr(aController), aController);
  }

  public void removeAnalysis(Analysis aAnalysis, boolean deleteIt) {
    opensimModelJNI.Model_removeAnalysis__SWIG_0(swigCPtr, this, Analysis.getCPtr(aAnalysis), aAnalysis, deleteIt);
  }

  public void removeAnalysis(Analysis aAnalysis) {
    opensimModelJNI.Model_removeAnalysis__SWIG_1(swigCPtr, this, Analysis.getCPtr(aAnalysis), aAnalysis);
  }

  public void removeController(Controller aController) {
    opensimModelJNI.Model_removeController(swigCPtr, this, Controller.getCPtr(aController), aController);
  }

  public void computeEquilibriumForAuxiliaryStates(SWIGTYPE_p_SimTK__State s) {
    opensimModelJNI.Model_computeEquilibriumForAuxiliaryStates(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public boolean scale(SWIGTYPE_p_SimTK__State s, ScaleSet aScaleSet, double aFinalMass, boolean aPreserveMassDist) {
    return opensimModelJNI.Model_scale__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), ScaleSet.getCPtr(aScaleSet), aScaleSet, aFinalMass, aPreserveMassDist);
  }

  public boolean scale(SWIGTYPE_p_SimTK__State s, ScaleSet aScaleSet, double aFinalMass) {
    return opensimModelJNI.Model_scale__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), ScaleSet.getCPtr(aScaleSet), aScaleSet, aFinalMass);
  }

  public boolean scale(SWIGTYPE_p_SimTK__State s, ScaleSet aScaleSet) {
    return opensimModelJNI.Model_scale__SWIG_2(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

  public void printBasicInfo(SWIGTYPE_p_std__ostream aOStream) {
    opensimModelJNI.Model_printBasicInfo(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(aOStream));
  }

  public void printDetailedInfo(SWIGTYPE_p_SimTK__State s, SWIGTYPE_p_std__ostream aOStream) {
    opensimModelJNI.Model_printDetailedInfo(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), SWIGTYPE_p_std__ostream.getCPtr(aOStream));
  }

  public void disownAllComponents() {
    opensimModelJNI.Model_disownAllComponents(swigCPtr, this);
  }

  public void overrideAllActuators(SWIGTYPE_p_SimTK__State s, boolean flag) {
    opensimModelJNI.Model_overrideAllActuators(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), flag);
  }

  public String getValidationLog() {
    return opensimModelJNI.Model_getValidationLog(swigCPtr, this);
  }

  public void clearValidationLog() {
    opensimModelJNI.Model_clearValidationLog(swigCPtr, this);
  }

  public OpenSimObject getObjectByTypeAndName(String typeString, String nameString) throws java.io.IOException {
    return new OpenSimObject(opensimModelJNI.Model_getObjectByTypeAndName(swigCPtr, this, typeString, nameString), false);
  }

  public static void LoadOpenSimLibrary(String libraryName) {
    opensimModelJNI.Model_LoadOpenSimLibrary(libraryName);
  }

}