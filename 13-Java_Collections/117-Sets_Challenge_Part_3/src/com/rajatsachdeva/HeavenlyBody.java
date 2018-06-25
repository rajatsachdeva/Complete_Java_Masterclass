package com.rajatsachdeva;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyTypes bodyType;

    // Or we can use enums
    // nested enum is already static
    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<HeavenlyBody>();
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    public Set<HeavenlyBody> getSatellites() {
        // To return the copy of set rather than original
        return new HashSet<>(this.satellites);
    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    @Override
    public String toString() {
        return this.name + "\t:\t" + this.bodyType + "\t:\t" + this.orbitalPeriod;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            if (this.name.equals(theObject.getName())) {
                return this.bodyType == theObject.getBodyType();
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
//        return super.hashCode();
        //System.out.println("hashCode called : " + (this.name.hashCode() + 57 + this.bodyType.hashCode()));
        return this.name.hashCode() + 57 + this.bodyType.hashCode(); // Not good way of doing this
    }
}
