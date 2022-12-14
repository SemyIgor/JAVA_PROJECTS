``` java
Map<Integer, String> db = new HashMap<>();
db.putIfAbsent(key: 1, value: "один");
db.put(key: 2, value: "два");
db.put(key: null, value: "!null");
System.out.println(db); // {null = !null, 1 = один, 2 = "два"}
System.out.println(db.get(key: 44)); 
// db.remove(null);
System.out.println(db); // {1 = один, 2 = два}
System.out.println(db.containsValue(value: "один")); // true
// System.out.println(db.containsValue(1)); // false
// System.out.println(db.containsKey("один")); // false
System.out.println(db.containsKey(key: 1)); // true
System.out.println(db.keySet());
System.out.println(db.values());
```
## HashMap

__put(K,V)__ - добавить пару или изменить значение (если такой ключ имеется)
__putIfAbsent(K,V)__ - произвести добавление, если ключ не найден
__get(K)__ - получить значение по заданному ключу
__remove(K)__ - удалить пару по указанному ключу
__containsValue(V)__ - проверяет наличие данного значения в коллекции
__containsKey(V)__ - проверяет наличие ключа
__keySet()__ - возвращает множество ключей
__values()__ - возвращает набор значений