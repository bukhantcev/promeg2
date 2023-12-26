package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Store {
    private Toy[] toys;
    private int numToys;

    public Store() {
        toys = new Toy[100];
        numToys = 0;
    }

    public void addToy(Toy toy) {
        toys[numToys] = toy;
        numToys++;
    }

    public void updateToyWeight(int toyId, int weight) {
        toys[toyId].setWeight(weight);
    }

    public Toy playLottery() {
        if (numToys > 0) {
            Toy prizeToy = toys[0];
            removeToy(0);
            saveToysToFile();
            return prizeToy;
        }
        return null;
    }

    private void removeToy(int index) {
        for (int i = index; i < numToys - 1; i++) {
            toys[i] = toys[i+1];
        }
        numToys--;
    }

    private void saveToysToFile() {
        try {
            FileWriter writer = new FileWriter("prize_toys.txt", true);
            writer.write(toys[0].toString() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}