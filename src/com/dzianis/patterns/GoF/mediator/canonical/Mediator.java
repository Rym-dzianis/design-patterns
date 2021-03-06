package com.dzianis.patterns.GoF.mediator.canonical;

import javax.swing.*;

import com.dzianis.patterns.GoF.mediator.canonical.components.Component;

/**
 * ����� ��������� �����������.
 */
public interface Mediator {
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    void sendToFilter(ListModel listModel);
    void setElementsList(ListModel list);
    void registerComponent(Component component);
    void hideElements(boolean flag);
    void createGUI();
}