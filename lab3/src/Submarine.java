// Submarine.java
/**
 * Represents a submarine with five fields: name, displacement, speed, crew size, and build year.
 */
class Submarine {
    private String name; // The name of the submarine
    private int displacement; // The displacement of the submarine in tons
    private int speed; // The speed of the submarine in knots
    private int crewSize; // The number of crew members onboard
    private int buildYear; // The year the submarine was built

    /**
     * Constructor to initialize a Submarine object.
     *
     * @param name The name of the submarine
     * @param displacement The displacement in tons
     * @param speed The speed in knots
     * @param crewSize The size of the crew
     * @param buildYear The year the submarine was built
     */
    public Submarine(String name, int displacement, int speed, int crewSize, int buildYear) {
        this.name = name;
        this.displacement = displacement;
        this.speed = speed;
        this.crewSize = crewSize;
        this.buildYear = buildYear;
    }

    /**
     * Gets the name of the submarine.
     *
     * @return The name of the submarine
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the displacement of the submarine.
     *
     * @return The displacement in tons
     */
    public int getDisplacement() {
        return displacement;
    }

    /**
     * Gets the speed of the submarine.
     *
     * @return The speed in knots
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Gets the crew size of the submarine.
     *
     * @return The number of crew members
     */
    public int getCrewSize() {
        return crewSize;
    }

    /**
     * Gets the year the submarine was built.
     *
     * @return The build year of the submarine
     */
    public int getBuildYear() {
        return buildYear;
    }

    /**
     * Returns a string representation of the submarine object.
     *
     * @return A string containing the submarine's details
     */
    @Override
    public String toString() {
        return "Submarine{" +
                "name='" + name + '\'' +
                ", displacement=" + displacement +
                ", speed=" + speed +
                ", crewSize=" + crewSize +
                ", buildYear=" + buildYear +
                '}';
    }

    /**
     * Checks if this submarine is equal to another object.
     * Two submarines are considered equal if all their fields are identical.
     *
     * @param obj The object to compare with
     * @return True if the submarines are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Submarine submarine = (Submarine) obj;
        return displacement == submarine.displacement &&
                speed == submarine.speed &&
                crewSize == submarine.crewSize &&
                buildYear == submarine.buildYear &&
                name.equals(submarine.name);
    }
}
