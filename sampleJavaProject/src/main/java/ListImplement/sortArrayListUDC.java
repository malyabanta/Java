package ListImplement;

import java.util.Comparator;

public class sortArrayListUDC implements Comparator<student> {
    public int compare(student o1, student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
