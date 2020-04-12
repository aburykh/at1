package ru.gb.at1.lesson1and2;

/**
 * 1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
 * Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
 * <p>
 * 2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать),
 * результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
 * У препятствий есть длина (для дорожки) или высота (для стены), а у участников ограничения на бег и прыжки.
 * <p>
 * 3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
 * Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
 */


public class RunnigTrack implements Obstacles {

    String name;
    int length;

    public RunnigTrack(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public String getSimpleName() {
        return getClass().getSimpleName();
    }

    public float getProp() {
        return length;
    }

    public boolean passing(Participants participants) {
        return participants.run(this);
    }

}
