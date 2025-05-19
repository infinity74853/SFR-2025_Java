package module_3.practice3_3;

public class Vehicle {
  private String vehicleId;
  private TransportType transportType;

  public void setTransportType(TransportType type) {
    this.transportType = type;
  }

  public TransportType getTransportType() {
    return transportType;
  }

  public boolean isPublicTransport() {
    return transportType == TransportType.BUS || transportType == TransportType.TRAIN;
  }

  @Override
  public String toString() {
    return "Vehicle ID: " + vehicleId + ", Type: " + transportType;
  }
}
