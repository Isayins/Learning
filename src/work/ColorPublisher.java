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
        // ֪ͨ���еĶ�������ɫ�����˱仯

        for (ColorSubscriber subscriber : subscribers) {
            subscriber.notifyColorChange(c);
        }
    }
}