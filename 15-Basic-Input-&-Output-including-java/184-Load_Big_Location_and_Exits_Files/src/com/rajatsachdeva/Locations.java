package com.rajatsachdeva;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) throws IOException {
        // try with resources
        // with this approach we don't need to explicitly close the file stream
        // even if exception occurs or not try with resources will close the stream automatically
        try(FileWriter locFile = new FileWriter("locations.txt");
            FileWriter dirFile = new FileWriter("directions.txt")) {

            for(Location location: locations.values()) {
                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
                for(String direction: location.getExits().keySet()) {
                    dirFile.write(location.getLocationID() + "," + direction + "," + location.getExits().get
                            (direction) + "\n");
                }
            }
        }
    }

    // static initialization block
    // This block will be loaded only once , when the Locations class is loaded
    static {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new FileReader("locations_big.txt"));
            scanner.useDelimiter(",");

            while(scanner.hasNextLine()) {
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
                System.out.println("Imported: " + loc + " : " + description);

                Map<String, Integer> tempExit = new HashMap<String, Integer>();
                locations.put(loc, new Location(loc, description, tempExit));

            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            if(scanner != null) {
                scanner.close();
            }
        }

        // read the exits from directions.txt

        try {
            scanner = new Scanner(new BufferedReader(new FileReader("directions_big.txt")));
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {
//                int loc = scanner.nextInt();
//                scanner.skip(scanner.delimiter());
//                String direction = scanner.next();
//                scanner.skip(scanner.delimiter());
//                String dest = scanner.nextLine();
//                int destination = Integer.parseInt(dest);

                String input = scanner.nextLine();
                String[] data = input.split(",");
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);

                System.out.println(loc + ": " + direction + ": " + destination);
                Location location = locations.get(loc);
                location.addExit(direction, destination);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // closing the scanner will close the BufferedReader/FileReader Objects as they implements Closable
            // and Readable , hence freeing up the resources
            scanner.close();
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