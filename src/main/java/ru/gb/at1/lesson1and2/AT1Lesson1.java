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


public class AT1Lesson1 {


    public static void main(String[] arg) {
        Human human1 = new Human("Valera", 300, 0.7f);
        Human human2 = new Human("Alex", 200, 0.5f);


        Cat cat1 = new Cat("Markiz", 250, 2.5f);
        Cat cat2 = new Cat("Barsik", 650, 2.7f);


        Robot robot1 = new Robot("Bender", 123, 100f);
        Robot robot2 = new Robot("R2D2", 1550, 5f);

        RunnigTrack runnigTrack1 = new RunnigTrack("Короткая дорожка", 100);
        RunnigTrack runnigTrack2 = new RunnigTrack("Средняя дорожка", 200);
        RunnigTrack runnigTrack3 = new RunnigTrack("Длинная дорожка", 300);
        Wall wall1 = new Wall("Низкая стена", 0.5f);
        Wall wall2 = new Wall("Средняя стена", 1.5f);
        Wall wall3 = new Wall("Высокая стена", 2.5f);

        Obstacles[] obstArr = {runnigTrack1, wall1, runnigTrack2, wall2, runnigTrack3, wall3};
        System.out.println("\nПОЛОСА ПРЕПЯТСТВИЙ:");
        for (Obstacles obstacles : obstArr) {
            System.out.println(obstacles.getSimpleName() + ": " + obstacles.getName() + " - " + obstacles.getProp() + "м");
        }
        System.out.println("========================================");


        Participants[] partArr = {human1, human2, cat1, cat2, robot1, robot2};
/**
 for (int i = 0; i < partArr.length; i++) {
 System.out.println("\nУчастник: " + partArr[i].getClass().getName() + " " + partArr[i].getName());
 partArr[i].jump(0.5f);
 partArr[i].run(100);
 partArr[i].jump(1.5f);
 partArr[i].run(200);
 partArr[i].jump(2.5f);
 partArr[i].run(300);
 }
 */
        outer:
        for (Participants participants : partArr) {
            System.out.println("\nУчастник: " + participants.getSimpleName() + " " + participants.getName());
            for (Obstacles obstacles : obstArr) {
                if (!obstacles.passing(participants)) {
                    System.out.println("\nУчастник: " + participants.getSimpleName() + " " + participants.getName() + " сошёл с дистанции\n========================================");
                    continue outer;
                }
            }
            System.out.println("\nУчастник: " + participants.getSimpleName() + " " + participants.getName() + " успешно прошёл полосу препятсвий!!!\n========================================");
        }
    }
}
