package list;

public interface ListInterface {
    /**
     * добавляет объект на указанную позицию (index)
     * @param obj объект
     * @param index индекс элемента
     */
     void add(Object obj, int index);

    /**
     * удаляет элемент с указанной позиции (index)
     * @param index индекс элемента
     */
    void remove(int index);

    /**
     * находит и возвращает элемент по индексу (index)
     * @param index индекс элемента
     * @return
     */
    int get(int index);

    /**
     *
     * @return размер списка
     */
    int size();

}
