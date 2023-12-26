package org.example;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляров игрушек
        Toy toy1 = new Toy(1, "Кукла", 21, 5);
        Toy toy2 = new Toy(2, "Мяч", 10, 10);
        Toy toy3 = new Toy(3, "Машинка", 11, 20);

        // Создание экземпляра магазина
        Store store = new Store();

        // Добавление игрушек в магазин
        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);

        // Изменение веса игрушки
        store.updateToyWeight(1, 10);

        // Розыгрыш игрушки
        Toy prizeToy = store.playLottery();

        if (prizeToy != null) {
            System.out.println("Выиграна игрушка: " + prizeToy.getName());
        } else {
            System.out.println("Игрушки закончились");
        }
    }
}