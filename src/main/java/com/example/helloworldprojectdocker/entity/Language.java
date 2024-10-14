package com.example.helloworldprojectdocker.entity;

public enum Language {
    ENGLISH,
    SPANISH,
    FRENCH,
    GERMAN,
    ITALIAN,
    PORTUGUESE,
    JAPANESE,
    RUSSIAN,
    HINDI,
    CARIOCA;

    public static Language fromString(String language) {
        return Language.valueOf(language.toUpperCase());
    }
}


