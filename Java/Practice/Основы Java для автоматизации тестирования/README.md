# [Основы Java для автоматизации тестирования](https://stepik.org/course/119500/syllabus)

## 1. Первые программы на Java

### 1.1 Знакомство с Java

❓*К какой категории языков программирования можно отнести язык Java?*
```
Объектно-ориентированный
```

❓*Как сокращенно называется абстрактная вычислительная машина, которая имеет свой набор команд и систему управления памятью?*

```
JVM
```

❓*Как между собой связаны JVM, JDK и JRE?*

```
JVM исполняет программы, JRE предоставляет среду для исполнения, а JDK позволяет разработать программу
```

❓*Какое из преимуществ Java позволяет JDK более свежей версии запускать код, скомпилированный более поздней версией?*

```
Обратная совместимость
```

### 1.2 Установка JDK на Windows

❓*Что из себя представляет JDK?*

```
Комплект разработчика приложений на языке Java
```

❓*Какие компоненты входят в состав JDK?*

```
Компилятор, утилиты, исполнительная система, библиотека классов, документация
```

### 1.3 Ключевые слова

[Ссылка](https://stepik.org/lesson/730744/step/1?unit=732275)

❓*Для каких целей используются ключевые слова?*

- [x] Для обозначения примитивных типов, алгоритмических конструкций ветвления и циклов, модификаторов доступа
- [x] При многопоточном программировании
- [ ] Для обозначения имен переменных
- [x] Для объявления, импорта, создания, возврата, вызова методов

❓*Какие из ключевых слов зарезервированы, но не используются в Java?*

- [x] goto
- [ ] var
- [x] const
- [ ] try

❓*Какое из перечисленных слов относится к литералам, а не к ключевым словам?*

```
null
```

❓*Какие из перечисленных ключевых слов используются для описания циклов?*

- [x] for
- [ ] switch
- [x] while
- [x] do

❓*Какие из перечисленных ключевых слов используются в качестве модификаторов доступа Java?*

- [x] private
- [x] protected
- [ ] default
- [x] public

### 1.4 Компиляция и запуск

❓*Выберите вариант расширения файла с исходным кодом.*

```
.java
```

❓*Выберите вариант расширения файла с байт-кодом.*

```
.class
```

### 1.5 Установка IDE

❓*Выберите наиболее полное описание интегрированной среды разработки.*

```
Система, содержащая инструменты разработки, отладки, сборки, рефакторинга, а также компилятор и интерпретатор
```

❓*Какие из перечисленных IDE наиболее популярны для разработки на Java?*

- [x] NetBeans
- [x] IntelliJ IDEA
- [ ] CodeLite
- [x] Eclipse
- [ ] CodeBlocks

❓*Что входит в функции IDE?*

- [x] Отладка кода
- [x] Компиляция исходного кода
- [x] Исполнение кода
- [x] Рефакторинг исходного кода

### 1.6 Компиляция и запуск приложения. IDE

❓*Что произойдёт в результате компиляции и выполнения следующего кода?*
```java
public class Test {
	public static void main(String[] args) { 
		println("Hello student!"); 
	} 
}
```

```
Ошибка компиляции
```

❓*Что произойдёт в результате компиляции и выполнения следующего кода?*

```java
public class Test { 
	static public void main(String[] args) {
		 System.out.println("Hello world!"); 
	} 
}
```

```java
Hello world!
```

❓*Что означает иконка красного квадратика в консоли IDE?*
![](https://ucarecdn.com/1945d9e6-47ce-4156-b36a-30c40c0303cd/)

```
Приложение работает
```

### 1.7 Забегая вперед и поясняя увиденное

[Ссылка](https://stepik.org/lesson/733076/step/1?unit=734597)

### 1.8 Практика

❓*Напишите программу, которая будет выводить на экран надпись "Да пребудет с тобой сила, юный падаван!" (кавычки печатать не надо).*

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Да пребудет с тобой сила, юный падаван!");

    }

}
```

❓*Напишите программу, которая прочтет строку из `System.in` и выведет сообщение: "Привет, _прочитанная строка_".
Если во входной строке несколько слов, нужно напечатать их все.*

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        String str = scanner.nextLine(); 
        System.out.println("Привет, " + str);
    }
}
```

## 2. Типы данных

### 2.1 Переменные и типы данных в Java

❓*Область действия переменной:*

```
Ограничена блоком кода, в котором она объявлена
```

❓*Какое значение хранит по умолчанию переменная, объявленная в теле метода?*

```
Никакое. Такую переменную обязательно надо проинициализировать.
```

❓*В стеке хранится лишь адрес ячейки памяти, которая находится в куче для:*

```
Ссылочной переменной
```

### 2.2 Примитивы

❓*Выберите примитивные целочисленные типы данных:*

- [x] short
- [ ] data
- [x] long
- [ ] integer
- [x] byte
- [x] int

❓*Выберите варианты правильного использования знака подчёркивания в представлении литералов:*

- [ ] int m6 = 5_000_000_;
- [x] int m5 = 0_10;
- [x] int m4 = 5_000_000;
- [x] double m1 = 5_000_000.75;
- [ ] int m = 0b_1010;
- [ ] long m2 = _5_000_000;

❓*Размер типа данных short в битах составляет:*

```
16
```

❓*Выберите правильные способы присвоения значения:*

- [ ] int i = _78;
- [x] byte b = 1_____14;
- [x] byte a = 0b0001_1110;
- [ ] short s = 46_;

### 2.3 Операторы

❓*Что будет отображено в результате выполнения следующего кода?*
```java
class Main { 
	public static void main(String[] args) { 
		System.out.println(12345 + 5432l); 
	} 
}
```

```
17777
```

❓*Что будет отображено в результате выполнения следующего кода?*
```java
class PrintTest { 
	public static void main(String[] args) { 
			System.out.println("2 + 2 = " + 2 + 2); 
	} 
}
```

```
2 + 2 = 22
```

❓*Какие строки кода вернут истину (true) в качестве результата для следующих переменных?*
```
int a = 10; 
int b = 20;
```

- [ ] System.out.println(a > 20 && b > 10);
- [ ] System.out.println(! (b > 10));
- [x] System.out.println(! (a > 20));
- [x] System.out.println(a > 20 || b > 10);

❓*Какие строки кода будут скомпилированы без ошибок для следующих переменных?*
```java
String s = "Hello"; 
long l = 99; 
double d = 1.11; 
int i = 1; int j = 0;
```
  
- [ ] j = i << s;
- [x] j = i << j;
- [x] j = i << l;
- [ ] j = i << d;

❓*Что будет отображено в результате выполнения следующего кода?*
```java
class TestOperationBinary { 
	public static void main(String[] args) {
		 System.out.println(010 | 4); 
	} 
}
```

```
12
```

❓*Выберите метод класса **Math,** который производит округление до меньшего значения.*

```
floor
```

❓*Выберите метод класса **Math,** который возвращает значение квадратного корня.*

```
sqrt
```

### 2.4 Приведение типов

❓*Что из перечисленного является корректным выражением?*

- [x] double d = 555d;
- [x] int i = 1 / 3;
- [ ] float f = 1.45;
- [x] float f = 1 / 2;

❓*Скомпилируется ли код?*
```java
public class TestCompile { 
	public static void main(String[] args){ 
		long x = 5; long y = 2; byte b = (byte) x / y; 
	} 
}
```

```
Нет
```

### 2.5 Ссылочные типы

❓*Специальная область памяти, которая представляет собой коллекцию ссылок на объекты класса String называется:*

```
Пул строк
```

❓*Объекты в Java размещаются и хранятся в:*

```
Объекты в Java размещаются и хранятся в:
```

### 2.6 Конвенция именования в Java

❓*Выберите допустимые имена идентификаторов:*
  
- [x] string1
- [ ] open-flag
- [ ] numberStudents&Juniors
- [ ] field#
- [x] firstMoney
- [x] INDEX_FOR_SEARCH

❓*Какие из следующих идентификаторов являются допустимыми?*

- [ ] 2int;
- [ ] int_#;
- [x] $int;
- [ ] #int;
- [x] _int;
- [x] _2_;

### 2.7 Практика

❓*Напишите программу, которая получает на вход с клавиатуры целое число. Это число представляет собой текущее суточное время как количество прошедших с полуночи секунд. Затем программа должна напечатать вывод экрана электронных часов для этого времени.
Входное значение задается через `System.in`. Выходное значение должно быть напечатано в `System.out`
Гарантируется, что входное значение — неотрицательное.
Формат вывода: `h:mm:ss` (возможные значения: [0:00:00; 23:59:59]).
Попробуйте решить задачу без использования `if` и циклов, даже если вы с ними уже знакомы.*

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int hours = (seconds / 3600) % 24;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = (seconds % 3600) % 60;

        String time = String.format("%d:%02d:%02d", hours, minutes, remainingSeconds);
        System.out.println(time);
    }
}
```

## 3. Условия и циклы

### 3.1 Понятие блока кода

❓*Какими характеристиками обладает любая переменная?*

- [x] Время жизни
- [ ] Вложенность
- [ ]Вариативность
- [x] Область видимости

❓*Какая переменная создается, когда выполнение программы входит в блок, и уничтожается, как только выполнение выходит из блока?*

```
Обе
```

❓*Верно ли, что особенностью языка Java является то, что переменные могут быть объявлены вне блока кода?*

```
Нет
```

### 3.2 Оператор условного перехода

❓*Будет ли скомпилирован код без ошибок?*
```java
int i = 0; 
if (i) { 
System.out.println("Hello"); 
}
```

```
С ошибкой
```

❓*Будет ли скомпилирован код без ошибок?*
```java
boolean b = true; 
boolean b2 = true; 
if (b == b2) { 
System.out.println("So true"); 
}
```

```
Без ошибок
```

❓*Будет ли скомпилирован код без ошибок?*
```java
int i = 1; 
int j = 2; 
if (i==1 ∥ j==2) 
	System.out.println("OK");
