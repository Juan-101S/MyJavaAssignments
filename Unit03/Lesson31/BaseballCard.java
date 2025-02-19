public class BaseballCard {
    String name; // the name of the player on the card.
    int year; // the year the card was issued.

    public BaseballCard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "BaseballCard (" +
                "Name = '" + name + '\'' +
                ", Year = " + year +
                ')';
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject)
            return true;
        if (otherObject == null || getClass() != otherObject.getClass())
            return false;
        BaseballCard that = (BaseballCard) otherObject;
        return year == that.year && name.equals(that.name);
    }
}