package com.org.sample.dinamicarray;

class MyArrayList {
    private int[] storage;
    private int index;

    public MyArrayList() {
        this.storage = new int[2];
        this.index = 0;
    }

    public void append(int item) {
        if (this.storage.length == this.index) {
            int[] temp = new int[2 * this.storage.length];
            System.arraycopy(this.storage, 0, temp, 0, this.storage.length);
            this.storage = temp;
        }

        this.storage[this.index] = item;
        this.index++;
    }

    public int getIndex() {
        return this.index;
    }

    public int findElement(int item) {
        for (int i = 0; i < this.index; i++) {
            if (this.storage[i] == item) {
                return i;
            }
        }
        return -1; // Если элемент не найден, возвращаем -1.
    }

    public void removeByIndex(int index) {
        if (index < 0 || index >= this.index) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        for (int i = index; i < this.index - 1; i++) {
            this.storage[i] = this.storage[i + 1];
        }

        this.index--;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < this.index; i++) {
            sb.append(String.format("%d ", this.storage[i]));
        }
        sb.append(']');
        return sb.toString();
    }
}
