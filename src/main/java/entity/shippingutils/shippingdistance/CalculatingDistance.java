package entity.shippingutils.shippingdistance;

public interface CalculatingDistance {
  abstract int calculateDistance(String address, String province);
}
