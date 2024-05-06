public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 2");
        dog = dog += 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача 6");
        var weightOne = 78.2;
        var weightTwo = 82.7;
        var generalWeight = weightOne + weightTwo;
        System.out.println("Общая масса двух бойцов " + generalWeight + " кг!");
        var differenceWeight = weightTwo - weightOne;
        System.out.println("Разница между массами бойцов составляет " + differenceWeight + " кг!");

        System.out.println("Задача 7");
        var moreWeight = weightTwo % weightOne;
        System.out.println("Разница между массами бойцов составляет " + moreWeight + " кг!");

        System.out.println("Задача 8");
        var totalHours = 640;
        var timePerson = 8;
        var totalPeople = totalHours / timePerson;
        System.out.println("Всего работников в компании — " + totalPeople + " человек.");
        totalPeople = totalPeople + 94;
        totalHours = totalPeople * 8;
        System.out.println("Если в компании работает " + totalPeople + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");
    }
}