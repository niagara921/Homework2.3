public class Main {
    public static void main(String[] args) {
        var exercise = 6;
        System.out.println("Задача" + exercise);
        var oneBoxer = 78.2;
        System.out.println(oneBoxer);
        var twoBoxer = 82.7;
        System.out.println(twoBoxer);
        var togetherBoxer = oneBoxer + twoBoxer;
        System.out.println(togetherBoxer);
        var differenceBoxer = twoBoxer - oneBoxer;
        System.out.println(differenceBoxer);
        //Задача 7
        var oneWay = twoBoxer - oneBoxer;
        System.out.println(oneWay);
        var twoWay = twoBoxer % oneBoxer;
        System.out.println(twoWay);
        //Задача 8
        var totalHours = 640;
        var workerHours = 8;
        var totalWorker = totalHours / workerHours;
        System.out.println("Всего работников в компании" + totalWorker  + "человек");
        //Задача 8.2
        var morePeople = 94;
        var allpeople = morePeople + totalWorker;
        System.out.println(allpeople);
        var allHours = allpeople * workerHours;
        System.out.println("Если в компании работает" +allpeople+ "человек, " +
                "то всего" +allHours+ "часов работы может быть поделено между сотрудниками");

    }
}