package car;

public class Name {
    private final String name;

    public Name(String name) {
        if (name.length() < 1) {
            throw new IllegalArgumentException("이름을 입력해 주세요");
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5자를 초과할 수 없습니다.");
        }

        this.name = name;
    }
}
