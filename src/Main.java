//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Box");
        System.out.println(stringBox.get());
        System.out.println(stringBox.isEmpty());
        stringBox.clear();
        System.out.println(stringBox.isEmpty());
        System.out.println();

        Box<Integer> integerBox = new Box<>();
        integerBox.set(22);
        System.out.println(integerBox.get());
        System.out.println(integerBox.isEmpty());
        integerBox.clear();
        System.out.println(integerBox.isEmpty());
        System.out.println();

        Box<Character> characterBox = new Box<>();
        characterBox.set('X');
        System.out.println(characterBox.get());
        System.out.println(characterBox.isEmpty());
        characterBox.clear();
        System.out.println(characterBox.isEmpty());
    }
}