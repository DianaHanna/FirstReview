package class24;

public class Animal {

    public void speak() {
        System.out.println("All animals speak");
    }

    public void eat() {
        System.out.println("All animals can eat");

    }

    public class Cat extends Animal {
        @Override
        public void speak() {
            System.out.println("Meow Meow");
        }

        @Override
        public void eat() {
            System.out.println("Cat eat fish");
        }

        public class Dog extends Animal {
            @Override
            public void speak() {
                System.out.println("Woof Woof");
            }

            @Override
            public void eat() {
                System.out.println("Dog love bones");
            }
        }

        public class Lion extends Animal {
            @Override
            public void speak() {
                System.out.println("Roar Roar");
            }

            @Override
            public void eat() {
                System.out.println("Lions eat humans");
            }
        }
    }
}


