package gov.nasa;

public abstract class Processor {   /*абстрактный класс - значит что не может быть чистого экземпляра класса, но это*/
                                    /*не точно, загугли*/
    public String name;
    public abstract Eenteger process(Eenteger a, Eenteger b); /* если есть хоть один абстрактный метод - */
                                                                /*значит класс абстрактный*/
    public String getName() {
        return name;
    }

}
