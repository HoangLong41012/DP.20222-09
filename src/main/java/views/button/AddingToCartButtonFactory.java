package views.button;

import views.screen.home.MediaHandler;

public class AddingToCartButtonFactory extends ButtonFactory {
  public AddingToCartButton createButton(MediaHandler mediaHandler) {
    AddingToCartButton aButton = new AddingToCartButton();
    aButton.setOnMouseClicked(event -> {
      mediaHandler.notifyObservers()
    });
    return aButton;
  }
}