```

```
Без ошибок
```

### 3.3 Оператор выбора

❓*Какое из утверждений об операторе switch верное?*

```
Символьный литерал может использоваться как ключ в ветке case
```

❓*Каким будет результат выполнения следующего фрагмента кода?*
```java
String day = new String("SAT"); 
switch (day) { 
case "MON": 
case "TUE": 
case "WED": 
case "THU": System.out.println("Time to work"); 
break; 
case "FRI": System.out.println("Nearing weekend"); 
break; case "SAT": 
case "SUN": System.out.println("Weekend!"); 
break; 
default: System.out.println("Invalid day?"); 
}
```

```
Weekend!
```

### 3.4 Циклы

❓*Какие из перечисленных условий завершения верны для оператора for?*

- [ ] Если при первой проверке условия результат будет "ложь", то цикл выполнится один раз
- [x] Если результат выражения "истина", то программа выполняет тело цикла
- [x] Если результат выражения "ложь", то выполнение цикла завершается

❓*Что будет результатом выполнения следующего кода?*
```java
int num = 10;
while (++num > 20) { 
num++; 
} 
System.out.println(num);
```

```
11
```

❓*Верно ли, что тело оператора **while** может ни разу не исполниться, а тело оператора **do-while** всегда выполнится минимум один раз?*

```
Да
```

### 3.5 Практика

❓**
❓**
❓**
❓**
❓**
❓**
❓**
❓**

## 4. Массивы

### 4.1 Что такое массив

❓**
❓**
❓**
❓**
❓**
❓**
❓**
❓**
❓**
❓**
❓**
❓**
❓**
❓**
❓**
❓**
❓**
❓**
❓**
❓**
❓**
❓**
❓**