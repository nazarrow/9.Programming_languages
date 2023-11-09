# JavaScript

*1. Создать переменную "item_1":*

```js
let item_1;
```

*2. Присвоить переменной "item_1" цифру 5:*

```js
item_1 = 5;
```

*3. Вывести в консоль "item_1":*

```js
console.log(item_1);
```

*4. Создать переменную "item_2":*

```js
let item_2;
```

*5. Присвоить переменной "item_2" цифру 3:*

```js
item_2 = 3;
```

*6. Вывести в консоль "item_2":*

```js
console.log(item_2);
```

*7. Создать переменную "item_3":*

```js
let item_3;
```

*8. Присвоить переменной item_3 сложение item_1 и item_2:*

```js
item_3 = item_1 + item_2;
```

*9. Вывести в консоль item_3:*

```js
console.log(item_3);
```

*10. Создать переменную “item_4”:*

```js
let item_4;
```

*11. Присвоить переменной item_4 строку “Yolochka”:*

```js
item_4 = 'Yolochka';
```

*12. Вывести в консоль item_4:*

```js
console.log(item_4);
```

*13. Вывести в консоль сложение item_3 и item_4:*

```js
console.log(item_3 + item_4);
```

*14. Вывести в консоль умножение item_3 и item_4:*

```js
console.log(item_3 * item_4);
```

*15. Создать переменную “item_5”:*

```js
let item_5;
```

*16. Присвоить переменной item_5 переменную item_3:*

```js
item_5 = item_3;
```

*17. Создать переменную item_6:*

```js
let item_6;
```

*18. Создать переменную item_6_type:*

```js
let item_6_type;
```

*19. Присвоить переменной item_6 значение 15:*

```js
item_6 = 15;
```

*20. Присвоить переменной item_6_type тип переменной item_6:*

```js
item_6_type = typeof (item_6);
```

*21. Вывести в консоль тип данных item_6 в виде — “item_6 == ”  item_6,  “item_6_type == ”  item_6_type:*

```js
console.log('item_6_type == ' + item_6_type, 'item_6 == ' + item_6);
```

*22. Создать переменную item_7 и в ней преобразовать item_6 в String:*

```js
let item_7 = String(item_6); // либо let item_7 = item_6.toString();
```

*23. Создать переменную item_7_type:*

```js
let item_7_type;
```

*24. Присвоить переменной item_7_type тип переменной item_7:*

```js
item_7_type = typeof (item_7);
```

*25. Вывести в консоль тип данных item_7 в виде — “item_7 == ”  item_7,  “item_7_type == ”  item_7_type:*

```js
console.log('item_7 == ' + item_7, 'item_7_type == ' + item_7_type);
```

*26. Создать переменную “age_1” и присвоить ей значение 10:*

```js
let age_1 = 10;
```

*27. Создать переменную “age_2” и присвоить ей значение 18:*

```js
let age_2 = 18;
```

*28. Создать переменную “age_3” и присвоить ей значение 60:*

```js
let age_3 = 60;
```

*29. Создать if в котором будите проверять значение переменной age_1:*

```js
if (age_1 == 10) {
  console.log("Success!");
};
```

*30. Если age_1 < age_2, вывести в консоль “You don’t have access cause your age is ” + age_1 + “ It’s less then ”:*

```js
if (age_1 < age_2) {
  console.log(
    "You dont have access cause your age is " +
    age_1 +
    " Its less then " +
    age_2
  );
}
```

*31. Если age_1 >=  age_2 и age_1 <  age_3, вывести в консоль “Welcome  !”:*

```js
else if (age_1 >= age_2 && age_1 < age_3) {
  console.log("Welcome  !");
}
```

*32. Если age_1  > age_3, вывести в консоль “Keep calm and look Culture channel”:*

```js
else if (age_1 > age_3) {
  console.log("Keep calm and look Culture channel");
}
```

*33. Иначе выводите “Technical work”:*

```js
else {
  console.log("Technical work");
}
```

## :exclamation: *Задания с разным количеством звездочек:* 

*Задание 1* :eight_spoked_asterisk::
- *Преобразовать написанный код в 26-33 пунктах в функцию, принимающую на вход возраст;*
- *Вывести в консоль результат работы функции с возрастами 17, 18, 61:*
>Пример: const checkAge = function(age) {Ваши преобразования}

```js
const checkAge = function (age) {
  if (age < age_2) {
    console.log(
      " You dont have access cause your age is " +
      age +
      " Its less then " +
      age_2
    );
  } else if (age >= age_2 && age < age_3) {
    console.log("Welcome  !");
  } else if (age > age_3) {
    console.log("Keep calm and look Culture channel");
  } else {
    console.log("Technical work");
  }
};
checkAge(17);
checkAge(18);
checkAge(61);
checkAge('AGE');
```

*Задание 2* :eight_spoked_asterisk::
- *Преобразовать задание 1 таким образом, чтобы первым делом в функции проверялся тип данных. И если он не Number - кидалась ошибка:*

```js
const checkAge1 = function (age1) {
  if (typeof age1 == "number") {
    if (age1 < age_2) {
      console.log(
        " You dont have access cause your age is " +
        age1 +
        " Its less then " +
        age_2
      );
    } else if (age1 >= age_2 && age1 < age_3) {
      console.log("Welcome  !");
    } else if (age1 > age_3) {
      console.log("Keep calm and look Culture channel");
    } else {
      console.log("Technical work");
    }
  } else console.log("This data type is not a number");
};
checkAge1(17);
checkAge1(18);
checkAge1(61);
checkAge1("Number");
```

*Задание 3* :eight_spoked_asterisk::eight_spoked_asterisk::
- *Преобразовать задание 2 таким образом, чтобы значение '2' (строка в которой лежит ТОЛЬКО ЦИФРА) пропускалось, преобразовываясь в number:*

```js
const checkAge2 = function (age2) {
  if (+age2) {
    if (age2 < age_2) {
      console.log(
        " You dont have access cause your age is " +
        age2 +
        " Its less then " +
        age_2
      );
    } else if (age2 >= age_2 && age2 < age_3) {
      console.log("Welcome  !");
    } else if (age2 > age_3) {
      console.log("Keep calm and look Culture channel");
    } else {
      console.log("Technical work");
    }
  } else console.log("Enter your age using numbers!");
};
checkAge2(17);
checkAge2(18);
checkAge2(61);
checkAge2("Number");
```

*Задание 4* :eight_spoked_asterisk::eight_spoked_asterisk::eight_spoked_asterisk::
- *Преобразовать задание 3 таким образом, чтобы возраст вводился используя функцию prompt в привязанной верстке:*

```html
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="./HW_1.js"></script>
    <title>Document</title>
</head>

<body>

</body>

</html>
```

```js
const checkAge3 = function (age3) {
  if (+age3) {
    if (age3 < age_2) {
      alert(
        " You dont have access cause your age is " +
        age3 +
        " Its less then " +
        age_2
      );
    } else if (age3 >= age_2 && age3 < age_3) {
      alert("Welcome  !");
    } else if (age3 > age_3) {
      alert("Keep calm and look Culture channel");
    } else {
      alert("Technical work");
    }
  } else {
    alert("Enter your age using numbers!");
  }
};
checkAge3(17);
checkAge3(18);
checkAge3(61);
checkAge3("Number");
let agePrompt = prompt("Enter your age");
checkAge3(agePrompt);
```




