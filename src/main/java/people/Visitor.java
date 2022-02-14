package people;

public class Visitor {

    private int age;
    private double height;
    private double money;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public boolean checkAgeIfFifteen (Visitor visitor){
        if (this.age > 15){
            return true;
        }
        return false;

    }

    public boolean checkAgeIfEighteen (Visitor visitor){
        if (this.age > 18){
            return true;
        }
        return false;

    }

    public boolean checkAgeIfTwelve (Visitor visitor){
        if (this.age > 12){
            return true;
        }
        return false;

    }

    public boolean checkHeightOfVisitor(Visitor visitor){
        if (this.height > 145){
            return true;
        }
        return false;
    }


}
