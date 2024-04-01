package Homework;

class BubbleSort {
    public static void main(String args[]) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int а, Ь, t;
        int size;
        size = 10; // количество сортируемых элементов
        // Отобразить исходный массив
        System.out.print("Исходный массив:");
        for(int i=0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
        // Реализовать алгоритм пузырьковой сортировки
        for(а=0; а < size; а++)
            for (Ь=size-1; Ь > а; Ь--) {
                if(nums[Ь-1] > nums[Ь]) { // если требуемый порядок
                    t = nums[Ь-1];
                    nums[Ь-1] = nums[Ь];
                    nums[Ь] = t;
                } // следования не соблюдается,
            } // поменять элементы местами
        // Отобразить отсортированный массив
        System.out.print("Отсортированный массив:");
        for(int i=0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}
