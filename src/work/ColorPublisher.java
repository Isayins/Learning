package work;// TODO: Add code to this file as necessary
//       to finish the implementation of ColorPublisher.

import java.awt.Color;
import java.util.ArrayList;

public class ColorPublisher
{
    private ArrayList<ColorSubscriber> subscribers = new ArrayList<>();
    public void addSubscriber(ColorSubscriber cs)
    {
        subscribers.add(cs);

    }
    public void publish(Color c)
    {
        // 通知所有的订阅者颜色发生了变化

        for (ColorSubscriber subscriber : subscribers) {
            subscriber.notifyColorChange(c);
        }
    }
}