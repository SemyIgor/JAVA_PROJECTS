# ИСПОЛЬЗУЕМЫЕ МЕТОДЫ

## Seminar01
1. HWTask01
   - Scanner
   - nextInt
   - close
   - ФАКТОРИАЛ
2. HWTask02 (ПРОСТЫЕ ЧИСЛА)
3. HWTask03  - КАЛЬКУЛЯТОР (без ЛОГГЕРА)
4. HWTask04  - ПРИМЕРЫ С ПРОПУЩЕННЫМИ ЦИФРАМИ (сложение)
   - Scanner
   - nextLine
   - toCharArray()
   - Character.getNumericValue() - Убирает спецсимволы Unicode, символ переводит в цифру

## Seminar02
1. Logger.java  
   - Шаблон использования (требует доработки)
2. Main.java
   - несколько классов в одном файле с Main
   - equals + new StringBuilder(string) + reverse() + toString())
   - __Task01__
   - Scanner(System.in)
   - nextInt()
   - next()
   - charAt()
   - close()
   - append()
   - __Task02__
   - Scanner
   - next()
   - string.toCharArray()
   - append
   - __Task04__
   - StringBuilder()
   - for
   - try...catch
   - __Task05__
   - throws IOException
   - ArrayList
   - Logger
   - getLogger
   - class.getName
   - Arrays.asList()
   - file.list()
   - NullPointerException
   - try...catch
   - FileOutputStream()
   - getFiles
   - getBytes
   - fileOutputStream.close()
   - level
3. HWTask01.java
   - try...catch
   - File
   - Scanner
   - hasNextLine
   - nextLine
   - startsWith
   - close
4. HWTask02.java 
   - int[] array
   - Logger
   - getLogger
   - class.getName
   - FileHandler
   - addHandler
   - SimpleFormatter
   - setFormatter
   - for
   - if
   - logger.log
   - Arrays.toString
   - level
5. HWTask03.java 
   - read json (требует доработки)
6. HWTask04.java
   - throws IOException
   - try...catch
   - Logger
   - get.logger
   - class.getName
   - FileHandler
   - SimpleFormatter
   - setFormatter
   - logger.log
   - Scanner
   - nextLine
   - str.indexOf()
   - s.substring
   - Float.parseFloat()

## Seminar03
1. Task01.java: 
   - random()
   - ArrayList<>
   - Collections.sort()
2. Task02.java:
   - ArrayList<>
   - size()
   - frequency()
   - get()
   - equals()
   - contains()
   - add
3. Task03.java:
   - то же, что и Task02, но со счётчиком
4. Task04.java:
   - ArrayList<>
   - add
   - String.valueOf()
   - Iterator<>
5. Main.java:
   - Запуск внешних классов   
6. HWTask01.java: СОРТИРОВКА СЛИЯНИЕМ
   - ArrayList<>
   - GenerateRandInteger
   - someList.stream().mapToInt(Integer::intValue).toArray();
   - Arrays.copyOf
   - Random
   - nextInt
7. HWTask02.java: произвольный список целых чисел, удалить из него четные числа
   - Iterator
   - .hasNext()
   - .next()  
   - .remove()
   - Random
   - nextInt
8. HWTask03.java: Удалить повторяющиеся элементы списка
   - ArrayList
   - .add()
   - Iterator
   - .next()
   - .hasNext()
   - Collections
   - Collections.frequency()

## Seminar04
1. Calculator.java - набор операций для простейшего калькулятора
2. FirstProblem.java
   - ArrayList
   - .add()
   - Date
   - .getTime()
   - LinkedList<Integer>
   - .add()
3. Main.java - запускающий файл
4. SecondProblem.java разбирает введенную строку~число
   - LinkedList
   - .add()
   - .set()
   - .size()
   - .remove()
   - Scanner   
   - .next()
   - .close()
   - String[]
   - .split()
   - .equals()
   - Random
   - .nextInt()
   - Integer.parseInt()
   - выход по "Q"
5. ThirdProblem.java - принимает, запоминает и удаляет строки
   - Scanner
   - .next()
   - .close()
   - .equals()
   - Stack
   - .push()
   - .size()
   - .elementAt()
   - .pop()
6. HWTask01.java - __переворачивает список__
   - LinkedList
   - .add()
   - .peek()
   - .pollLast()
   - String
7. HWTask02.java - реализуем набор команд для очереди
   - LinkedList
   - .add()
   - .remove()
   - .get()
   - Scanner
   - String
   - .trim()
   - .equals()
   - .startsWith()
   - .substring()
   - .indexOf()
   - System.out.print("\033[H\033[J"); __ОЧИСТКА КОНСОЛИ__
7. HWTask03.java - калькулятор с возможностью отмены
   - String
   - .indexOf()
   - .equals()
   - Stack
   - .push()
   - .isEmpty()
   - .pop()
   - System.out.print("\033[H\033[J"); __ОЧИСТКА КОНСОЛИ__
   - do {} while с выходом по "q" или "Q"
   - Scanner
   - .nextLine()
## Seminar05
1. Main.java - запускает внешние файлы
2. FirstProblem.java - Структура для хранения номеров паспортов
   - Map
   - Entry
   - .getValue()
   - .getKey()
3. SecondProblem.java - __ИЗОМОРФНЫЕ СТРОКИ__   
   - String
   - .length()
   - .toCharArray()
   - HashMap
   - .containsKey()
   - .get()
   - .put()
4. ThirdProblem.java - разбить набор строк, разделить на слова, сгруппировать в группы по равному количеству букв в слове
   - TreeMap
   - .containsKey()
   - .get().add()
   - .put()
   - .entrySet()
   - __treeMap.put(s[i].length(), list);__
   - ArrayList
   - .add()
   - String[]
   - .split()
   - .length()
5. HWTask01.java - структуру телефонной книги
   - HashMap
   - .put()
   - .entrySet()
   - .getKey()
   - .getValue()
   - .equals()
   - __for (Map.Entry<String, String> clientsName : tf.entrySet())__
   - LinkedHashMap
   - .put()
   - String
6. HWTask02.java - количество повторений имён сотрудников из списка
   - ArrayList
   - .add()
   - HashMap
   - .containsKey()
   - .put()
   - .get()
   - __for (String name : namesList) {}__
   - Collections.sort()
   - Collections.reverse()
   - LinkedHashMap
   - __Цикл foreach внутри цикла foreach__
   - __for (Map.Entry<String, Integer> entry : employeeLinkedMap.entrySet()) {}__

