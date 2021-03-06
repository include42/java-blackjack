package domain.user;

import domain.rule.Drawable;
import domain.card.Card;

import java.util.Objects;

public abstract class User{
    protected final HandCard handCard = new HandCard();
    private final String name;

    public User(String name) {
        validate(name);
        this.name = name;
    }

    private void validateDrawable(Drawable drawable) {
        if(Objects.isNull(drawable)){
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    private void validate(String name) {
        if (Objects.isNull(name) || name.isEmpty()) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    public String getName() {
        return name;
    }

    public void draw(Card card) {
        handCard.add(card);
    }

    public String getStatus() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name)
                .append(": ")
                .append(handCard.getNames());
        return stringBuilder.toString();
    }

    public int getScore() {
        return handCard.getScore();
    }

    public boolean isDrawable(Drawable drawable){
        validateDrawable(drawable);
        return drawable.check(getScore());
    }
}
