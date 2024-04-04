package online.agatstudio.demoweb.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Person {

    private final int id;
    private final String name;
    private final int age;
    private final float weight;
}
