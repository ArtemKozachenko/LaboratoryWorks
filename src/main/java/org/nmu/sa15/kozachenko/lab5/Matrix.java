package org.nmu.sa15.kozachenko.lab5;

import java.util.List;
import java.util.Objects;

public class Matrix {
    private int row;
    private int column;
    private List<List<Integer>> list;
    private String author = "Kozachenko A.O.";

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setList(List<List<Integer>> list) {
        this.list = list;
    }

    public List<List<Integer>> getList() {
        return list;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return row == matrix.row &&
                column == matrix.column &&
                Objects.equals(author, matrix.author) &&
                Objects.equals(list, matrix.list);
    }
}
