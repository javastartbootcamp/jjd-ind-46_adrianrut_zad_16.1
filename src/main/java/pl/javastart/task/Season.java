package pl.javastart.task;

import java.util.Arrays;

public enum Season {
    SPRING("Wiosna", new String[]{"Marzec", "Kwiecień", "Maj"}),
    SUMMER("Lato", new String[]{"Czerwiec", "Lipiec", "Sierpień"}),
    AUTUMN("Jesień", new String[]{"Wrzesień", "Październik", "Listopad"}),
    WINTER("Zima", new String[]{"Grudzień", "Styczeń", "Luty"});

    private final String translation;
    private final String[] months;

    Season(String translation, String[] months) {
        this.translation = translation;
        this.months = months;
    }

    public String getTranslation() {
        return translation;
    }

    public String printMonths() {
        return Arrays.toString(months);
    }

}