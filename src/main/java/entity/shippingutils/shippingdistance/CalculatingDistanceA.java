package entity.shippingutils.shippingdistance;
import org.example.DistanceCalculator;

public class calculateDistanceA implements CalculatingDistance{
  public int calculateDistance(String address, String province) {
    DistanceCalculator distanceCalculator = new DistanceCalculator();
    int distance = distanceCalculator.calculateDistance(address, province);
    return distance;
  }
}