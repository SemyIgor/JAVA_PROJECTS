# API - это, в большинстве случаев, сторонний сервис, позволяющий взаимодействовать с ним.
Например: 
- API Телеграм-бота
- API сервисов ВКонтакте
- API Яндекса (карты, словари и т.д.)
- API множества других серверов, например, погода в Британии и т.д.
- API Java - это возможности, которые разработчики языка предлагают для работы с его функционалом.
   1. Строки
   2. Работа с файловой системой
   3. Логирование
   4. Импорт
   5. Xml

Строки
Создать строку из 1 млн. плюсиков. Как?

## Основные методы строк:
- concat() - объединение строк
- valueOf() - преобразует Object в строковое представление (завязан на toString())
- join() - объединяет набор строк в одну с учётом разделителя
- charAt() - получение символа по индексу
- indexOf() - первый индекс входжения подстроки
- lastIndexOf() - последний индекс вхождения подстроки
- startsWith() / endsWith() - определяет, начинается / заканчивается ли строка с подстроке / подстрокой
- replace() - замена одной подстроки на другую
- trim() - удаляет начальные и конечные пробелы
- substring() - возвращает подстроку (см. аргументы)
- toLowerCase() / toUpperCase() - возвращает новую строку в нижнем / верхнем регистре
- compareTo() - сравнивает две строки
- equals() - сравнивает строки с учётом регистра
- equalsIgnoreCase() - сравнивает строки без учёта регистра
-regionMatches() сравнивает подстроки в строках

`Много преобразований (если собираем материал) - StringBuilder`
`Много изменений (если используем уже собранный) - String`

## Работа с файловой системой:
### File <имя> = new File(<полный путь к файлу>);
``` Java
File f1 = new File("file.txt");
File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
```

## Ошибки при работе с файловой системой

``` java
public class program04 {
   public static void main(String[] args) {
      РАБОТА С ФАЙЛОВОЙ СИСТЕМОЙ. ОШИБКИ.
      try {
         // Код, в котором может появиться ошибка
      } catch (Exception e) {
         // Обработка, если ошибка случилась
      } finally {
         // Код, который выполнится в любом случае
      }
   }
}
```
## ОСНОВНЫЕ МЕТОДЫ РАБОТЫ С ФАЙЛОВОЙ СИСТЕМОЙ

- isHidden() - возвращает истину, если каталог или файл являются скрытыми
- length() - возвращает размер файла в байтах
- lastModified() - возвращает время последнего изменения файла или каталога
- list() - возвращает массив файлов и подкаталогов, которые находятся в каталоге
listFiles() - возвращает массив файлов и подкаталогов, которые находятсяв определённом каталоге
- mkdir() - создаёт новый каталог
- renameTo(File dest) - переименовывает файл или каталог

## РАБОТА С БИНАРНЫМИ ФАЙЛАМИ

``` java
package Lecture02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// ЧТЕНИЕ И ЗАПИСЬ БИНАРНЫХ ФАЙЛОВ
public class program06 {
   static ByteOrder bOrder = ByteOrder.LITTLE_ENDIAN;
   static Map<String, String> data = new HashMap<>();
   static Charset charset = StandardCharsets.UTF_8;

   static void loadFile(String path) throws IOException {
      try (InputStream stream = new BufferedInputStream(new FileInputStream(path))) {
         int n = readInt(stream);
         int b1;
         int b2;
         byte binWord[];
         byte binText[];
         for (int i = 0; i < n; i++) {
            binWord = new byte[readInt(stream)];
            binText = new byte[readInt(stream)];
            b1 = stream.read(binWord);
            b2 = stream.read(binText);
            if (b1 != binWord.length || b2 != binText.length)
               throw new IOException("Error read file");
            data.put(new String(binWord, charset),
                  new String(binText, charset));
         }
      }
   }

   static void saveFile(String path) throws IOException {
      if (data.size() == 0)
         throw new IOException("Nothing to write");
      try (OutputStream stream = new BufferedOutputStream(new FileOutputStream(path, false))) {
         writeInt(stream, data.size());
         byte binWord[];
         byte binText[];
         for (Entry<String, String> entry : data.entrySet()) {
            binWord = entry.getKey().getBytes(charset);
            writeInt(stream, binWord.length);
            binText = entry.getValue().getBytes(charset);
            writeInt(stream, binText.length);
            stream.write(binWord);
            stream.write(binText);
         }
      }
   }

   static void delete(String word) {
      data.remove(word);
   }

   static void add(String word, String text) throws Exception {
      if (data.get(word) != null)
         throw new Exception("Word already exist");
      data.put(word, text);
   }

   static String find(String word) {
      String out = data.get(word);
      if (out == null)
         return "не найдено";
      else
         return out;
   }

   static int readInt(InputStream in) throws IOException {
      byte out[] = new byte[4];
      int i = in.read(out);
      if (i != 4)
         throw new IOException("Error read file");
      return ByteBuffer.wrap(out).order(bOrder).getInt();
   }

   static void writeInt(OutputStream out, int num) throws IOException {
      ByteBuffer dbuf = ByteBuffer.allocate(4);
      dbuf.order(bOrder).putInt(num);
      out.write(dbuf.array());
   }

   public static void main(String[] args) {
      String file = "test.bin";
      // create file

      try {
         add("key1", "значение 1");
         add("key2", "значение 2");
         add("key4", "значение 3");
         saveFile(file);
      } catch (Exception e) {
         e.printStackTrace();
      }
      // read file

      try {
         loadFile(file);
         String key1 = "key1";
         String key2 = "key2";
         String key3 = "key3";
         System.out.printf("%s: %s\n", key1, find(key1));
         System.out.printf("%s: %s\n", key2, find(key2));
         System.out.printf("%s: %s\n", key3, find(key3));
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
```

## ЛОГИРОВАНИЕ
 
 ## `Логи содержат системную информацию работы программного или аппаратного комплекса`
 ## `В них записываются действия разного приоритета от пользователя или программного продукта`
 ## `Процесс ведения логов называют "логированием" (журналированием)`

 ** Основы использования **
 ``` java
//  Использование
Logger logger = Logger.getLogger()

// Уровни важности
INFO, DEBUG, ERROR, WORNING etc.

// Вывод
ConsoleHandler info = new ConsoleHandler();
log.addHandler(info);

// Формат вывода: структурированный, абы как
XMLFormatter, SimpleFormatter
 ```

Каждую задачу в ДЗ оформлять в отдельный класс !!!
