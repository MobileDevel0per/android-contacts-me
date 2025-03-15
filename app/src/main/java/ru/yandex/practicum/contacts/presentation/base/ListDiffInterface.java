package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    // сделал метод для сравнения объектов одного типа
    boolean theSameAs(T other);

    @Override
    boolean equals(Object other);
}