package ru.itpark;

public class ArrayList implements List {

<<<<<<< HEAD
  @Override
  public void add(Object element) {

  }

  @Override
  public void addToBegin(Object object) {

  }

  @Override
  public Object get(int index) {
    return null;
  }

  @Override
  public void remove(Object object) {

  }

  @Override
  public int indexOf(Object object) {
    return 0;
  }

  @Override
  public int size() {
    return 0;
  }

  @Override
  public Iterator iterator() {
    return null;
  }
=======
    Object objects[] = new Object[10];
    int count = 0;

    @Override
    public void add(Object element) {
        objects[count] = element;
        count++;
    }

    @Override
    public void addToBegin(Object object) {
        for (int i = count; i > 0; i--) {
            objects[i] = objects[i - 1];
        }
        count++;
        objects[0] = object;

    }

    @Override
    public Object get(int index) {
        return objects[index];
    }

    @Override
    public void remove(Object object) {
        for (int i = 0; i < count; i++) {
            if (object.equals(objects[i])) {
                for (; i < count - 1; i++) {
                    objects[i] = objects[i + 1];
                }
                count--;
                break;
            }
        }

    }

    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < count; i++) {
            if (object.equals(objects[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator {

        int n = 0;

        @Override
        public Object next() {
            if (n < count) {
                Object element = objects[n];
                n++;
                return element;
            } else return null;
        }

        @Override
        public boolean hasNext() {
            return n != count - 1;
        }
    }

>>>>>>> b132824fdb44c5855147292c2ce7c3215c9657fc
}
