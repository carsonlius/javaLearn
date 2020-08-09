package com.carsonlius.chapter01.interfaces.superman;

import com.carsonlius.chapter01.interfaces.swimmable.Swimmable;
import com.carsonlius.chapter01.intterface.flyable.Flyable;

public interface Superman extends Swimmable, Flyable {

    void battle();
}
