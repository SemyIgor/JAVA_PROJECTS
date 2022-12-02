# Коллекции JAVA. Введение.
## **План изучения:**
1. Тип, который может быть чем угодно
2. Обобщения
3. Массивы и их проблемы
4. Самая "простая" коллекция
5. Функционал
6. Куда двигаться дальше


__1) Тип Object - в него может быть положено значение любого типа.__
- Этот процесс называется упаковкой (запаковкой). 
- Обратный процесс (распаковка) заключается в извлечении данных определённого типа из объекта.
- Иерархия типов - любой тип всегда "ниже" типа Object
``` java
public class Lec03Task01 {
   public static void main(String[] args) {
      Object ob = 1;
      GetType(ob); // java.lang.Integer
      ob = 1.2;
      GetType(ob); // java.lang.Double
   }

   private static void GetType(Object ob) {
      System.out.println(ob.getClass().getName());
   }
}
```
__2) Если бы не было класса Object, то пришлось бы строить логические ветвления, как, например:__
``` java
public class Lec03Task01 {
   public static void main(String[] args) {
      Object ob = 1;
      GetType(ob); // java.lang.Integer
      ob = 1.2;
      GetType(ob); // java.lang.Double
      System.out.println(Sum(1, 2));
      System.out.println(Sum(1.0, 2));
      System.out.println(Sum(1, 2.0));
      System.out.println(Sum(1.2, 2.0));
   }

   private static Object Sum(Object a, Object b) {
      if (a instanceof Double && b instanceof Double) {
         return (Object) ((Double) a + (Double) b);
      } else if (a instanceof Integer && b instanceof Integer) {
         return (Object) ((Integer) a + (Integer) b);
      } else
         return 0;
   }
}
```

__3) Массивы и их проблемы:__
- Как увеличить размер массива, если количество элементов возросло? 
Создать временный массив большего размера, скопитовать в него данные из основного массива, 
ссылку основного массива адресуем на область данных вновь созданного массива, 
ссылку временного массива и старый основной массив удаляем.

__3) Коллекции__
`collection - это не то, что Collections`

- Set (HashSet, LinkedHashSet; <interface>SortedSet, <interface>NavigabledSet, TreeSet)
- List (<interface>List, ArrayList, Vector); `LinkedList`
- Queue (<interface>Queue; `LinkedList`; PriorityQueue)
- `Map`

__ArrayList__
Создание:
ArrayList<Integer> list1 = new ArrayList<Integer>();
ArrayList<Integer> list2 = new ArrayList<>();
ArrayList<Integer> list3 = new ArrayList<>(10);
ArrayList<Integer> list4 = new ArrayList<>(list3); // Создание путём копирования из другой коллекции

`Примечание: указание типа данных в коллекции называется `___`ОБОБЩЕНИЕМ`___ 

`Если коллекции не указать тип данных, то будет появляться предуереждение о ___'СЫРОМ'___ типе данных`

__Иерархия коллекций. List__

___List___ - пронумерованный набор элементов.

Пользователь этого интерфейса имеет точный контроль нед тем, где в списке вставляется каждый элемент.
Пользователь может обращаться к элементам по их целочисленному индексу (позиции в списке) и искать элементы в списке.
ArrayList, LinkedList - актуальные; Vector, Stack - устаревшие.

__Методы коллекций__
- add(args) - добавляет элемент в список (в т.ч. на нужную позицию)
- get(pos) - возвращает элемент из списка по указанной позиции
- indexOf(item) - первое вхождение элемента, если не найден, то -1
- lastIndexOf(item) - последнее вхождение элемента, если не найден, то -1
- remove(pos) - удаление элемента на указанной позиции и его возвращение (вывод)
- set(int pos, T item) - помещает (присваивает) значение item элементу, который находится на позиции pos
- void sort(Comparator) - сортирует набор данных по правилу
- subList(int start, int end) - получение набора данных от позиции start до позиции end

__Коллекции. Функционал.__
- clear() - очистка списка
- toString() - конвертирует список в строку
- Arrays.asList() - преобразует массив в список
- containsAll(col) - проверяет включение всех элементов из коллекции
- removeAll(col) - удаляет элементы, имеющиеся в коллекции
- retainAll(col) - оставляет элементы, имеющиеся в коллекции
- toArray() - конвертирует список в массив Object'ов
- toArray(type array) - конвертирует список в массив type
- List.copyOf(col) - возвращает копию списка на основе имеющегося
- List.of(item1, item2,...) - возвращает неизменяемый список (его элементы будет нельзя изменить)

__Итератор__

Получение итератора с целью более гибкой работы с данными URL
Интерфейс Iterator<E>. Итератор коллекций. Iterator занимает место Enumeration в Java Collections Framework. Итераторы отличаются от перечислений двумя способами:
Итераторы позволяют вызывающей стороне удалять элементы из базовой коллекции во время итерации с четко определенной семантикой.
hasNext(), next(), remove()
ListIterator<E> URL
hasPrevious(), E previous(), nextIndex, previousIndex(),set(E e), add(E e)