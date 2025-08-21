package practice.vo;

public class Cat {

    private String name;
    private String breed;
    private int age;
    private String color;
    private int weight;
    private boolean isSleeping;
    private String mood;
    private int eatCount;

    
    public Cat() {
        
    }

    
    public Cat(String name, String breed, int age, String color, int weight, boolean isSleeping, String mood, int eatCount) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.isSleeping = isSleeping;
        this.mood = mood;
        this.eatCount = eatCount;
        
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public int getEatCount() {
        return eatCount;
    }

    public void setEatCount(int eatCount) {
        this.eatCount = eatCount;
    }

    // 행동 메서드
    public void meow() {
        if (isSleeping) {
            System.out.println(name + "는 자고 있어서 울 수 없어요.");
        } else {
            System.out.println(name + "가 야옹~ 하고 울어요.");
        }
    }

    public void eatCat() {
        if (isSleeping) {
            System.out.println(name + "는 자고 있어서 먹을 수 없어요.");
            return;
        }

        weight += 3;
        mood = "행복";
        eatCount++;
        System.out.println(name + "가 밥을 먹어요.");

        if (eatCount % 5 == 0) {
            age++;
            System.out.println(name + "가 한 살 더 먹었어요! 현재 나이: " + age);
        }

        checkMoodByWeight();
    }

    public void diet() {
        if (isSleeping) {
            System.out.println(name + "는 자고 있어서 운동할 수 없어요.");
            return;
        }

        if (weight > 10) {
            weight -= 1;
            mood = "짜증남";
            System.out.println(name + "가 운동해서 살이 빠졌어요.");
        } else {
            System.out.println("그만 빠져야 해요~~");
        }

        checkMoodByWeight();
    }

    public void sleep() {
        if (!isSleeping) {
            isSleeping = true;
            mood = "졸림";
            System.out.println(name + "가 잠들었어요...😴");
        } else {
            System.out.println(name + "는 이미 자고 있어요.");
        }
    }

    public void wakeUp() {
        if (isSleeping) {
            isSleeping = false;
            mood = "기분 좋음";
            System.out.println(name + "가 깨어났어요! 🐾");
        } else {
            System.out.println(name + "는 이미 깨어 있어요.");
        }
    }

    private void checkMoodByWeight() {
        if (weight > 15) {
            mood = "무거워서 짜증";
        } else if (weight < 3) {
            mood = "배고픔";
        } else {
            mood = "좋음";
        }
    }

    // 추가 정보 출력 (선택사항)
    public String info() {
        return "\n== 고양이 정보 ==\n"
                + "이름: " + name
                + "\n품종: " + breed
                + "\n나이: " + age
                + "\n색상: " + color
                + "\n몸무게: " + weight
                + "\n자는 중?: " + (isSleeping ? "네" : "아니요")
                + "\n기분: " + mood
                + "\n먹은 횟수: " + eatCount;
    }
}
