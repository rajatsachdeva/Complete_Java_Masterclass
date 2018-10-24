package com.rajatsachdeva;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {

    private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();
    private static Map<Integer, IndexRecord> index = new LinkedHashMap<>();
    private static RandomAccessFile ra;

    public static void main(String[] args) throws IOException {
        try (RandomAccessFile rao = new RandomAccessFile("locations_rand.dat", "rwd")) {
            rao.writeInt(locations.size());
            int indexSize = locations.size() * 3 * Integer.BYTES;
            int locationStart = (int) (indexSize + rao.getFilePointer() + Integer.BYTES);
            rao.writeInt(locationStart);

            long indexStart = rao.getFilePointer();
            // write the locations

            int startPointer = locationStart;
            rao.seek(startPointer);

            for (Location location : locations.values()) {
                rao.writeInt(location.getLocationID());
                rao.writeUTF(location.getDescription());
                StringBuilder builder = new StringBuilder();

                for (String direction : location.getExits().keySet()) {
                    if (!direction.equalsIgnoreCase("Q")) {
                        builder.append(direction);
                        builder.append(",");
                        builder.append(location.getExits().get(direction));
                        builder.append(",");
                        // direction,locationId,direction,locationId
                        // N,1,U,2
                    }
                    rao.writeUTF(builder.toString());

                    IndexRecord record = new IndexRecord(startPointer, (int) (rao.getFilePointer() - startPointer));
                    index.put(location.getLocationID(), record);

                    startPointer = (int) rao.getFilePointer();
                }

                rao.seek(indexStart);
                for (Integer locationID : index.keySet()) {
                    rao.writeInt(locationID);
                    rao.writeInt(index.get(locationID).getStartByte());
                    rao.writeInt(index.get(locationID).getLength());
                }
            }
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
        } catch (InvalidClassException e) {
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

    public Location getLocation(int locationID) throws IOException {
        IndexRecord record = index.get(locationID);

        ra.seek(record.getStartByte());
        int id = ra.readInt();
        String description = ra.readUTF();
        String exits = ra.readUTF();
        String[] exitPart = new String(exits).split(",");

        Location location = new Location(locationID, description, null);

        if(locationID != 0) {
            for(int i = 0; i < exitPart.length; i++) {
                System.out.println("exitPart = " + exitPart[i]);
                System.out.println("exitPart[+1] = " + exitPart[i + 1]);
                String direction = exitPart[i];
                int destination = Integer.parseInt(exitPart[++i]);
                location.addExit(direction, destination);
            }
        }
        return location;
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

    public void close() throws IOException {
        ra.close();
    }
}
