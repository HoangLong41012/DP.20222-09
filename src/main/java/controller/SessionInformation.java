package controller;

import entity.cart.Cart;
import entity.user.User;

import java.time.LocalDateTime;

/**
 * @author
 */

//Common coupling
public class SessionInformation {
    public static User mainUser;
    public static Cart cartInstance = new Cart();
    public static LocalDateTime expiredTime;

}