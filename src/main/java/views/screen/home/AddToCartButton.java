package views.screen.home;

import javafx.scene.control.Button;
import common.interfaces.Observable;
import common.interfaces.Observer;

public class AddToCartButton extends Button implements Observable {

  private List<Observer> observerList;
  private int requestQuantity;
  private Media media;

  public AddToCartButton(int requestQuantity, Media media) {
    this.requestQuantity = requestQuantity;
    this.media = media;
  }

  public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.update(this));
    }

      public int getRequestQuantity() {
    return requestQuantity;
  }

  public void setRequestQuantity(int requestQuantity) {
    this.requestQuantity = requestQuantity;
  }

  public Media getMedia() {
    return media;
  }

  public void setMedia(Media media) {
    this.media = media;
  }
}