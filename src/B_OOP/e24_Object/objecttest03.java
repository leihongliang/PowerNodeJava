package B_OOP.e24_Object;

import java.util.Objects;

public class objecttest03 {
}
class Mytime3{
    int year;
    int month;
    int day;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mytime3 mytime3 = (Mytime3) o;
        return year == mytime3.year && month == mytime3.month && day == mytime3.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}