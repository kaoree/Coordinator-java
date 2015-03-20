package me.panavtec.coordinator.internal.model;

public abstract class MappedAction {
  private int coordinatorId;
  private String fieldName;
  private String parentName;

  public String getParentName() {
    return parentName;
  }

  public void setParentName(String parentName) {
    this.parentName = parentName;
  }

  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public int getCoordinatorId() {
    return coordinatorId;
  }

  public void setCoordinatorId(int coordinatorId) {
    this.coordinatorId = coordinatorId;
  }

  @Override public String toString() {
    return "MappedAction{" +
        "coordinatorId=" + coordinatorId +
        ", fieldName='" + fieldName + '\'' +
        ", parentName='" + parentName + '\'' +
        '}';
  }
}