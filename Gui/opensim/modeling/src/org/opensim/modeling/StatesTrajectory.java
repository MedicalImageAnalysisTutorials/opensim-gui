/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class StatesTrajectory {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public StatesTrajectory(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(StatesTrajectory obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_StatesTrajectory(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StatesTrajectory() {
    this(opensimModelSimulationJNI.new_StatesTrajectory(), true);
  }

  public long getSize() {
    return opensimModelSimulationJNI.StatesTrajectory_getSize(swigCPtr, this);
  }

  public State get(long index) {
    return new State(opensimModelSimulationJNI.StatesTrajectory_get(swigCPtr, this, index), false);
  }

  public State front() {
    return new State(opensimModelSimulationJNI.StatesTrajectory_front(swigCPtr, this), false);
  }

  public State back() {
    return new State(opensimModelSimulationJNI.StatesTrajectory_back(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__vectorT_SimTK__State_t__const_iterator begin() {
    return new SWIGTYPE_p_std__vectorT_SimTK__State_t__const_iterator(opensimModelSimulationJNI.StatesTrajectory_begin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__vectorT_SimTK__State_t__const_iterator end() {
    return new SWIGTYPE_p_std__vectorT_SimTK__State_t__const_iterator(opensimModelSimulationJNI.StatesTrajectory_end(swigCPtr, this), true);
  }

  public void clear() {
    opensimModelSimulationJNI.StatesTrajectory_clear(swigCPtr, this);
  }

  public void append(State state) {
    opensimModelSimulationJNI.StatesTrajectory_append(swigCPtr, this, State.getCPtr(state), state);
  }

  public boolean hasIntegrity() {
    return opensimModelSimulationJNI.StatesTrajectory_hasIntegrity(swigCPtr, this);
  }

  public boolean isNondecreasingInTime() {
    return opensimModelSimulationJNI.StatesTrajectory_isNondecreasingInTime(swigCPtr, this);
  }

  public boolean isConsistent() {
    return opensimModelSimulationJNI.StatesTrajectory_isConsistent(swigCPtr, this);
  }

  public boolean isCompatibleWith(Model model) {
    return opensimModelSimulationJNI.StatesTrajectory_isCompatibleWith(swigCPtr, this, Model.getCPtr(model), model);
  }

  public TimeSeriesTable exportToTable(Model model, StdVectorString stateVars) {
    return new TimeSeriesTable(opensimModelSimulationJNI.StatesTrajectory_exportToTable__SWIG_0(swigCPtr, this, Model.getCPtr(model), model, StdVectorString.getCPtr(stateVars), stateVars), true);
  }

  public TimeSeriesTable exportToTable(Model model) {
    return new TimeSeriesTable(opensimModelSimulationJNI.StatesTrajectory_exportToTable__SWIG_1(swigCPtr, this, Model.getCPtr(model), model), true);
  }

  static public class InconsistentState extends OpenSimException {
    private transient long swigCPtr;
  
    public InconsistentState(long cPtr, boolean cMemoryOwn) {
      super(opensimModelSimulationJNI.StatesTrajectory_InconsistentState_SWIGUpcast(cPtr), cMemoryOwn);
      swigCPtr = cPtr;
    }
  
    public static long getCPtr(InconsistentState obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          opensimModelSimulationJNI.delete_StatesTrajectory_InconsistentState(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public InconsistentState(String file, long line, String func, double stateTime) {
      this(opensimModelSimulationJNI.new_StatesTrajectory_InconsistentState(file, line, func, stateTime), true);
    }
  
  }

  static public class MissingColumnsInStatesStorage extends OpenSimException {
    private transient long swigCPtr;
  
    public MissingColumnsInStatesStorage(long cPtr, boolean cMemoryOwn) {
      super(opensimModelSimulationJNI.StatesTrajectory_MissingColumnsInStatesStorage_SWIGUpcast(cPtr), cMemoryOwn);
      swigCPtr = cPtr;
    }
  
    public static long getCPtr(MissingColumnsInStatesStorage obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          opensimModelSimulationJNI.delete_StatesTrajectory_MissingColumnsInStatesStorage(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public MissingColumnsInStatesStorage(String file, long line, String func, String modelName, StdVectorString missingStates) {
      this(opensimModelSimulationJNI.new_StatesTrajectory_MissingColumnsInStatesStorage(file, line, func, modelName, StdVectorString.getCPtr(missingStates), missingStates), true);
    }
  
  }

  static public class ExtraColumnsInStatesStorage extends OpenSimException {
    private transient long swigCPtr;
  
    public ExtraColumnsInStatesStorage(long cPtr, boolean cMemoryOwn) {
      super(opensimModelSimulationJNI.StatesTrajectory_ExtraColumnsInStatesStorage_SWIGUpcast(cPtr), cMemoryOwn);
      swigCPtr = cPtr;
    }
  
    public static long getCPtr(ExtraColumnsInStatesStorage obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          opensimModelSimulationJNI.delete_StatesTrajectory_ExtraColumnsInStatesStorage(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public ExtraColumnsInStatesStorage(String file, long line, String func, String modelName, StdVectorString extraStates) {
      this(opensimModelSimulationJNI.new_StatesTrajectory_ExtraColumnsInStatesStorage(file, line, func, modelName, StdVectorString.getCPtr(extraStates), extraStates), true);
    }
  
  }

  static public class NonUniqueColumnsInStatesStorage extends OpenSimException {
    private transient long swigCPtr;
  
    public NonUniqueColumnsInStatesStorage(long cPtr, boolean cMemoryOwn) {
      super(opensimModelSimulationJNI.StatesTrajectory_NonUniqueColumnsInStatesStorage_SWIGUpcast(cPtr), cMemoryOwn);
      swigCPtr = cPtr;
    }
  
    public static long getCPtr(NonUniqueColumnsInStatesStorage obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          opensimModelSimulationJNI.delete_StatesTrajectory_NonUniqueColumnsInStatesStorage(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public NonUniqueColumnsInStatesStorage(String file, long line, String func) {
      this(opensimModelSimulationJNI.new_StatesTrajectory_NonUniqueColumnsInStatesStorage(file, line, func), true);
    }
  
  }

  static public class StatesStorageIsInDegrees extends OpenSimException {
    private transient long swigCPtr;
  
    public StatesStorageIsInDegrees(long cPtr, boolean cMemoryOwn) {
      super(opensimModelSimulationJNI.StatesTrajectory_StatesStorageIsInDegrees_SWIGUpcast(cPtr), cMemoryOwn);
      swigCPtr = cPtr;
    }
  
    public static long getCPtr(StatesStorageIsInDegrees obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          opensimModelSimulationJNI.delete_StatesTrajectory_StatesStorageIsInDegrees(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public StatesStorageIsInDegrees(String file, long line, String func) {
      this(opensimModelSimulationJNI.new_StatesTrajectory_StatesStorageIsInDegrees(file, line, func), true);
    }
  
  }

  static public class VaryingNumberOfStatesPerRow extends OpenSimException {
    private transient long swigCPtr;
  
    public VaryingNumberOfStatesPerRow(long cPtr, boolean cMemoryOwn) {
      super(opensimModelSimulationJNI.StatesTrajectory_VaryingNumberOfStatesPerRow_SWIGUpcast(cPtr), cMemoryOwn);
      swigCPtr = cPtr;
    }
  
    public static long getCPtr(VaryingNumberOfStatesPerRow obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          opensimModelSimulationJNI.delete_StatesTrajectory_VaryingNumberOfStatesPerRow(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public VaryingNumberOfStatesPerRow(String file, long line, String func, int numDepColumns, int smallestNumStates) {
      this(opensimModelSimulationJNI.new_StatesTrajectory_VaryingNumberOfStatesPerRow(file, line, func, numDepColumns, smallestNumStates), true);
    }
  
  }

  public static StatesTrajectory createFromStatesStorage(Model model, Storage sto, boolean allowMissingColumns, boolean allowExtraColumns) {
    return new StatesTrajectory(opensimModelSimulationJNI.StatesTrajectory_createFromStatesStorage__SWIG_0(Model.getCPtr(model), model, Storage.getCPtr(sto), sto, allowMissingColumns, allowExtraColumns), true);
  }

  public static StatesTrajectory createFromStatesStorage(Model model, Storage sto, boolean allowMissingColumns) {
    return new StatesTrajectory(opensimModelSimulationJNI.StatesTrajectory_createFromStatesStorage__SWIG_1(Model.getCPtr(model), model, Storage.getCPtr(sto), sto, allowMissingColumns), true);
  }

  public static StatesTrajectory createFromStatesStorage(Model model, Storage sto) {
    return new StatesTrajectory(opensimModelSimulationJNI.StatesTrajectory_createFromStatesStorage__SWIG_2(Model.getCPtr(model), model, Storage.getCPtr(sto), sto), true);
  }

  public static StatesTrajectory createFromStatesStorage(Model model, String filepath) {
    return new StatesTrajectory(opensimModelSimulationJNI.StatesTrajectory_createFromStatesStorage__SWIG_3(Model.getCPtr(model), model, filepath), true);
  }

}
