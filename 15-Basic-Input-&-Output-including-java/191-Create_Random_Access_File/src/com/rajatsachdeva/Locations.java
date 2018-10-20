package com.rajatsachdeva;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();

    public static void main(String[] args) throws IOException {
        try (RandomAccessFile rao = new RandomAccessFile("locations_rand.dat", "rwd")) {
            rao.writeInt(locations.size());
        }
    }

    // static initialization block
    // This block will be loaded only once , when the Locations class is loaded

    /**
     *
     * Lecture 190
     * ===========
     *
     * Random Access File
     * File Pointer points to the last read location in the file
     *
     * startByte = (n - 1) * 30;
     *
     * 1. The First four bytes will contain the number of locations (bytes 0 - 3)
     * 2. The next four bytes will contain the start offset of the location section (bytes 4 - 7)
     * 3. The next section of the file will contain the index (the index is 1692 bytes long. It will start from byte
     *    8 to 1699
     * 4. The final section of the file will contain the location records (the data).
     */
    static {
        try (ObjectInputStream locFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream
                ("locations.dat")))) {
            boolean eof = false;

            while (!eof) {
                try {
                    Location location = (Location) locFile.readObject();
                    System.out.println("Read Location " + location.getLocationID() + " : " + location.getDescription());
                    System.out.println("Found " + location.getExits().size() + " exits");

                    locations.put(location.getLocationID(), location);

                } catch (EOFException e) {
                    eof = true;
                }
            }
        } catch(InvalidClassException e) {
            System.out.println("InvalidClassException: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException io) {
            System.out.println("IO Exception: " + io.getMessage());
            io.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {
    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}