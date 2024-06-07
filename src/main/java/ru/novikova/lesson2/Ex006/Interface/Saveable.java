package ru.novikova.lesson2.Ex006.Interface;

import ru.novikova.lesson2.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
